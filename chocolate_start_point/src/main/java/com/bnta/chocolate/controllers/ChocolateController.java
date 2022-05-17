package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping("/chocolate")
    public List<Chocolate> findAll(){
        return chocolateService.findAll();
    }

    @GetMapping("/dairymilk")
    public Optional<Chocolate> dairyMilk(){
        return chocolateService.dairyMilk();
    }

    @PostMapping("/chocolate")
    public Chocolate post(@RequestBody Chocolate chocolate){
        return chocolateService.save(chocolate);
    }

    @GetMapping("/darkchocolate")
    public List<Chocolate> cocoaPercentageOver60(){
        return chocolateService.findCocoaPercentageOver60();
    }


}
