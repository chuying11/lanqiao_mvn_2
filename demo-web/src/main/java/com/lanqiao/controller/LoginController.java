
package com.lanqiao.controller;

import com.lanqiao.common.CommonResult;
import com.lanqiao.entity.User;
import com.lanqiao.service.IUserService;
import com.lanqiao.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 专门负责处理登陆业务 （登陆控制器）
 */
@Controller
public class LoginController {
    @Autowired
    IUserService iUserService;
    /**
     *  http://localhost:8080/login?username=zhangsan&password=123456
     * 登陆接口
     * @return
     */
      /*
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody  //把返回的结果 转换成json 输出
    public Object login(@RequestParam("username") String username, @RequestParam("pasword") String password){
        //查询数据库
        System.out.println("收到参数:"+username);
        System.out.println("收到参数:"+password);
        HashMap result =new HashMap();
        result.put("success",true);
        result.put("message","已经登陆成功");
        return result;

    }
*/
    //需求：编写一个使用postg方式的接口，前端通过ajax

    /**
     * 正确的登陆请求
     * fetch("http:localhost:8080/login",{
     *     method:"POST",
     *     headers:{
     *         "Content-type":"application/json"
     *     },
     *     body:JSON.stringify({username="zhangsan",pasword="123456"}
     * })
     * @return
     */
    /**
     * @RequestBody 把前端传过来的json数据转换成 userVo 对象  属性值必须一
     * @ResponseBody 把CommonResult装换成json 给前端
     * @param userVo
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody UserVo userVo){
        User user = iUserService.login(userVo.getUsername());
        if(user==null){
            return CommonResult.failure("用户名不存在");
        }
        if(!user.getPassword().equals(userVo.getPassword())){
            return CommonResult.failure("密码不正确");
        }
        return CommonResult.success("登陆成功",user);
    }
}
