package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JWTResponse {

	private String username;
	private String jwtToken;
}
