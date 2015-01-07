package com.bobby.batog.core.entity;
import javax.persistence.*;
import java.util.*;

@Entity
public class Country{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int country_id;
	private String country;
	private Date last_update;
	@OneToMany(mappedBy = "country")
	private List<City> cityList;

	public void setCityList(List<City> cityList){
		this.cityList = cityList;
	}
	public List<City> getCityList(){
		return cityList;		
	}
	public void setCountry_id(int country_id){
		this.country_id = country_id;
	}
	public int getCountry_id(){
		return country_id;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public String getCountry(){
		return country;
	}
	public void setLast_update(Date last_update){
		this.last_update = last_update;
	}
	public Date getLast_update(){
		return last_update;
	}
}