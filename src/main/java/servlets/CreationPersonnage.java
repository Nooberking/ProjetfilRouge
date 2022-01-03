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
<<<<<<< HEAD
    Jeu jeu; 
=======
	Jeu jeu; 
>>>>>>> 8eff5dd874cdbec437578af8a099a1e07175eb2d
       
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
<<<<<<< HEAD
		 
	         
	        RequestDispatcher vue = request.getRequestDispatcher("WEB-INF/selectionPersonnage.jsp");
	       
	        vue.forward(request, response);
=======
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession maSession = request.getSession(); 
		if(maSession.getAttribute("jeu")== null) maSession.setAttribute("jeu", jeu); 
		jeu.setPersonnage(Personnage.createWarrior("Warrior"));
		RequestDispatcher vue = request.getRequestDispatcher("WEB-INF/selectionPersonnage.jsp");
		String nomPerso =request.getParameter("nom");
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
>>>>>>> 8eff5dd874cdbec437578af8a099a1e07175eb2d
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
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
=======
		doGet(request, response);
>>>>>>> 8eff5dd874cdbec437578af8a099a1e07175eb2d
	}

}
