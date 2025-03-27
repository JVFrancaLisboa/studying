package br.com.jvfrancalisboa.controllers;

import br.com.jvfrancalisboa.exception.OrderNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public String showOrder(@PathVariable("id") Long id){
        // Non-existent repository logic
        if(!isNumericValid(id)) throw new OrderNotFoundException("id must be valid");

        return "congratulations your id is valid";
    }

    private boolean isNumericValid(Long id) {
        return id > 0 && id < 10;
    }
}
