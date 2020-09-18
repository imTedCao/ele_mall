package com.neusoft.ele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.ele.entity.Business;
import com.neusoft.ele.entity.Food;
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
	
	@GetMapping("/info/{id}")
	public String info(@PathVariable("id") Integer id, ModelMap mmap) {
		Business busi = businessService.selectById(id);
		mmap.put("data", busi);
//		mmap.put("foods", foods);
		return "businessInfo";
	}

	@PostMapping("/foods/{busiId}")
	public @ResponseBody List<Food> foods(@PathVariable("busiId") Integer busiId) {
		List<Food> foods = businessService.selectFoodsByBusiId(busiId);
		return foods;
	}
}
