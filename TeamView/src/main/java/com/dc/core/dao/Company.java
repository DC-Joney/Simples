package com.dc.core.dao;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-16:23
 */


public class Company {
    private Integer id;
    private Team[]teams;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }
}
