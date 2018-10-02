package com.zard.online.controller;

import com.zard.online.model.User;
import com.zard.online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody User getUser(HttpServletRequest request, Model model){
        ModelAndView modelAndView = new ModelAndView();
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUser(userId);
        modelAndView.addObject("user", user);
        return user;
    }
}
