/**
 * 
 */
package com.neusoft.ele.mapper;

import java.util.List;

import com.neusoft.ele.entity.Business;

/**
 * DESC: 商家数据访问接口
 * @author CHF
 * @date 2020年9月16日
 */
public interface BusinessMapper {

	List<Business> findListByTypeId(Integer typeId);
}
