package com.dc.core.spring.reference.collection;

import com.dc.core.spring.reference.collection.dao.User;

import java.util.*;

/**
 * Created by Administrator on 2016/9/9.
 */
public class ListCollection {
    private String name;
    private Integer number;
    private List<User>list;
    private Properties properties;
    private Set<? extends Object> set;
    private Map<? extends Object,? extends Object> map;

    public Set<? extends Object> getSet() {
        return set;
    }

    public void setSet(Set<? extends Object> set) {
        this.set = set;
    }

    public Map<? extends Object, ? extends Object> getMap() {
        return map;
    }

    public void setMap(Map<? extends Object, ? extends Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
