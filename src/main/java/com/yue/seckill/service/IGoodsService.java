package com.yue.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yue.seckill.pojo.Goods;
import com.yue.seckill.vo.GoodsVo;

import java.util.List;


public interface IGoodsService extends IService<Goods> {

    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
