package br.com.microservicessb.PersonV1.service;

import br.com.microservicessb.PersonV1.Exceptions.UnsuportedMathOperationException;
import br.com.microservicessb.PersonV1.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperationService {

    @Autowired
    private UtilsStringNumber utilsStringNumber;

    public Person findById (String number1) throws RuntimeException{
        if (utilsStringNumber.isNumeric(number1)==false){
            throw new UnsuportedMathOperationException("Coloque um valor numérico!");
        }
        else{
            Person person = new Person(1,"Anna", "May", "Ferreira", "Barueri -São Paulo - Brasil");
            return person;
        }
    }
    public List<Person> findAll (){
        List <Person> listaPessoas = new ArrayList<>();
        for (int i = 0; i<7; i++){
            Person person = new Person(i,"Anna"+ i, "May", "Ferreira", "Barueri -São Paulo - Brasil");
            listaPessoas.add(person);
        }
        return listaPessoas;
    }

}

