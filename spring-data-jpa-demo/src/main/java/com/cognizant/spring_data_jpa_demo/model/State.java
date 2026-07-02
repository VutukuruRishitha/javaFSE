package com.cognizant.spring_data_jpa_demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "state")
public class State {

    @Id
    @Column(name = "state_id")
    private int stateId;

    @Column(name = "state_name")
    private String stateName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Country country;

    public State() {
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "State [stateId=" + stateId +
                ", stateName=" + stateName + "]";
    }

}