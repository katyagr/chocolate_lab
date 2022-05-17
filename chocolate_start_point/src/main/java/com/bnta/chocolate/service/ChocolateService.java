package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ChocolateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public List<Chocolate> findAll() {
        return chocolateRepository.findAll();
    }
    public Chocolate save(Chocolate chocolate){
        return chocolateRepository.save(chocolate);
    }

    public Optional<Chocolate> dairyMilk() {
        return chocolateRepository.findById(1L);
    }

    public List<Chocolate> findCocoaPercentageOver60(){
        return chocolateRepository.findPercentageCocoaOver60();
    }

}
