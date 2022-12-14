package com.example.apiexemplo.controller;

import com.example.apiexemplo.dto.EnderecoDto;
import com.example.apiexemplo.feign.HelloFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    private final HelloFeign feign;

    public FeignController(HelloFeign feign) {
        this.feign = feign;
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping(value = "/feign", consumes = "application/json")
    public EnderecoDto buscaEnderecoFeign(){
        return feign.buscaEndereco();
    }

    @PostMapping(value = "/feign", consumes = "application/json")
    public EnderecoDto repeteEnderecoFeing(@RequestBody EnderecoDto enderecoDto){
        return feign.repeteEndereco(enderecoDto);
    }
}
