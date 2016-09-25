package com.dc.core.all.departmentImpl;

import com.dc.core.all.Department;
import com.dc.core.dao.EmployeeState;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-16:18
 */


public interface AllPepole extends Department{
    EmployeeState getEmployee(Integer id);

}
