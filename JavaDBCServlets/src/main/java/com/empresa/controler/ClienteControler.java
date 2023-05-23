package com.empresa.controler;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empresa.dao.ClienteDAO;
import com.empresa.model.Cliente;

/**
 * Servlet implementation class ClienteControler
 */
@WebServlet("/")
public class ClienteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    String action = request.getServletPath();
	    switch (action) {
		case "/add":
			addCliente(request,response);
			
			break;
		case "/update":
			updateCliente(request,response);
			
			break;


		default:
			listCliente(request,response);
			break;
		}//cierra switch
	    
	}//cierra doget

	private void listCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void updateCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void addCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String nombre=request.getParameter("nombre");
		String ciudad=request.getParameter("ciudad");
		float facturacion=Float.parseFloat(request.getParameter("facturacion"));
		Cliente cliente =new Cliente(id, nombre, ciudad, facturacion);
		ClienteDAO dao =new ClienteDAO();
		dao.insertCliente(cliente);
		if (facturacion < 100) {

	        // Mostrar aviso

	        request.setAttribute("mensaje", "La facturación debe ser mayor o igual a 100");

	        request.getRequestDispatcher("/aviso.jsp").forward(request, response);

	        return;

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
