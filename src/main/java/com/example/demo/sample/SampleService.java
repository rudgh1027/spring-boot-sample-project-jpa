package com.example.demo.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	@Autowired
	private SampleEntityRepository sampleEntityRepository;
	
	public List<SampleEntity> RetrieveSampleEntity() {
		return this.sampleEntityRepository.findAll();
	}
	
	public SampleEntity SaveSampleEntity(String SampleValue) {
		return this.sampleEntityRepository.save(new SampleEntity(SampleValue));
	}
}
