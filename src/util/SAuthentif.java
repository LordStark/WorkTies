package util;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class STraitement
 */
@WebServlet("/SAuthentif")
public class SAuthentif extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SAuthentif() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//reste a exploiter la base de données pr l'authentif
		
		String login=request.getParameter("pseudo");
		String psswd=request.getParameter("mdp");
		PrintWriter out=response.getWriter();
		
		if(login.equals("toto") && psswd.equals("toto")){
			RequestDispatcher rd=request.getRequestDispatcher("WTMainPage.jsp");
			rd.forward(request, response);
		}else{	
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
	}

}
