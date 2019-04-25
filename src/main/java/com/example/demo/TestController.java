package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.web.model.BoardModel;
import com.example.web.service.BoardService;



public class TestController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list") // URL 주소
	public String list(Model model) {

		List<BoardModel> boardList = boardService.getBoard();
		
		model.addAttribute("boardList", boardList);
		
		return "list"; // JSP 파일명
	}
	
//	@GetMapping("/")
//	public String test() {
//		return "test";
//	}

	
}

