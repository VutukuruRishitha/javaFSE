package com.cognizant.spring_data_jpa_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_data_jpa_demo.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByStateNameContaining(String text);

    List<State> findByStateNameStartingWith(String text);

}