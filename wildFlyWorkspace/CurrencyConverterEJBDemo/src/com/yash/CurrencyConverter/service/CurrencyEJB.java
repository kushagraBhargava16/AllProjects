package com.yash.CurrencyConverter.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CurrencyEJB
 */
@Stateless
@LocalBean
public class CurrencyEJB implements CurrencyEJBLocal {

	public CurrencyEJB() {
		// TODO Auto-generated constructor stub
	}

	public Double convertToRupee(Double dollar) {
		Double rupee = (dollar * 64.55);
		return rupee;
	}

}
