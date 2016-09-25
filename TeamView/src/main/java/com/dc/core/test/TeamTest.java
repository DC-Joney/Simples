package com.dc.core.test;

import com.dc.core.dao.Employee;
import com.dc.core.dao.Team;
import com.dc.core.factory.Factory;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-17:10
 */


public class TeamTest {


    public static void main(String[] args) {
        Team[] team = new Team[3];
        Employee[] employee = new Employee[3];
        for (int i = 0; i < team.length; i++) {
            employee[i] = new Employee(i, "aa", 12, i);
            team[i] = new Team(i, employee);
        }
        Factory.addBean(team);
        if(Factory.getBean(1) instanceof Team){
            System.out.println("aaaa");
        }
    }
}
