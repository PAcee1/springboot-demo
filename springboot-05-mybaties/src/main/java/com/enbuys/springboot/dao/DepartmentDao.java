package com.enbuys.springboot.dao;

import com.enbuys.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author: Pace
 * @Data: 2019/10/29 10:55
 * @Version: v1.0
 */
//@Mapper
public interface DepartmentDao {

    @Select("select * from department where id = #{id}")
    public Department getById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department (departmentName) values (#{departmentName})")
    public int insert(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateById();

}
