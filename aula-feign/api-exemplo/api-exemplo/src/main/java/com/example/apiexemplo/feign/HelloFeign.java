package com.example.apiexemplo.feign;

import com.example.apiexemplo.dto.EnderecoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url="http://localhost:8000/endereco", name = "hello")
public interface HelloFeign {
    @GetMapping
    EnderecoDto buscaEndereco();

    @PostMapping
    EnderecoDto repeteEndereco(@RequestBody EnderecoDto cep);
}
