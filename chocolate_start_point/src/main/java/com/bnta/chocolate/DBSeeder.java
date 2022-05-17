package com.bnta.chocolate;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBSeeder implements ApplicationRunner {
    @Autowired
    private EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate e1 = new Estate("Cadbury", "UK");
        Estate e2 = new Estate("Hersheys", "USA");
        Estate e3 = new Estate("Mars", "UK");
        Estate e4 = new Estate("Kinder", "Germany");
        Estate e5 = new Estate("Lindt", "Swiss");

        Chocolate c1 = new Chocolate("Dairy Milk", 20, e1);
        Chocolate c2 = new Chocolate("Twix", 5, e3);
        Chocolate c3 = new Chocolate("Cookies and cream", 10, e2);
        Chocolate c4 = new Chocolate("Bueno", 14, e4);
        Chocolate c5 = new Chocolate("Creme Egg", 20, e1);
        Chocolate c6 = new Chocolate("Lindor Milk", 30, e5);
        Chocolate c7 = new Chocolate("Excellence", 70, e5);
        Chocolate c8 = new Chocolate("Mars", 10, e3);

        e1.setChocolates(List.of(c1, c5));
        e2.setChocolates(List.of(c3));
        e3.setChocolates(List.of(c2, c8));
        e4.setChocolates(List.of(c4));
        e5.setChocolates(List.of(c6, c7));

        estateRepository.saveAll(List.of(e1,e2,e3,e4,e5));
    }
}
