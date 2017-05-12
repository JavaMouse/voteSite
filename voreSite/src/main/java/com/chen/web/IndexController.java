package com.chen.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {

	
	@RequestMapping("/toIndex.do")
	/**
	 * 返回index.jsp
	 * @return
	 */
	public String toLogin(){
		return "index";
	}
	
	

}
