package com.example.lib;

import io.micronaut.http.annotation.Get;

public interface TestApi extends BaseApi {
	@Get("/get/value")
	String getValue();
}
