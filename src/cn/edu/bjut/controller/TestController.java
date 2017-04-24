package cn.edu.bjut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/4/13.
 */
@Controller
public class TestController {
    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String test(Model model){
        model.addAttribute("Title","test");
        return "test";
    }
}
