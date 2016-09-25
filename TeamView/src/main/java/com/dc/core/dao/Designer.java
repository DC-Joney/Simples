package com.dc.core.dao;

/**
 * Created by in IntelliJ IDEA.
 * 奖金
 *
 * @author Joney
 * @create 2016-09-22-14:17
 */


public class Designer extends Programmer{
    private String bonus;

    public Designer() {
    }

    public Designer(String bonus) {
        this.bonus = bonus;
    }
    public Designer(Integer id, String name, Integer salary, Integer age, String status, String equipment, String bonus) {
        super(id, name, salary, age, status, equipment);
        this.bonus = bonus;
    }
}
