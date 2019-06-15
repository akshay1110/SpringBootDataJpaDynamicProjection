package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.MyData;
import com.app.repo.ProductRepository.MyView;

@Component
public class AppRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

//		repo.saveAll(Arrays.asList(
//				new Product(1,"AA","P1","akshay",24.89),
//				new Product(2,"BB","P2","harish",36.9),
//				new Product(3,"CC","P3","ajay",42.89),
//				new Product(4,"DD","P4","rajesh",51.89),
//				new Product(5,"EE","P5","mahesh",65.89),
//				new Product(6,"FF","P6","rakesh",78.89)
//				))	;
		
		//repo.findByProdCostGreaterThan(50.0,MyData.class).forEach((p)->System.out.println(p.getProdId()+","+p.getProdCode()));

		repo.findByProdCostGreaterThan(50.0,MyView.class).forEach((p)->System.out.println(p.getProdCode()+","+p.getProdCost()));
	}

}
