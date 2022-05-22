package com.yue.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yue.seckill.pojo.Goods;
import com.yue.seckill.vo.GoodsVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper extends BaseMapper<Goods> {

    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
