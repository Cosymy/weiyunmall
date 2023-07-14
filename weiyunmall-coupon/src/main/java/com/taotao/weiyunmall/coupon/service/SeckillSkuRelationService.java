package com.taotao.weiyunmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taotao.common.utils.PageUtils;
import com.taotao.weiyunmall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author guyu
 * @email ljt10086123@gmail.com
 * @date 2023-05-30 09:58:25
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

