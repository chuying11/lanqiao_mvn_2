package com.lanqiao.service;

import com.lanqiao.entity.User;
import com.lanqiao.vo.UserVo;

import java.util.List;

public interface IUserService {
    /**
     * 分页查询
     * @return
     */
    List<User> findListByPage(Integer pageNum, Integer pageSize);


    /**
     * 多表查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<UserVo> queryUserWithDepartsByPage(Integer pageNum, Integer pageSize);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById(Long id);


    /**
     * 插入用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int update(User user,Long id);

    /**
     * 登陆
     * @param username
     * @return
     */
    User login(String username);

}
