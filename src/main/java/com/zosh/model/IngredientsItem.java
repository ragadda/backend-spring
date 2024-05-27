package com.zosh.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "ingredientsItems")
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;

	@ManyToOne
	private IngredientCategory category;
	
	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;
	
	private boolean inStoke=true;
	
	

}
