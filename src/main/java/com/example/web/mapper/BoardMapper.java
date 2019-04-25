package com.example.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.web.model.BoardModel;


@Mapper
public interface BoardMapper {
	public List<BoardModel> getBoard();
}