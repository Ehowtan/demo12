package com.example.demo8.mapper;

import com.example.demo8.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAllUsers();

    @Insert("INSERT INTO user(name, email) VALUES(#{name}, #{email})")
    void insertUser(User user);
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(Long id);

    @Update("UPDATE user SET name = #{name}, email = #{email} WHERE id = #{id}")
    void updateUser(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUser(Long id);


    // 根据用户名模糊查询
    @Select("SELECT * FROM user WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<User> findUsersByName(@Param("name") String name);


}
