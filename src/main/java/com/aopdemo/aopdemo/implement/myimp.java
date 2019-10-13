package com.aopdemo.aopdemo.implement;

import com.aopdemo.aopdemo.REpository.Myreo;
import org.springframework.stereotype.Service;

@Service
public class myimp implements Myreo {
    @Override
    public String getdata() {

        System.out.println("hii pooja");
        return "good morning";
    }
}
