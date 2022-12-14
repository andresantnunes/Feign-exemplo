//package com.example.apichamada.feign;
//
//import com.example.apichamada.dto.EnderecoDto;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@FeignClient(url="https://viacep.com.br/ws/", name = "hello")
//public interface FeignClient {
//    @GetMapping("{cep}/json") // https://viacep.com.br/ws/01001000/json
//    String buscaCep(@PathVariable("cep") String cep); //01001000
//
//    @PostMapping("{cep}/json") // https://viacep.com.br/ws/01001000/json
//    String buscaCep(@RequestBody() EnderecoDto cep); //01001000
//}
