package com.ning.test.controller;

import com.ning.test.Entity.Users;
import com.ning.test.server.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private  UsersService usersService;

    @GetMapping("/getListUsers")
    @ResponseBody
    public List<Users> getListUsers(){
        return usersService.getListUsers();
    }
    @GetMapping("/getUsers")
    @ResponseBody
    public Users getUsers(){
        return usersService.getUsers();
    }
    @GetMapping("/getName")
    public String getName() {
        return "测试获取姓名";
    }

}
