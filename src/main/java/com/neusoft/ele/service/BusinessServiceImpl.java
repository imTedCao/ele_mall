/**
 * 
 */
package com.neusoft.ele.service;

import java.util.List;

import com.neusoft.ele.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ele.entity.Business;
import com.neusoft.ele.mapper.BusinessMapper;

/**
 * DESC: 商家服务对象
 * @author CHF
 * @date 2020年9月16日
 */
@Service
public class BusinessServiceImpl implements IBusinessService {

	@Autowired BusinessMapper businessMapper;

	@Override
	public List<Business> findListByTypeId(Integer typeId) {
		return businessMapper.findListByTypeId(typeId);
	}

	@Override
	public Business selectById(Integer id) {
		return null;
	}

	@Override
	public List<Food> selectFoodsByBusiId(Integer busiId) {
		return null;
	}

}
