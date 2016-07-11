package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model;
import view.View;

/**
 * Servlet implementation class StartGame
 */
@WebServlet("/StartGame")
public class StartGame extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartGame() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int minValue=(int) request.getAttribute(View.MIN_VALUE);
		int maxValue=(int) request.getAttribute(View.MAX_VALUE);
		Model model=new Model(minValue,maxValue);
	}

}
