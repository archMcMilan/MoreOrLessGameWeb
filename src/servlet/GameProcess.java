package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;
import view.View;

/**
 * Servlet implementation class GameProcess
 */
@WebServlet("/GameProcess")
public class GameProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Model game;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameProcess() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession gameSession = request.getSession();

		int userValue = new Integer(request.getParameter(View.USER_VALUE));
		game=(Model)gameSession.getAttribute(View.MODEL);
		if(game.getLeftBorder()<userValue && game.getRightBorder()>userValue){
			int answer=game.compareWithValue(userValue);
			if(answer==0){
				gameSession.setAttribute(View.ANSWER, View.END_GAME);
				response.sendRedirect(View.REDIRECT_LINK);
				return;
			}else if(answer==-1){
				gameSession.setAttribute(View.ANSWER, View.LESS);
				game.setLeftBorder(userValue);
				gameSession.setAttribute(View.MODEL, game);
			}else if(answer==1){
				gameSession.setAttribute(View.ANSWER, View.GREATER);
				game.setRightBorder(userValue);
				gameSession.setAttribute(View.MODEL, game);
			}
		}else{
			gameSession.setAttribute(View.ANSWER, View.INVALID_INPUT);
		}
		response.sendRedirect(View.REDIRECT_LINK);
		
	}

}
