package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vo.PageVO;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/board")
@Log
public class WebBoardController {

	@GetMapping("/list")
	public String list(@ModelAttribute("xxx") PageVO vo , Model model) {
		//@ModelAttribute("xxx") = auto binding (쿼리스트)
		log.info("/board/list list()...");
		log.info("PageVO : " + vo);
		
		return "jsp/board/list";
	}
}
