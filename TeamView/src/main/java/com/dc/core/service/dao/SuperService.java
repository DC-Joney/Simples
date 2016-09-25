package com.dc.core.service.dao;

/**
 * Created by in IntelliJ IDEA.
 * ${DESCRIPTION}
 *
 * @author Joney
 * @create 2016-09-22-15:19
 */
public interface SuperService {
    /**
     * –	getAllEmployees ()方法：获取当前所有员工。
     •	返回：包含所有员工对象的数组
     –	getEmployee(id : int)方法：获取指定ID的员工对象。
     •	参数：指定员工的ID
     •	返回：指定员工对象
     •	异常：找不到指定的员工

     *–	getTeam()方法：返回当前团队的所有对象
     –	返回：包含所有成员对象的数组，数组大小与成员人数一致
     –	addMember(e: Employee)方法：向团队中添加成员
     –	参数：待添加成员的对象
     –	异常：添加失败， TeamException中包含了失败原因
     –	removeMember(memberId: int)方法：从团队中删除成员
     –	参数：待删除成员的memberId
     –	异常：删除失败， TeamException中包含了失败原因
     –	另外，可根据需要自行添加其他方法或重载构造器


     istAllEmployees ()方法：以表格形式列出公司所有成员
     •	listAllMembers()方法：以表格形式列出所有团队成员
     •	addMember ()方法：实现添加成员操作
     •	deleteMember ()方法：实现删除成员操作


     –	软件启动时，根据给定的数据创建公司部分成员列表（对象数组）
     –	根据菜单提示，基于现有的公司成员，组建一个开发团队以开发一个新的项目（对象数组）:
     –
     –	★添加开发团队: 1.是否为公司员工 2.架构师至多1位，设计师至多2位，程序员至多3名
     –	删除团队成员、
     –	列出所有团队成员
     –	组建过程包括将成员插入到团队中，或从团队中删除某成员，还可以列出团队中现在成员的列表
     –	开发团队成员包括
     –		架构师、设计师和程序员

     */
}
