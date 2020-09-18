package com.neusoft.ele.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DESC: 首页控制器
 * @author CHF
 * @date 2020年9月17日
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
}
