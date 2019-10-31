package com.enbuys.springboot.dao;

import com.enbuys.springboot.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author: Pace
 * @Data: 2019/10/31 14:03
 * @Version: v1.0
 */
public interface EmployeeDao {

    @Select("select * from employee where id = #{id}")
    public Employee getById(Integer id);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
    public void insert(Employee employee);

    @Update("update employee set lastName=#{lastName},email = #{email},gender = #{gender},d_id = #{dId} where id = #{id}")
    public void update(Employee employee);

    @Delete("delete from employee where id = #{id}")
    public void delete(Integer id);

}
