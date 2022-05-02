package com.example.lib;

import io.micronaut.http.annotation.Get;

public interface TestApi {
	@Get("/get/value")
	String getValue();
}
