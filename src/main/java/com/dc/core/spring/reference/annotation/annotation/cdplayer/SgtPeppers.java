package com.dc.core.spring.reference.annotation.annotation.cdplayer;

import org.springframework.stereotype.Component;

/**
 * Created by in IntelliJ IDEA.
 * 实现CD接口对 CD操控
 *
 * @author Joney
 * @create 2016-09-18-23:44
 */

@Component("compactDisc1")
public class SgtPeppers implements CompactDisc {
    private String title="Sgt.Pepper's Loneyly Hearts Club Band";
    private String artist="The Beatles";
    @Override
    public void display() {
        System.out.println("Playing" + title+" by "+artist);
    }
}
