package com.yash.CurrencyConverter.service;

import javax.ejb.Local;

@Local
public interface CurrencyEJBLocal {
	public Double convertToRupee(Double dollar);
}
