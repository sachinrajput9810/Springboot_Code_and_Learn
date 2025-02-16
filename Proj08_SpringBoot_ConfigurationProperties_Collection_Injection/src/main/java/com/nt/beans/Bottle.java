package com.nt.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("bottle")
@Data
@ConfigurationProperties("bottle.info")
public class Bottle {
	private Integer bno ; // Integer
	private String companyName ; // string
	private String[] color ; // array type
	private List<Integer> capacity ;
	private Set<Integer> types ;
	private Map<String ,Object> bottleDetail ;
	private MaterialInfo detail ;
	
	
}
