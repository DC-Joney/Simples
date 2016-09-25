package com.dc.core.dao;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-16:21
 */


public class Team {
    private Integer id;
    private Employee[]employee;

    public Team(Integer id, Employee[] employee) {
        this.id = id;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }
}
