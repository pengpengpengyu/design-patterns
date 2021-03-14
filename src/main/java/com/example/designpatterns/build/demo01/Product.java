package com.example.designpatterns.build.demo01;

import lombok.Data;
import lombok.ToString;

/**
 * @author wangpengyu
 * @version 1.0-SNAPSHOT
 * @date 2021/3/14 10:54
 * 产品： 房子
 */
@Data
@ToString
public class Product {

    // 地基
    private String buildA;

    // 钢筋水泥
    private String buildB;

    // 电线
    private String buildC;

    // 粉刷
    private String buildD;

}
