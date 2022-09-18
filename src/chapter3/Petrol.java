package chapter3;

import java.util.Scanner;

public class Petrol {
	private String location;
	private String petrolType;
	private int quantity;
	private double pricePerLitre;
	private double percentageDiscount;

	public Petrol (String location, String petrolType, int quantity, double pricePerLitre, double percentageDiscount){
		this.location = location;
		this.petrolType = petrolType;
		this.quantity = quantity;
		this.pricePerLitre = pricePerLitre;
		this.percentageDiscount = percentageDiscount;
	}

	public void setLocation (String location){
		this.location = location;
	}

	public String getLocation() {
		return this.location;
	}

	public void setPetrolType (String petrolType){
		this.petrolType = petrolType;
	}

	public String getPetrolType() {
		return this.petrolType;
	}

	public void setQuantity (int quantity){
			this.quantity = quantity;
	}

	public int getQuantity (){
		return this.quantity;
	}

	public void setPricePerLitre (double pricePerLitre){
			this.pricePerLitre = pricePerLitre; 
	}

	public double getPricePerLitre() {
		return this.pricePerLitre;
	}

	public void setPercentageDiscount (double percentageDiscount){
		this.percentageDiscount = percentageDiscount;
	}

	public double getPercentageDiscount(){
		return this.percentageDiscount;
	}

	public double getPurchaseAmount(){
		double purchaseAmount = (quantity * pricePerLitre) - percentageDiscount;
		return purchaseAmount;
	}

}