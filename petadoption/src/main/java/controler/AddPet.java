package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pet;

/**
 * Servlet implementation class AddPet
 */
@WebServlet("/addPet")
public class AddPet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pet p = new Pet();
		PetHelper helper = new PetHelper();
		p.setPetType(request.getParameter("petType"));
		p.setPetBreed(request.getParameter("petBreed"));
		p.setPetAge(Integer.valueOf( request.getParameter("petAge")));
		helper.persist(p);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
