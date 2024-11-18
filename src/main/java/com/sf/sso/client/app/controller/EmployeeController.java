package com.sf.sso.client.app.controller;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import model.Employee;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;


@RestController
public class EmployeeController {
	
	private WebClient webClient;
	
	public EmployeeController(WebClient webClient) {
		this.webClient=webClient;
	}
	
	@GetMapping(value="/employee")
	public Employee getEmployees(@RegisteredOAuth2AuthorizedClient("") OAuth2AuthorizedClient authorizedClient) {
		return this.webClient
				.get()
				.uri("http://127.0.0.1:8090/hrapp/api/employes/2")
				.attributes(oauth2AuthorizedClient(authorizedClient))
				.retrieve()
				.bodyToMono(Employee.class)
				.block();
	}
}
