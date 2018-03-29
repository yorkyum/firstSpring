package com.zp.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zp.service.UserService;
import com.zp.util.PageData;



/**
 * @author zhouping
 *
 */
@Controller
@RequestMapping(value="user")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="toUserList")
	public ModelAndView toUserList() throws Exception{
		List<PageData> pdList = userService.userList(null);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("pdList",pdList);
		mv.getModel().put("name", "aaaaaa");
		mv.setViewName("login/userList");
		return mv;
	}	
	@RequestMapping(value="userLogin")
	@ResponseBody
	public PageData userLogin(HttpServletRequest request) throws Exception{
		PageData pd = new PageData(request);
	  	pd.put("msg", "登录成功！");
	  	toUserList();
	  	return pd;
	}
}
