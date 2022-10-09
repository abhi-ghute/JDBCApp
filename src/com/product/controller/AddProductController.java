package com.product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/addProduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AddProductDao dao = new AddProductDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean check = dao.addProduct(request);
		
		if(check) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Product added Successfully...');");
			out.println("</script>");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error please try again...');");
			out.println("</script>");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("SearchProduct.jsp");
		dispatcher.forward(request, response);
	}

}
