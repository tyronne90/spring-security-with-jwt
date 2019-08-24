package com.spring.security.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JwtResponse implements Serializable {

	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}