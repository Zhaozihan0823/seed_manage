package com.seed.seed_manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classname:JspController
 * Package:com.seed.seed_manage.controller
 * Description:
 *
 * @DATE:2020/2/20 17:09
 * @Author:zhaozihan0823
 */
@Controller
public class JspController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
