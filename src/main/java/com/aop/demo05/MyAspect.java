package com.aop.demo04;

public class MyAspect {
    public void check() {
        System.out.println("权限控制");
    }

    public void except() {
        System.out.println("异常处理");
    }

    public void log() {
        System.out.println("日志");
    }

    public void monitor() {
        System.out.println("监控性能");
    }
}
