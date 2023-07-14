package com.ddww.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	// 1. board리스트 보는 화면 = board.jsp
	@GetMapping("/board")
	public String board(Model model) {	
		
		model.addAttribute("name", "1234");	//name, value
		
		List<BoardDTO> list = service.boardList();
		
		if(!list.isEmpty()) {
		model.addAttribute("list", list);
		return "board";}
		else {
			return "redirect:/"; //리다이렉트 : 다시 컨트롤러 지나갑니다.
		}
		
	}
		// 2. detail 상세보기 화면 = detail.jsp
	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {
		String bno = request.getParameter("bno");
		//System.out.println(bno);
		
		
		
		try {

			int no = Integer.parseInt(bno);
			System.out.println("숫자입니다.");
		} catch (Exception e) {
			System.out.println("숫자가아닙니다.");
		}
		
		
		/*
		 * for (int i = 0; i < bno.length(); i++) {
		 * System.out.println(Character.isDigit(bno.charAt(i))); }
		 */
		//System.out.println(Character.isDigit(0));
		
		
		if(true) {
			
		}else {
			
			
			
		}
		
		
		return "detail";
	}
		
	
	
}
