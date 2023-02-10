package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String provincia = request.getParameter("provincia");
		String genero = request.getParameter("genero");
		
		try {
			out.print("<html>");
			out.print("<head><title>Servlet</title>");
			out.print("<body>");
			out.print("<h1 style='color:red;'>Tu datos son</h1>");
			out.print("<h3>Tu nombre es: "+nombre+"</h3>");
			out.print("<h3>Tu provincia es: "+provincia+"</h3>");
			out.print("<h3>Tu género es: "+genero+"</h3>");
			out.print("<h3>Me gusta el código</h3>");
			out.print("<a href='./index.jsp'>Volver al formulario</a>");
			out.print("</body>");
			out.print("</html>");
		} finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
