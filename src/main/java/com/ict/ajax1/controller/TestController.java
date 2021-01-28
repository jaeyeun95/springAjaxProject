package com.ict.ajax1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	/**
	 * 1. ServletOutputStream을 이용한 방식으로 응답데이터 출력
	 * @param name
	 * @param age
	 * @throws IOException 
	 */
	@RequestMapping("test1.do")
	public void test1Method(@RequestParam("name") String name,
							@RequestParam("age") int age,
							HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		if(name.equals("신사임당") && age == 47) {
			out.print("ok");
		}else {
			out.print("fail");
		}
		
	}	
}
