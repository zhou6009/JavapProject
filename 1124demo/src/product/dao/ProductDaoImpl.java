package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Product;
import util.BaseDao;

public class ProductDaoImpl {
	public Product findAll(String name) {

		try {

			Connection conn = BaseDao.getCon();
			PreparedStatement ps = conn.prepareStatement("select * from Product where name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			Product p = null;
			p = new Product();

			while (rs.next()) {

				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setListimg(rs.getString(4));
				p.setPrice(rs.getInt(5));
				p.setDiscountprice(rs.getInt(6));

				System.out.println(p);

			}
			return  p;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
