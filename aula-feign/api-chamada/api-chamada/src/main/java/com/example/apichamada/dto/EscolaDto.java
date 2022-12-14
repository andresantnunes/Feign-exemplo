package com.example.apichamada.dto;

import com.example.apichamada.dto.EnderecoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EscolaDto {
    private String nome;
    private EnderecoDto endereco;
}
