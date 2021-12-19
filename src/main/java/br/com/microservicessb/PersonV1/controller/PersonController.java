package br.com.microservicessb.PersonV1.controller;

import br.com.microservicessb.PersonV1.domain.Person;
import br.com.microservicessb.PersonV1.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person", method = RequestMethod.GET)
public class PersonController {

    @Autowired
    private OperationService operationService;

    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public Person findById (@PathVariable ("id") String id)  {
       return operationService.findById(id);
    }

    @RequestMapping (method = RequestMethod.GET)
    public List<Person> findAll ()  {
        return operationService.findAll();
    }
}
