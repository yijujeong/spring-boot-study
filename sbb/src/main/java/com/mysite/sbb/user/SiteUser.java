package com.mysite.sbb.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

	@Column(unique = true) // 유일한 값만 저장할 수 있음
	private String username;
	
	private String password;
	
	@Column(unique = true)
	private String email;
}
