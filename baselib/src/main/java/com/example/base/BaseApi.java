package com.example.base;

import io.micronaut.http.annotation.Get;

public interface BaseApi {
	@Get("/get/base")
	String Base();
}
