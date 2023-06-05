package org.mahagan.test;

import org.mahagan.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetAllRecordsTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeDao employeeDAO=context.getBean("employeeDao",EmployeeDao.class);
        employeeDAO.getAllEmployees()  ;

    }
}
