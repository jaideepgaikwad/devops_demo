package com.siemens.devopsdemo.controller;

import com.siemens.devopsdemo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myservice")
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping(value = "/add/{one}/{two}", method = RequestMethod.GET)
    public int addition(@PathVariable String one, @PathVariable String two){
     return myService.addNumber(Integer.parseInt(one), Integer.parseInt(two));
    }
}
