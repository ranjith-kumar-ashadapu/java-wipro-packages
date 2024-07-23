
package com.automobile.twoWheeler;
import com.automobile.vehicle;
public class Honda extends vehicle
{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	int speed; 
	 public Honda(String modelName,String registrationNumber,String ownerName,int speed)
	 {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;	
	 }
	 public String getModelName()
	 {
		 return modelName;
	 }
	 public String getRegistrationNumber()
	 {
		 return registrationNumber;
	 }
	 public String getOwnerName()
	 {
		 return ownerName;
	 }
	 public int getSpeed()
	 {
		 return speed;
	 }
	 public void cdPlayer()
	 {
		 System.out.println("Not available");
	 }
}
