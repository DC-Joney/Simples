package com.dc.core.all.departmentImpl;

import com.dc.core.factory.Factory;
import com.dc.core.dao.Team;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-16:25
 */


public class TeamHelper implements AllTeam {
    private static Team team ;
//    static {
//        team= (Team) Factory.getOneInstance(Team.class);
//        }
    @Override
    public void getAll() {

    }

    @Override
    public Integer length() {
        return null;
    }

    @Override
    public Object select(Integer id) {
        team= (Team) Factory.getBean(id);
        return team;
    }

    public Object select(Integer id, Team team) {

        return this.team=team;
    }

    @Override
    public Object update(Integer id) {
        return null;
    }

    @Override
    public Object delete(Integer id) {
        return null;
    }

    @Override
    public Object add(Integer id) {
        return null;
    }
}
