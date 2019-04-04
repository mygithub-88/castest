package com.zyq.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController {
	@RequestMapping("findLoginUser")
	@ResponseBody
	public String findLoginUser() {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("================"+name);
		return name;
	}
	@RequestMapping("index")
	public String index(HttpServletRequest httpServletRequest,HttpServletResponse response) {
		return "/login.jsp";
	}

}
