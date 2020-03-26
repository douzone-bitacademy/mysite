package com.douzone.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.douzone.security.Auth;

@Auth("ADMIN")
@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("")
	public String main() {
		return "admin/main";
	}
	

	@RequestMapping("/guestbook")
	public String guestbook() {
		return "admin/guestbook";
	}

	@RequestMapping("/board")
	public String board() {
		return "admin/board";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "admin/user";
	}	
}
