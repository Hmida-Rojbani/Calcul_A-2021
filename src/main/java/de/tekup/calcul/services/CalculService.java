package de.tekup.calcul.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.tekup.calcul.models.Data;

@Service
public class CalculService {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public List<Integer> sumBatch(Data data){
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < data.getOp1().size(); i++) {
			res.add(data.getOp1().get(i) + data.getOp2().get(i));
		}
		
		return res;
	}

}
