package de.tekup.calcul.services;

import org.springframework.stereotype.Service;

@Service
public class CalculService {
	
	public int sum(int a, int b) {
		return a+b;
	}

}
