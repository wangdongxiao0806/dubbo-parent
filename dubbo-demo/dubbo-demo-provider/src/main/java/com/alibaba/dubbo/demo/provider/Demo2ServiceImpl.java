package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.Demo2Service;

public class Demo2ServiceImpl implements Demo2Service{
    @Override
    public void sayHelloWorld() {
        System.out.println("demo2Service sys hello world");
    }
}
