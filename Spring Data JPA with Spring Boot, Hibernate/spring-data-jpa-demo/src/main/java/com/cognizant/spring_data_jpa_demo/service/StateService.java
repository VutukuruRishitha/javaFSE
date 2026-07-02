package com.cognizant.spring_data_jpa_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_data_jpa_demo.model.State;
import com.cognizant.spring_data_jpa_demo.repository.StateRepository;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

    public List<State> searchContaining(String text) {
        return stateRepository.findByStateNameContaining(text);
    }

    public List<State> searchStarting(String text) {
        return stateRepository.findByStateNameStartingWith(text);
    }

    public void addState(State state) {
        stateRepository.save(state);
    }
}