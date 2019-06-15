package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	interface MyData{
		String getProdCode();
		Integer getProdId();
	}
	
	interface MyView{
		Double getProdCost();
		String getProdCode();
	}
	
	<T> List<T> findByProdCostGreaterThan(Double prodCost,Class<T> cls);
}
