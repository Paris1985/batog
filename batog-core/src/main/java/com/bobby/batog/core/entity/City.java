package com.bobby.batog.core.entity;
import javax.persistence.*;
import java.util.*;

@Entity
public class City{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	private String city;

	@ManyToOne
	private Country country;
	private Date last_update;

	public void setCity_id(int city_id){
		this.city_id = city_id;
	}
	public int getCity_id(){
		return city_id;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setCountry(Country country){
		this.country = country;
	}
	public Country getCountry(){
		return country;
	}
	public void setLast_update(Date last_update){
		this.last_update = last_update;
	}
	public Date getLast_update(){
		return last_update;
	}
}