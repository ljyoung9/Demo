package com.example.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.web.model.ProductModel;


@Mapper
public interface ProductMapper {
	public List<ProductModel> getProduct();
	public List<ProductModel> getCategory();
	public List<ProductModel> getProductByCaterogy(String category_id);
	public List<ProductModel> getSortByPrice(String sortType);
	public List<ProductModel> getProductByPriceUnder(int product_price);
	
	
}