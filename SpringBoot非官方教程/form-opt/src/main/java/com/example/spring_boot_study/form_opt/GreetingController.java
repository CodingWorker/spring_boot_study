package com.example.spring_boot_study.form_opt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by DaiYan on 2017/12/21.
 */
@Controller
public class GreetingController {

    @GetMapping(value = "/greeting_get")
    public String greetingFormGet(Model model){
        model.addAttribute("greeting",new Greeting());
        return "greeting";
    }

//    @GetMapping(value = "/greeting")
//    public String greetingForm(Model model){
//        model.addAttribute("greeting",new Greeting());
//        return "greeting";
//    }

    @PostMapping(value = "/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting){
        return "result";
    }
}
