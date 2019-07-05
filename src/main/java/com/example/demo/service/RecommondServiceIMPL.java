package com.example.demo.service;

import com.example.demo.entity.GoodsRough;
import com.example.demo.entity.GoodsRoughExample;
import com.example.demo.entity.OrderInfo;
import com.example.demo.entity.OrderInfoExample;
import com.example.demo.mapper.GoodsRoughMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class RecommondServiceIMPL {

    @Autowired
    private OrderInfoServiceIMPL orderInfoServiceIMPL;
    @Autowired
    private GoodsRoughMapper goodsRoughMapper;

    public List<OrderInfo> randomRecommandByOrderID(){

        return null;

    }

    public List<OrderInfo> brandRecommand(){

        return null;
    }

    public List<GoodsRough> newGoodsRecommand(){
        //现在和过去30天的时间
        Calendar nowC=Calendar.getInstance();
        Calendar pastC=Calendar.getInstance();
        pastC.add(Calendar.DATE,-30);

        Date now=nowC.getTime();
        Date past=pastC.getTime();
        //查询过去30天上市的新品
        GoodsRoughExample goodsRoughExample=new GoodsRoughExample();
        GoodsRoughExample.Criteria criteria=goodsRoughExample.createCriteria();

        criteria.andMarketDateBetween(past,now);

        return goodsRoughMapper.selectByExample(goodsRoughExample);
    }
}
