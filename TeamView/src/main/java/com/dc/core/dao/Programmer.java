package com.dc.core.dao;

/**
 * Created by in IntelliJ IDEA.
 * 状态
 *
 * @author Joney
 * @create 2016-09-22-14:13
 */


public class Programmer extends Employee{
    private  String status;
    private String equipment;

    public Programmer() {
    }
    public Programmer(Integer id, String name, Integer salary, Integer age, String status, String equipment) {
        super(id, name, salary, age);
        this.status = status;
        this.equipment = equipment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Programmer{"+
                "status='" + status + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
