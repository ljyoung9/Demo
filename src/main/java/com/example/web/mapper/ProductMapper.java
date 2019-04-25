package com.example.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.web.model.ProductModel;


@Mapper
public interface ProductMapper {
	public List<ProductModel> getProduct();
	//public List<ProductModel> getCategory();
}