package com.premium.outlet.controller;



import com.premium.outlet.dto.DadosCadastrarRoupa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roupa")
public class ControllerRoupa {

    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosCadastrarRoupa roupa){
        System.out.println(roupa);
    }
}
