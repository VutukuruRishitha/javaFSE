package com.cognizant.spring_rest_country.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_rest_country.Country;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");

        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml")) {

            Country country = context.getBean("country", Country.class);

            LOGGER.info("Country : {}", country);

            LOGGER.info("END");

            return country;
        }
    }
}