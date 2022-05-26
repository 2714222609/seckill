package com.yue.seckill.vo;

import com.yue.seckill.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailVo {
    private User User;
    private GoodsVo goodsVo;
    private int secKillStatus;
    private int remainSeconds;
}
