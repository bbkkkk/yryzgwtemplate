package com.yryz.gwtemplate.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author PeterLee
 * @version V1.0
 * @Description: TODO
 * @date 2018/1/12 19:49
 */
public class TestMain {

    /**
     * @author lixiaokang
     * @date 2016年10月23日 下午1:56:05
     * @param args
     * @return void
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-root.xml" });
        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }
}
