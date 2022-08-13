package com.lanqiao.dao;

import com.lanqiao.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    /**
     * 分页查询
     * @return
     */
    @Select("select id,username,password,email,address from tb_users limit #{pageNum},#{pageSize}")
    List<User> findListByPage(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select id,username,password,email,address from tb_users where id=#{id}")
    User findById(Long id);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Delete("delete from tb_users where  id=#{id}")
    int deleteById(Long id);

    /**
     * 插入用户
     * @param user
     * @return
     */
    @Insert("insert into tb_users (username,password,email,address) values(#{username},#{password},#{email},#{address}")
    int insert(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */

    int update(User user,Long id);

    /**
     * 登陆接口
     * @param username
     * @return
     */
    @Select("select username,password,email,address from tb_users where username=#{username}")
    User login(String username);
}
