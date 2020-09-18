package com.neusoft.ele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ele.entity.Business;
import com.neusoft.ele.service.IBusinessService;

/**
 * DESC: 商家业务控制器
 * @author CHF
 * @date 2020年9月16日
 */
@Controller
@RequestMapping("/busi")
public class BusinessController {

	@Autowired private IBusinessService businessService;
	
	@RequestMapping("/list/{typeId}")
	public String list(@PathVariable("typeId") Integer typeId, ModelMap mmap) {
		List<Business> result = businessService.findListByTypeId(typeId);
		mmap.put("data", result);
		return "businessList";
	}
}
