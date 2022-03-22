package com.codegym.controller;

import com.codegym.model.EmailSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailSettingController {
    @Autowired
    EmailSetting emailSetting;

    @GetMapping("/email-setting")
    public ModelAndView showEditPage(){
        return new ModelAndView("email-setting", "emailSetting", emailSetting);
    }

    @PostMapping("/info")
    public ModelAndView showInfo(@ModelAttribute(name="emailSetting") EmailSetting emailSettingSubmit){
        emailSetting = emailSettingSubmit;
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("emailSetting", emailSetting);
        return modelAndView;
    }
}
