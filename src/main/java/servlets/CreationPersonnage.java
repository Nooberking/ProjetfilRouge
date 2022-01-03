package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ejbs.Jeu;
import ejbs.Personnage;

/**
 * Servlet implementation class CreationPersonnage
 */
@WebServlet("/CreationPersonnage")
public class CreationPersonnage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
    Jeu jeu; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationPersonnage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
	         
	        RequestDispatcher vue = request.getRequestDispatcher("WEB-INF/selectionPersonnage.jsp");
	       
	        vue.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession maSession = request.getSession();
		if(maSession.getAttribute("jeu")== null) maSession.setAttribute("jeu", jeu);
		RequestDispatcher vue = request.getRequestDispatcher("WEB-INF/selectionPersonnage.jsp");
		String nomPerso =request.getParameter("pseudo");
        String choix= request.getParameter("choixPerso");
        if(choix =="guerrier")
        {
            jeu.setPersonnage(Personnage.createWarrior(nomPerso));
        }
        if(choix=="mage")
        {
            jeu.setPersonnage(Personnage.createWizard(nomPerso));
        }
        vue.forward(request, response);
	}

}