package com.ddup.dubbo.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用Spring容器来启动的小测试；
 *
 * <ul>
 *     <li>用Spring原生的方式来启动只是为了方便我们简单入门下；</li>
 *     <li>实际上Dubbo有很多我们生产时需要用到的机制，所以正常使用还是要用Dubbo的方式来启动（Dubbo容器默认包含启动Spring容器）</li>
 *	   <li>所以可以继续看{@link DubboContainerStart}</li>
 * </ul>
 */
public class SpringStart {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"META-INF/spring/spring-context.xml", "META-INF/spring/spring-dubbo.xml"});
		context.start();
		System.out.println("注册成功");
		System.in.read(); // 按任意键退出
		context.close();
	}

}
