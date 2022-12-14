package com.example.apichamada.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EnderecoEntity {
    private Long id; // gerado automaticamente
    private String logradouro;
    private String numero;
}
