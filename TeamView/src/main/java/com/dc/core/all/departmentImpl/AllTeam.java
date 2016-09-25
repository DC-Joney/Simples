package com.dc.core.all.departmentImpl;

import com.dc.core.all.Department;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-16:18
 */


public interface AllTeam extends Department {
    Integer length();
    Object select(Integer id);
    Object update(Integer id);
    Object delete(Integer id);
    Object add(Integer id);
}
