package com.neusoft.ele.service;

import java.util.List;

import com.neusoft.ele.entity.Business;

/**
 * DESC: 商家数据服务接口
 * @author CHF
 * @date 2020年9月16日
 */
public interface IBusinessService {

	List<Business> findListByTypeId(Integer typeId);
}
