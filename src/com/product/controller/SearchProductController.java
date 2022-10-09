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
 * Servlet implementation class SearchProductController
 */
@WebServlet("/searchProduct")
public class SearchProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SearchProductDao dao = new SearchProductDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDto product = dao.search(request.getParameter("productID"));
		
		if(product.getProductID() != null) {
			request.setAttribute("product",product);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ShowProduct.jsp");
			dispatcher.forward(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error please try again...');");
			out.println("location='SearchProduct.jsp';");
			out.println("</script>");
		}
		
	}


}
