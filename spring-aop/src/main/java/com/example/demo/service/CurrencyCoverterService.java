package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.ifaces.CurrencyCoverter;

@Service
public class CurrencyCoverterService implements CurrencyCoverter {

	@Override
	public double inrToUsd(double amount) {
		// System.out.println("InrTousd method called");
		try {
			Thread.sleep(100);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return amount*80;
	}

	@Override
	public double inrToEuro(double amount) {
		// System.out.println("InrToEuto method called");
		try {
			Thread.sleep(150);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return amount*90;
		// 
	}

}
