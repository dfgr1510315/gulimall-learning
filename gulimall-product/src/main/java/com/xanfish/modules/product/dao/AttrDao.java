package com.xanfish.modules.product.dao;

import com.xanfish.common.dao.BaseDao;
import com.xanfish.modules.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 *
 * @author ljz dfgr1510315@gmail.com
 * @since 1.0.0 2022-08-22
 */
@Mapper
public interface AttrDao extends BaseDao<AttrEntity> {
	
}