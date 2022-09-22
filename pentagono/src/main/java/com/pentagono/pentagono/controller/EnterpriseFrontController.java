package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEmployeeService;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/enterpriseFront")
public class EnterpriseFrontController {


    @Autowired
    private IEnterpriseService iEnterpriseService;


    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/enterprisesf", method = RequestMethod.GET)/*Ver Empresas*/
    public String enterprises(Model model) {
        List<Enterprise> enterprises = this.iEnterpriseService.getAllEnterprises();
        model.addAttribute("enterprisesf",enterprises);
        return "see_enterprise";
    }



}
