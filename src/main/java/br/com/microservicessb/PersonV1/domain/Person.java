package br.com.microservicessb.PersonV1.domain;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Person implements Serializable {

    private Integer id;
    private String nome;
    private String segundoNome;
    private String terceiroNome;
    private String endereco;

}
