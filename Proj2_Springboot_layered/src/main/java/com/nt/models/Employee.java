package com.nt.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	
	private Integer empno ;
	private String name ;
	private String job ;
	private Float sal ;
	
}
