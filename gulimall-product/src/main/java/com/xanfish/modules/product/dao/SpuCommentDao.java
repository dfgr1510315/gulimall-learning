package com.xanfish.modules.product.dao;

import com.xanfish.common.dao.BaseDao;
import com.xanfish.modules.product.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 *
 * @author ljz dfgr1510315@gmail.com
 * @since 1.0.0 2022-08-22
 */
@Mapper
public interface SpuCommentDao extends BaseDao<SpuCommentEntity> {
	
}