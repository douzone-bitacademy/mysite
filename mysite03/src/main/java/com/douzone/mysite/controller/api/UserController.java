package com.douzone.mysite.controller.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.mysite.service.UserService;

@Controller("UserApiController")
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/checkemail")
	public Map<String, Object> checkEmail(
		@RequestParam(value="email", required=true, defaultValue="") String email) {
		boolean exist = userService.existUser(email);
		
		Map<String, Object> map = new HashMap<>();
		map.put("result", exist ? "exist" : "not exist");
		return map;
	}
}
