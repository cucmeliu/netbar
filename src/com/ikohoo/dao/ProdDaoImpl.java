package com.ikohoo.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ikohoo.domain.Product;
import com.ikohoo.util.DaoUtils;


public class ProdDaoImpl implements ProdDao {

	public List<Product> getAllProd() {
		String sql = "SELECT * FROM product ";
		
		try {
			
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			return runner.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void addProd(Product prod) {

		String sql = "INSERT INTO product VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			runner.update(sql, prod.getProductId(), prod.getCategoryId(),prod.getProductName(), prod.getProductCode(),
					prod.getSpecs(), prod.getUnit(), prod.getMinInventory(), prod.isEnabled(),
					null, prod.getSalePrice(), prod.getRemark(), null,
					null, null, null, null,
					null, null, null, null,
					null, null, null, null,
					null, null);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public Product findProdById(String id) {
		String sql = "SELECT * FROM product WHERE productid=?";
		try {
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			return runner.query(sql, new BeanHandler<Product>(Product.class), id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
