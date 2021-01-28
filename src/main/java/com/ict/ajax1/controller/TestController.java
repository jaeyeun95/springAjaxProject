package com.ict.ajax1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ict.ajax1.model.vo.User;

@Controller
public class TestController {
	
	/**
	 * 1. ServletOutputStream을 이용한 방식으로 응답데이터 출력
	 * @param name
	 * @param age
	 * @throws IOException 
	 */
//	@RequestMapping("test1.do")
//	public void test1Method(@RequestParam("name") String name,
//			                 @RequestParam("age") int age,
//			                 HttpServletResponse response) throws IOException {
//		
//		PrintWriter out = response.getWriter();
//		
//		if(name.equals("신사임당") && age == 47) {
//			out.print("ok");
//		}else {
//			out.print("fail");
//		}
//		
//	}

	/**
	 * 2. @ResponseBody를 이용한 방식 
	 *    반환형이 String일 경우 뷰명 반환을 하지만 @ResponseBody가 붙은 String 반환은
	 *    해당 요청을 보낸 뷰에 전달할 데이터를 반환하게된다. 
	 * @param name
	 * @param age
	 * @return
	 */
	@ResponseBody // 결과를 response 객체에 담아서 보내세요
	@RequestMapping(value="test1.do",method=RequestMethod.POST)
	public String test1Method(String name, int age) {
		
		if(name.equals("신사임당") && age == 47) {
			return "ok";
		}else {
			return "fail";
		}
	}

//	@ResponseBody
//	@RequestMapping(value="test2.do",produces="application/json; charset=utf-8")
//	public String test2Method() {
//		User user = new User("user01","pass01","홍길동",20,"hong123@test.com","01012345677");
//		
//		JSONObject job = new JSONObject();
//		job.put("userId", user.getUserId());
//		job.put("userPwd",user.getUserPwd());
//		job.put("userName", user.getUserName());
//		job.put("age", user.getAge());
//		job.put("email", user.getEmail());
//		job.put("phone", user.getPhone());
//		
//		return job.toJSONString();
//	}
	
	@RequestMapping("test2.do")
	public void test2Method(HttpServletResponse response) throws IOException {
		User user = new User("user01","pass01","홍길동",20,"hong123@test.com","01012345677");
		
		JSONObject job = new JSONObject();      
		job.put("userId", user.getUserId());    
		job.put("userPwd",user.getUserPwd());   
		job.put("userName", user.getUserName());
		job.put("age", user.getAge());          
		job.put("email", user.getEmail());      
		job.put("phone", user.getPhone());      
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print(job);
	}
}







