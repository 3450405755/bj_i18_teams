package com.struggle.flink.realtime.common.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ version 1.0
 * @ Package com.struggle.flink.realtime.common.bean.TrafficHomeDetailPageViewBean
 * @ Author liu.bo
 * @ Date 2025/5/3 14:12
 * @ description:页面
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrafficHomeDetailPageViewBean {
    // 窗口起始时间
    String stt;
    // 窗口结束时间
    String edt;
    // 当天日期
    String curDate;
    // 首页独立访客数
    Long homeUvCt;
    // 商品详情页独立访客数
    Long goodDetailUvCt;
    // 时间戳
    @JSONField(serialize = false)
    Long ts;
}
