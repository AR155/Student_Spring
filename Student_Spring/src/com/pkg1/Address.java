package com.pkg1;

public class Address
{
       private String lane;
       private String city;
       
	  public Address(String lane, String city)
	  {
		super();
		this.lane = lane;
		this.city = city;
	  }

	@Override
	public String toString() {
		return "Address [lane=" + lane + '\''+ ", city=" + city +'\''+ "]";
	}     
	
}
