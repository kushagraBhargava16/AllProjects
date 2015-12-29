package com.yash.rmi.service;

import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Calculator
 */
@Stateful
@Remote(CalculatorRemote.class)
public class Calculator implements CalculatorRemote {

    /**
     * Default constructor. 
     */
    public Calculator() {
        // TODO Auto-generated constructor stub
    }

}
