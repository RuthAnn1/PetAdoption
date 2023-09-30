package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pet;

/**
 * Servlet implementation class deletePet
 */
@WebServlet("/deletePet")
public class deletePet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletePet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PetHelper helper = new PetHelper();
		String name = request.getParameter("name");
		Pet deleteable = helper.searchPetByName("name");
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

	}

}
