package com.quyou.hongkouZX.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("callhello")
    public String helloABC(Model model){
        model.addAttribute("gavin", "demo is success !");
        model.addAttribute("gavin1", "hello1 is success !");
        return "hello1";
    }
}
