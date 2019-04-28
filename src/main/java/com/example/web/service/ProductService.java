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
	
	public List<ProductModel> getCategory(){
		try {
			return mapper.getCategory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
	
	public List<ProductModel> getProductByCaterogy(String category_id){
		try {
			return mapper.getProductByCaterogy(category_id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
	
	public List<ProductModel> getSortByPrice(String sortType){
		try {
			
			return mapper.getSortByPrice(sortType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
	
	public List<ProductModel> getProductByPriceUnder(int product_price){
		try {
			
			return mapper.getProductByPriceUnder(product_price);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
	
}
