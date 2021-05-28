package com.example.app;

import java.util.ServiceLoader;

import com.example.world.service.WorldService;

public class ExampleApp {
	// Project A -> JAR (Deployment) -> Project B
	public static void main(String[] args) {
		WorldService worldSrv = ServiceLoader.load(WorldService.class)
				                .findFirst().get();
		worldSrv.findRichCountries().forEach(System.out::println);
	}

}
