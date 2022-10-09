package com.product.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;


public class AddProductDao {

	Connection con = null;
	PreparedStatement ps = null;

	public boolean addProduct(HttpServletRequest request) {

		String query = "insert into product(productID, prooductName, weight, mfgDate, expDate, color, price, discount, category) values(?,?,?,?,?,?,?,?,?)";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, request.getParameter("productID"));
			ps.setString(2, request.getParameter("prooductName"));
			ps.setString(3, request.getParameter("weight"));
			ps.setString(4, request.getParameter("mfgDate"));
			ps.setString(5, request.getParameter("expDate"));
			ps.setString(6, request.getParameter("color"));
			ps.setString(7, request.getParameter("price"));
			ps.setString(8, request.getParameter("discount"));
			ps.setString(9, request.getParameter("category"));

			int check = ps.executeUpdate();

			if (check>0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
