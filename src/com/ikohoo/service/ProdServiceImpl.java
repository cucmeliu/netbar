package com.ikohoo.service;

import java.util.List;

import com.ikohoo.dao.ProdDao;
import com.ikohoo.domain.Product;
import com.ikohoo.factory.BasicFactory;

public class ProdServiceImpl implements ProdService {
	
	ProdDao dao = BasicFactory.getFactory().getInstance(ProdDao.class);

	@Override
	public List<Product> findAllProd() {
		return dao.getAllProd();
	}

	@Override
	public void addProd(Product prod) {
		dao.addProd(prod);
	}

	@Override
	public Product findProdById(String id) {
		return dao.findProdById(id);
	}

}
