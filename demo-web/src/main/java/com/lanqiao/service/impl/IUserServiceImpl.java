package com.lanqiao.service.impl;

import com.lanqiao.dao.UserDao;
import com.lanqiao.entity.User;
import com.lanqiao.service.IUserService;
import com.lanqiao.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> findListByPage(Integer pageNum, Integer pageSize) {
        List<User> list = userDao.findListByPage((pageNum-1)*pageSize, pageSize);
        return list;
    }

    @Override
    public List<UserVo> queryUserWithDepartsByPage(Integer pageNum, Integer pageSize) {
        List<UserVo> list = userDao.queryUserWithDepartsByPage((pageNum-1)*pageSize,pageSize);
        return list;
    }

    @Override
    public User findById(Long id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    public int deleteById(Long id) {
        int row = userDao.deleteById(id);
        return row;
    }

    @Override
    public int insert(User user) {
        int row = userDao.insert(user);
        return row;
    }

    @Override
    public int update(User user,Long id) {
        int row = userDao.update(user,id);
        return row;
    }

    @Override
    public User login(String username) {
        User login = userDao.login(username);
        return login;
    }
}
