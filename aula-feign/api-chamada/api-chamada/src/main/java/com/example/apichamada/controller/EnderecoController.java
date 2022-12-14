package com.example.apichamada.controller;

import com.example.apichamada.dto.EnderecoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

    @GetMapping
    public ResponseEntity retornaEndereco(){
        return ResponseEntity.ok( new EnderecoDto("Rua das pipocas","111"));
    }

    @PostMapping
    public EnderecoDto repeteEndereco(@RequestBody EnderecoDto endereco){
        return endereco;
    }

}
