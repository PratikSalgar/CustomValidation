package com.validation.Entity;

import com.validation.StringNameValidator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User 
{
	@Id
	private int id;
	@StringNameValidator
	private String name; 
}
