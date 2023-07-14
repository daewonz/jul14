package com.ddww.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index() {
		return "index"; //사용자가 첫 화면을 열면 index.jsp 열꺼에요
	}
}
