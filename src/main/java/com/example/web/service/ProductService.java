package com.example.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.mapper.ProductMapper;
import com.example.web.model.ProductModel;


@Service
public class ProductService {
	@Autowired
	ProductMapper mapper;
	
	public List<ProductModel> getProduct(){
		try {
			return mapper.getProduct();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
}
