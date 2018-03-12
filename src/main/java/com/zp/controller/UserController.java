package com.zp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author zhouping
 *
 */
@Controller
@RequestMapping(value="user")
public class UserController {
	@RequestMapping(value="userLogin")
	public ModelAndView talentSchemeList() throws Exception{
		
		System.out.println("-------------------------");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		return mv;
	}
}
