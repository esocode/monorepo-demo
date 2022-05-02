package com.example.app3;

import com.example.lib.TestApi;
import io.micronaut.http.annotation.Controller;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

@Controller
@ExecuteOn(TaskExecutors.IO)
public class Controller3 implements TestApi {
	@Override
	public String getValue() {
		return "APP3";
	}
}
