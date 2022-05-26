package com.yue.seckill.vo;

import com.yue.seckill.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDeatilVo {

    private Order Order;
    private GoodsVo goodsVo;
}
