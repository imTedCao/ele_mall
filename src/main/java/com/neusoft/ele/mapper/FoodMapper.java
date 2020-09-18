package com.neusoft.ele.mapper;

import java.util.List;

import com.neusoft.ele.entity.Food;

/**
 * DESC: 食品Mapper
 * @author CHF
 * @date 2020年9月18日
 */
public interface FoodMapper {

	List<Food> findByBusinessId(Integer busiId);
}
