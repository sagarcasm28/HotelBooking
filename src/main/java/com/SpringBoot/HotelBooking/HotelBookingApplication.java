package com.SpringBoot.HotelBooking;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = { "com.SpringBoot.HotelBooking.**" })
public class HotelBookingApplication implements ApplicationRunner{
	
	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<String, Object> m=applicationContext.getBeansWithAnnotation(org.springframework.web.bind.annotation.RestController.class);
		
		for(Map.Entry<String, Object> e: m.entrySet()) {
			
			System.out.println(e.getKey());
		}
		
		
		// TODO Auto-generated method stub
		
		
	}
}
