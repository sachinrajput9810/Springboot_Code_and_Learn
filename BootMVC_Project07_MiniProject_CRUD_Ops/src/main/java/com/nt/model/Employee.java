package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@Table(name = "emp")
public class Employee {

	@Id
	@SequenceGenerator(name = "gen1" , sequenceName = "EMP_ID_SEQ" , allocationSize = 1 )
	@GeneratedValue(generator = "gen1" , strategy = GenerationType.SEQUENCE )
	@NonNull
	private Integer empNo ;
	

	@Column(length = 20)
	private String ename ;
	
	@Column(length = 20)
	private String job ;
	
	private Float sal ;
}
