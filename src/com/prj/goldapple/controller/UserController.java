package com.prj.goldapple.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prj.goldapple.bean.AABB02A;
import com.prj.goldapple.service.IUserService;

@Controller
@RequestMapping("/user/")
public class UserController {

	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@ResponseBody
	@RequestMapping("getJSON")
	public Map<String, Object> getJSON(String userId) {
		AABB02A aabb02a = new AABB02A();
		aabb02a.setAABB02A010(userId);
		userService.create(aabb02a);
		return new HashMap<String, Object>();
	}
	@ResponseBody
	@RequestMapping("create")
	public AABB02A create() {
		AABB02A aabb02a = new AABB02A();
		aabb02a.setAABB02A010(UUID.randomUUID().toString());
		aabb02a.setAABB02A020(1);
		aabb02a.setAABB02A030("gy");
		aabb02a.setAABB02A040("admin");
		aabb02a.setAABB02A050("12345");
		aabb02a.setAABB02A060("gy@qq.com");
		aabb02a.setAABB02A070("13912345678");
		userService.create(aabb02a);
		
		return aabb02a;
	}
	@ResponseBody
	@RequestMapping("retrive")
	public AABB02A retrive(String userId) {
		AABB02A aabb02a = userService.retrieve(userId);
		return aabb02a;
	}
	
	@ResponseBody
	@RequestMapping("update")
	public AABB02A update(String userId) {
		AABB02A aabb02a = userService.retrieve(userId);
		aabb02a.setAABB02A020(8);
		userService.update(aabb02a);
		return aabb02a;
	}
	@ResponseBody
	@RequestMapping("queryForList")
	public List<AABB02A> queryForList() {
		List<AABB02A> lst = userService.queryForList(null);
		return lst;
	} 
}

