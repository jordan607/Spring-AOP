package com.jr.spring.aop.springaop.data;

import com.jr.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retriveSomething(){
        return "Dao1";
    }

}
