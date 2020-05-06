package com.SpringBoot.HotelBooking.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Facility;
import com.SpringBoot.HotelBooking.repository.FacilityRepsitory;
import com.SpringBoot.HotelBooking.service.FacilityService;
import com.SpringBoot.HotelBooking.service.FeatureService;

@Service
public class FacilityServiceImpl implements FacilityService {

	private FacilityRepsitory facilityRepsitory;
	private FeatureService featureService;

	@Autowired

	public FacilityServiceImpl(FacilityRepsitory facilityRepsitory, FeatureService featureService) {
		this.facilityRepsitory = facilityRepsitory;
		this.featureService = featureService;
	}

	@Override
	public List<Facility> getFacilities(Long id) {
		// TODO Auto-generated method stub
		Integer[] ids = featureService.getFeature(id);
		List<Facility> facilities = new ArrayList<Facility>();

		for (int i = 1; i < ids.length; i++) {

			if (ids[i] > 0) {
				facilities.add(facilityRepsitory.findByFacilityId(new Long(i)));
			}
		}
		return facilities;
	}

	@Override
	public void setFacilities(Long[] ids) {
		// TODO Auto-generated method stub

	}

}
