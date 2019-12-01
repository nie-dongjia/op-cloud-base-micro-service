package com.djn.cn.op.cloud.base.micro.service.base.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.op.cloud.base.micro.service.base.dao.ItemCodeMapper;
import com.djn.cn.op.cloud.base.micro.service.base.entity.ItemCode;
import com.djn.cn.op.cloud.base.micro.service.base.service.IItemCodeService;
@Service
public class ItemCodeServiceImpl  extends BaseServiceImpl<ItemCode> implements IItemCodeService{

	@Autowired
	private ItemCodeMapper itemCodeMapper;

	@Override
	public List<ItemCode> getByCategory(String Category) {
		ItemCode itemCode = new ItemCode();
		return itemCodeMapper.select(itemCode);
	}
}
