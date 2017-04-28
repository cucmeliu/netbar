package com.ikohoo.service;

import java.util.List;

import com.ikohoo.domain.Product;

public interface ProdService {

	/**
	 * 查询所有商品
	 * @return
	 */
	List<Product> findAllProd();

	/**
	 * 添加商品记录
	 * @param prod
	 */
	void addProd(Product prod);

	/**
	 * 通过商品ID获取商品记录
	 * @param id
	 * @return
	 */
	Product findProdById(String id);

}
