package com.dzl.controller;

import com.dzl.pojo.Users;
import com.dzl.service.crud.UserCRUDService;

import com.dzl.utils.MyJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class UserCRUDController {
	
	@Autowired
	private UserCRUDService userCRUDService;
	
	@RequestMapping("/save")
	public MyJSONResult save() {
		
		Users user = new Users("1001", "test-saveuser-1001",
				"123456", "/path", "慕课网", null, null, null);
		userCRUDService.saveUser(user);
		
		return MyJSONResult.ok();
	}
	
	@RequestMapping("/update")
	public MyJSONResult update() {
		
		Users user = new Users("1001", "test-saveuser-1111",
				"77777", "/path000", "慕课网好牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return MyJSONResult.ok();
	}
	
	@RequestMapping("/update2")
	public MyJSONResult update2() {
		
		Users user = new Users("1001", null,
				"9999", "/path000999", "慕课网好牛十分牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return MyJSONResult.ok();
	}
	
	@RequestMapping("/delUser")
	public MyJSONResult delUser() {
		
		userCRUDService.delete();
		
		return MyJSONResult.ok();
	}
}
