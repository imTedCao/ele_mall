package com.neusoft.ele.service;

import java.util.List;

import com.neusoft.ele.entity.Business;
import com.neusoft.ele.entity.Food;

/**
 * DESC: 商家数据服务接口
 * @author CHF
 * @date 2020年9月16日
 */
public interface IBusinessService {

	/**
	 * 根据商家类别编号查询商家列表
	 * @param typeId
	 * @return
	 */
	List<Business> findListByTypeId(Integer typeId);

	/**
	 * 根据商家编号查询商家信息
	 * @param id
	 * @return
	 */
	Business selectById(Integer id);

	/**
	 * 根据商家编号查询食品列表
	 * @param busiId
	 * @return
	 */
	List<Food> selectFoodsByBusiId(Integer busiId);

}
