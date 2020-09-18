/**
 * 
 */
package com.neusoft.ele.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ele.entity.Business;
import com.neusoft.ele.entity.Food;
import com.neusoft.ele.mapper.BusinessMapper;
import com.neusoft.ele.mapper.FoodMapper;
import com.neusoft.ele.service.IBusinessService;

/**
 * DESC: 商家服务对象
 * @author CHF
 * @date 2020年9月16日
 */
@Service
public class BusinessServiceImpl implements IBusinessService {

	@Autowired BusinessMapper businessMapper;
	@Autowired FoodMapper foodMapper;

	@Override
	public List<Business> findListByTypeId(Integer typeId) {
		return businessMapper.findListByTypeId(typeId);
	}

	@Override
	public Business selectById(Integer id) {
		return businessMapper.selectById(id);
	}

	@Override
	public List<Food> selectFoodsByBusiId(Integer busiId) {
		return foodMapper.findByBusinessId(busiId);
	}

}
