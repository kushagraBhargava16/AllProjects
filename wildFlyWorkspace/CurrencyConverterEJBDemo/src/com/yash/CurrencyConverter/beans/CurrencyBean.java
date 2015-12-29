package com.yash.CurrencyConverter.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.CurrencyConverter.service.CurrencyEJB;
import com.yash.CurrencyConverter.service.CurrencyEJBLocal;

@ManagedBean
@SessionScoped
public class CurrencyBean {
	double value;
	double rupee;
	String currencyName;
	
	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getRupee() {
		return rupee;
	}

	public void setRupee(double rupee) {
		this.rupee = rupee;
	}

	@EJB

	CurrencyEJBLocal currencyEJB;

	public String convert() {
		rupee = currencyEJB.convertToRupee(value);
		return "hello";
	}
}
