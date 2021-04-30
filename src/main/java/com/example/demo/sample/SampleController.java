package com.example.demo.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/list")
	public List<SampleEntity> RetrieveSampleEntity() {
		return this.sampleService.RetrieveSampleEntity();
	}
	
	@GetMapping("/insert")
	public String InsertSampleEntity(@RequestParam String value) {
		SampleEntity sampleEntity = this.sampleService.SaveSampleEntity(value);
		return sampleEntity.getSampleValue()+" saved";
	}
	
	@GetMapping("/invokeServerError")
	public String InsertSampleEntity() {
		Integer.parseInt("ss");
		return "error";
	}
}
