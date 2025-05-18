package com.mcnz.mcp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class PreferredCandyService {

	@Tool(name="MyPreferredCandy", description="Find the preferred candy or treat for Cameron which is me!")
	public String preferredCandy(@ToolParam(description="Name of the candy or treat category.") String category) {
		if (category.equalsIgnoreCase("fastfood")) {
			return "McDonalds";
		}
		if (category.equalsIgnoreCase("chips")) {
			return "ketchup";
		}
		if (category.equalsIgnoreCase("candy")) {
			return "smarties";
		}
		return "Anything chocolate";
	}
	
}
