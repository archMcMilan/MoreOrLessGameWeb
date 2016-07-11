package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import view.View;

/**
 * Servlet implementation class GameProcess
 */
@WebServlet("/GameProcess")
public class GameProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		int minValue = (int)session.getAttribute(View.MIN_VALUE);
		int maxValue = (int)session.getAttribute(View.MAX_VALUE);
		
		int hiddenValue = (int)session.getAttribute(View.HIDDEN_VALUE);
		int userValue = new Integer(request.getParameter(View.USER_VALUE));
		
		if(userValue==hiddenValue){
			
		}

	}

}
