package com.yu.dubboB;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By Yu On 2018/8/20
 * Description：
 **/
public class ProviderExec {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo/dubbo-provider.xml"});
        context.start();
        System.in.read();
    }
}
