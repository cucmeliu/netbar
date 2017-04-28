package com.ikohoo.dao;

import java.util.List;

import com.ikohoo.domain.Product;

public interface ProdDao {

	/**
	 * 列出所有商品
	 * @return
	 */
	List<Product> getAllProd();

	/**
	 * 添加商品
	 * @param prod
	 */
	void addProd(Product prod);

	/**
	 * 按编号查找商品
	 * @param id 
	 * @return
	 */
	Product findProdById(String id);

}
