package com.insurance.provider;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("insurance-service")
public class InsuranceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

//	@GetMapping("/getAllPlans")
//	public List<String> getPlans(){
//		return Arrays.asList("Silver","Gold","Platinum");
//	}
	
	@GetMapping("/getUpdatedPlans")
	public List<String> getUpdatedPlans(){
		return Arrays.asList("Silver","Gold","Platinum","Premium");
	}
}
