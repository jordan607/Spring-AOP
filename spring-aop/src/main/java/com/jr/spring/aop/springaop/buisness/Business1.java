package com.jr.spring.aop.springaop.buisness;

import com.jr.spring.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private Dao1 dao1;

    @Autowired
    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    public String calculateSomething(){
        return dao1.retriveSomething();
    }
}
