package com.dc.core.spring.reference.annotation.annotation.cdplayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by in IntelliJ IDEA.
 * CD播放器类
 *
 * @author Joney
 * @create 2016-09-18-23:48
 */

@Configuration
@ComponentScan(basePackages = "com.dc.core.spring.reference.annotation.annotation")
//basePackages属性可以为 数组形式 还可以指定扫面的类以及接口
//@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {


}
