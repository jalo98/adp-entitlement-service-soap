package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum DataEntitlementTypeEnum {
	FIRST("CL-DEF", new ArrayList<String>(Arrays.asList("027"))),
	SECOND("CL-ALT", new ArrayList<String>(Arrays.asList("027"))),
	THIRD("ACTRANGE", new ArrayList<String>(Arrays.asList("61400000", "85155000", "89600000", "91525000"))),
	FOURTH("BPMFLIST", new ArrayList<String>(Arrays.asList("Y")));

	private String name;
	private List<String> stringValues;

	private DataEntitlementTypeEnum(String name, List<String> stringValues) {
		this.name = name;
		this.stringValues = stringValues;
	}

	public String getName() {
		return name;
	}

	public List<String> getStringValues() {
		return stringValues;
	}
	
	
}
