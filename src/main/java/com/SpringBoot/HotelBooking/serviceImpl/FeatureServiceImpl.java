package com.SpringBoot.HotelBooking.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.service.FeatureService;

@Service
public class FeatureServiceImpl implements FeatureService {

	@Override
	public Integer[] getFeature(Long id) {
		// TODO Auto-generated method stub
		List<Integer> ids = new ArrayList<>();
	//	int count =0;
		while(id>0) {
			if((id & 1) > 0) {
				ids.add(1);
			}
			else {
				ids.add(0);
			}
		//	count++;
			id= id>>1;
		}
		
		return ids.stream().toArray(Integer[]::new);
	}

	@Override
	public Integer setFeature(Long[] ids) {
		// TODO Auto-generated method stub
	   int sum=0;
       for(Long id:ids) {
    	   sum += Math.pow(2, id);
       }
       return sum;
	}
}
