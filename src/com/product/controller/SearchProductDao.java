package com.product.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchProductDao {

	Connection con = null;
	PreparedStatement ps = null;
	
	public ProductDto search(String productID) {
		
		ProductDto product = new ProductDto();
		
		String query = "select * from product where productID =?";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, productID);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				
				product.setProductID(rs.getString("productID"));
				product.setProductName(rs.getString("prooductName"));
				product.setWeight(rs.getString("weight"));
				product.setMfgDate(rs.getString("mfgDate"));
				product.setExpDate(rs.getString("expDate"));
				product.setPrice(rs.getString("price"));
				product.setDiscount(rs.getString("discount"));
				product.setColor(rs.getString("color"));
				product.setCategory(rs.getString("category"));
				
				return product;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
}
