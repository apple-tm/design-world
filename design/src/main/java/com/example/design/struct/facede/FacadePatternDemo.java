package com.example.design.struct.facede;

/**
 * 外观模式（java 三层结构，控制层 业务层 数据访问层）
 * 1.隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 * 2.客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可。
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeFacede shapeFacede = new ShapeFacede();
        shapeFacede.drawCircle();
    }
}
