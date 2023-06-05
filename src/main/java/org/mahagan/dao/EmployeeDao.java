package org.mahagan.dao;


import org.mahagan.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class EmployeeDao {
    private final JdbcTemplate jdbcTemplate;
    private final String SQL_NO_OF_EMPLOYEES="SELECT * FROM employee";

    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     *
     */
    public void getAllEmployees() {

        List<Employee> empDao = jdbcTemplate.queryForObject(SQL_NO_OF_EMPLOYEES, new EmployeeRowMapper());{
            for (Employee employee : empDao){
                System.out.println("employee"+employee);
            }
        }
    }
    private final class EmployeeRowMapper implements RowMapper<List<Employee>>{
        @Override
        public List<Employee> mapRow(ResultSet rs, int rowNum) throws SQLException {

            List<Employee> list = new ArrayList<Employee>();
            while(rs.next()){
                Employee emp = new Employee();
                emp.setEmpId(rs.getInt(1));
                emp.setEmpName(rs.getNString(2));
                emp.setEmpAge(rs.getInt(3));
                emp.setMobileNo(rs.getString(4));
                emp.setEmail_Id(rs.getString(5));
                emp.setLocation(rs.getString(6));


                list.add(emp);



            }

            return list;
        }
    }
}
