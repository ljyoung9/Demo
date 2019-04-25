package com.example.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.web.model.BoardModel;


/*@Mapper
@Repository("sampleDAO")*/
public interface BoardDao {
	public List<BoardModel> getBoard();
}