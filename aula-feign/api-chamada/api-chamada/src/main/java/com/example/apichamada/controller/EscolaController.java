//package com.example.apichamada.controller;
//
//import com.example.apichamada.dto.EscolaDto;
//import com.example.apichamada.entities.EnderecoEntity;
//import com.example.apichamada.entities.EscolaEntity;
//import com.example.apichamada.feign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class EscolaController {
//
//    private final FeignClient feign;
//
//    public EscolaController(FeignClient feign) {
//        this.feign = feign;
//    }
//
//    @PostMapping
//    public void salvarEscola(@RequestBody EscolaDto escolaDto){
//        escolaDto.getNome();
//        escolaDto.getEndereco().getNumero();
//        escolaDto.getEndereco().getLogradouro();
//
//        feign.buscaLogradouro(escolaDto.getEndereco().getLogradouro());//chamada do feign
//
//        EnderecoEntity enderecoEntity = EnderecoEntity.builder()
//                .numero(escolaDto.getEndereco().getNumero())
//                .logradouro(escolaDto.getEndereco().getLogradouro())
//                .build();
//
//        enderecoRespository.save(enderecoEntity
//        );
//
//
//        escolaRepository.save(EscolaEntity.builder()
//                .nome(escolaDto.getNome())
//                .endereco(enderecoEntity)
//                .build()
//        );
//
//    }
//
//}
