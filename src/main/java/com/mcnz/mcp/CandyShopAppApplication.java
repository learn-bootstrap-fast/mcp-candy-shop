package com.mcnz.mcp;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandyShopAppApplication {
	
	@Bean
	public ToolCallbackProvider preferredCandies(PreferredCandyService service) {
		return MethodToolCallbackProvider.builder().toolObjects(service).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(CandyShopAppApplication.class, args);
	}

}
