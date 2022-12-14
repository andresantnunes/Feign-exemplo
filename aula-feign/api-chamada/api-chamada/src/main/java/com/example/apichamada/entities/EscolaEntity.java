package com.example.apichamada.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EscolaEntity {
    private Long id;
    private String nome;
    private EnderecoEntity endereco; // OneToOne
}
