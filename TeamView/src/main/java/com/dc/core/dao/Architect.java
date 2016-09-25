package com.dc.core.dao;

/**
 * Created by in IntelliJ IDEA.
 * 股票
 *
 * @author Joney
 * @create 2016-09-22-14:19
 */


public class Architect extends Designer {
    private String stock;

    public Architect() {
    }

    public Architect(Integer id, String name, Integer salary, Integer age, String status, String equipment, String bonus, String stock) {
        super(id, name, salary, age, status, equipment, bonus);
        this.stock = stock;
    }
}
