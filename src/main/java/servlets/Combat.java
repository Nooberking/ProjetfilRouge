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
import javax.swing.Action;

import ejbs.Actions;
import ejbs.Ennemy;
import ejbs.Jeu;

/**
 * Servlet implementation class Combat
 */
@WebServlet("/Combat")
public class Combat extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	Jeu jeu;
	
	private int tour = 0;
	public boolean start; 
	private boolean gameOver = false;
	private boolean startBattle = true; 
	private boolean battleOver = false;
	public String isEnnemy1;
	
	
	public int getTour() {
		return tour; 
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Combat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		start = true;
		HttpSession maSession = request.getSession(); 
		jeu.setFirstEnnemy(new Ennemy());
		jeu.setSecondEnnemy(new Ennemy()); 
		startBattle =true;
		battleOver = false; 
		
		
		maSession.setAttribute("firstEnnemy", jeu.getFirstEnnemy());
		maSession.setAttribute("secondEnnemy", jeu.getSecondEnnemy()); 
		maSession.setAttribute("start", start); 
		RequestDispatcher vue = request.getRequestDispatcher("WEB-INF/ChoixEnnemi.jsp");
		vue.forward(request, response);		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		HttpSession maSession = request.getSession();
		String resultat =""; 
	
		
		if (!gameOver)
		{   
			if (startBattle) 
			{
				startBattle = false; 
				tour ++; 
				isEnnemy1 =request.getParameter("ennemi").equals("ennemi1") ? "true" : "false"; 
				jeu.setFirstEnnemySelected(isEnnemy1.equals("true"));
				resultat = "En attente d'une action du joueur ..."; 
				
				maSession.setAttribute("tour", tour); 
				
			}
			else 
			{
				if (!battleOver)
				{ 
					if (maSession.getAttribute("isEnnemy1")!= null)isEnnemy1 =maSession.getAttribute("isEnnemy1").equals("ennemi1") ? "true" : "false";
					jeu.setFirstEnnemySelected(maSession.getAttribute("isEnnemy1").equals("true"));
					jeu.setNextAction(Actions.valueOf(request.getParameter("action")));
					resultat = jeu.tourJoueur(); 
					/*resultat += jeu.tourEnnemy();
					
					if (jeu.getPersonnage().getLifePoints() <= 0)
						{
						gameOver = true; 
						
						}
					else 
					{
						if(jeu.getFirstEnnemy().getLifePoints() <= 0 || jeu.getSecondEnnemy().getLifePoints() <= 0) 
							{
							battleOver =true; 
							
							}
					}*/
					
				}
				
			}
			
		}
		maSession.setAttribute("isEnnemy1", isEnnemy1);
		maSession.setAttribute("gameOver", gameOver); 
		maSession.setAttribute("battleOver", battleOver);
		maSession.setAttribute("resultat", resultat); 
		RequestDispatcher vue = request.getRequestDispatcher("WEB-INF/PageCombat.jsp");
		vue.forward(request, response);	
		
	}

}
