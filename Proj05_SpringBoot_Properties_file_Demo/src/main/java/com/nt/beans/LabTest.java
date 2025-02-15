package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("lab")
@Data
public class LabTest {

	@Value("${test.blood}")
	private int bloodTestPrice ;
	
	
	@Value("${test.mri}")
	private int mriTest ;
	
}
