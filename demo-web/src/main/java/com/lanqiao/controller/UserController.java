package com.lanqiao.controller;

import com.lanqiao.common.CommonResult;
import com.lanqiao.entity.User;
import com.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户管理控制器
 * 需求：分页查询  根据Id查询
 */
@Controller
@ResponseBody
public class UserController {
    @Autowired
    IUserService iUserService;
    /**
     * 查询用户列表 分页查询
     * fetch("http://localhost:8080/users“)
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public CommonResult findByPage(@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
                             @RequestParam(value = "pageSize",required = false,defaultValue = "10")Integer pageSize){
        List<User> list = iUserService.findListByPage(pageNum, pageSize);
        return CommonResult.success("分页数据查询成功",list);
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value ="/users/{id}",method = RequestMethod.GET)
    public CommonResult findById(@PathVariable("id") Long id){
        User user = iUserService.findById(id);
        return CommonResult.success("根据编号["+id+"]查询用户信息成功",user);
    }

    /**
     * 根据编号删除单个用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteById(@PathVariable("id") Long id){
        int row = iUserService.deleteById(id);
        return CommonResult.success("根据编号["+id+"]删除用户信息成功",null);
    }

    /**
     * 插入（注册)用户
     * @return
     */
    @RequestMapping(value = "/users" ,method = RequestMethod.POST)
    public CommonResult insert(@RequestBody User user){
        int row = iUserService.insert(user);
        return CommonResult.success("插入用户信息成功",row);
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    public CommonResult update(@RequestBody User user,@PathVariable("id") Long id){
        int row = iUserService.update(user,id);
        return CommonResult.success("更新"+id+"号用户信息成功",null);
    }


}
