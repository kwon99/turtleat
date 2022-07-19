package com.kwon99.turtleat.service;

import com.kwon99.turtleat.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Register {

    @Autowired
    RegisterMapper registerMapper;

    public void getName() {
        String name = registerMapper.getName();
        System.out.println(name);
    }

}
