package com.aopdemo.aopdemo.controller;

import com.aopdemo.aopdemo.REpository.Myreo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {

@Autowired
    Myreo myreo;
@GetMapping(value = "/used")
    public String getdata(){
    return myreo.getdata();
}

}
