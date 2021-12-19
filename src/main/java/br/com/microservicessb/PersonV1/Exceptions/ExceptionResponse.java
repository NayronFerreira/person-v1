package br.com.microservicessb.PersonV1.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExceptionResponse implements Serializable {

    private Date timestamp;
    private String mensagem;
    private String detalhes;

}
