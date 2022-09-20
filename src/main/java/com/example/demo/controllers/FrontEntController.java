package com.example.demo.controllers;


import com.example.demo.entities.Employee;
import com.example.demo.entities.Enterprise;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Transaction;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.EnterpriseService;
import com.example.demo.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontEntController {
    @Autowired
    private ProfileService profileService;
    @Autowired
    private EnterpriseService enterpriseService;

    public FrontEntController(ProfileService profileService) {
        this.profileService = profileService;
    }


    @GetMapping("/")
public String index(){
    return "index";
}


@GetMapping("/profiles")
    public String profiles(Model modeluser){
    List<Profile> profiles = this.profileService.Buscarprofile();
    modeluser.addAttribute("profile",profiles);
        return "profiles";
}



    @GetMapping("/enterprises")
    public String enterprises(Model modelenterprise){
        List<Enterprise> enterprises =  this.enterpriseService.Buscar();
        modelenterprise.addAttribute("enterprise",enterprises);
        return "enterprises";
    }

}
