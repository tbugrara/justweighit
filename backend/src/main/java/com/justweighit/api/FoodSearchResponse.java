package com.justweighit.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodSearchResponse {
	
	@JsonProperty
	private String name;
	@JsonProperty
	private String ndbno;
	@JsonProperty
	private String grams;
	
	public FoodSearchResponse(String ndbno, String name) {
		this.ndbno = ndbno;
		this.name = name;
	}
}