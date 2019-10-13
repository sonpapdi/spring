package com.aopdemo.aopdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
@Before( " execution (*  com.aopdemo.aopdemo.implement.myimp.getdata())")

        public void getdata(){

    System.out.println(".....welcome.....");
        }
}
