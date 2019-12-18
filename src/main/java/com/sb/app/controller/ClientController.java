package com.sb.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.app.service.WeatherService;

@RestController
public class ClientController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/current/weather")
	public String getWeather() {
		return "The current weather is " + weatherService.getWeather();
	}

}
