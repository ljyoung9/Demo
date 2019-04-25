package com.example.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.mapper.BoardMapper;
import com.example.web.model.BoardModel;


@Service
public class BoardService {
	@Autowired
	BoardMapper dao;
	
	public List<BoardModel> getBoard(){
		try {
			return dao.getBoard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
}
