package com.ddup.dubbo.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"spring-context.xml", "spring-dubbo.xml"});
		context.start();
		System.out.println("注册成功");
		System.in.read(); // 按任意键退出
		context.close();
	}

}
