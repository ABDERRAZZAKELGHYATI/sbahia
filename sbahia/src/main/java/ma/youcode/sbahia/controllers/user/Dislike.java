package ma.youcode.sbahia.controllers.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.youcode.sbahia.impldao.ProductDaoImpl;

/**
 * Servlet implementation class Dislike
 */
@WebServlet("/dislike/*")
public class Dislike extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDaoImpl productDaoImpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dislike() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get Product id
		int productID = Integer.parseInt(request.getParameter("id"));
		
		// Instantiate ProductDaoImpl
		productDaoImpl = new ProductDaoImpl();
		
		// Delete that product
		productDaoImpl.dislike(productID);
		
		// redirect to admin page
		response.sendRedirect("/sbahia/products.jsp");
	}


}
