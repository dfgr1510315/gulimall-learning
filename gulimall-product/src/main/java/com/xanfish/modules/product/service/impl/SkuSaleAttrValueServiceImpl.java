package com.xanfish.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xanfish.common.service.impl.CrudServiceImpl;
import com.xanfish.modules.product.dao.SkuSaleAttrValueDao;
import com.xanfish.modules.product.dto.SkuSaleAttrValueDTO;
import com.xanfish.modules.product.entity.SkuSaleAttrValueEntity;
import com.xanfish.modules.product.service.SkuSaleAttrValueService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author ljz dfgr1510315@gmail.com
 * @since 1.0.0 2022-08-22
 */
@Service
public class SkuSaleAttrValueServiceImpl extends CrudServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity, SkuSaleAttrValueDTO> implements SkuSaleAttrValueService {

    @Override
    public QueryWrapper<SkuSaleAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}