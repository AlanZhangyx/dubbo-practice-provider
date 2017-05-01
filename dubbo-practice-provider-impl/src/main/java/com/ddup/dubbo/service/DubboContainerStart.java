package com.ddup.dubbo.service;

import com.alibaba.dubbo.container.Main;

import java.io.IOException;

/**
 * 用Dubbo容器的方式启动提供者；
 *
 */
public class DubboContainerStart {

    /**
     * com.alibaba.dubbo.container.Main是Dubbo的启动方式；
     */
    public static void main(String[] args) throws IOException {
        //1. Dubbo支持很多容器，今天我们只是用spring容器
        final String[] strings = {"spring"};// 自动加载META-INF/spring目录下的所有Spring配置，当然这些都是可配置的
        //2. 启动
        Main.main(strings);
    }

}
