package com.practice.entities;

/**
 * Created by nex7wol on 05-10-2015.
 */
public class SaleableItem {


    private String code;
    private String name;
    private double cost;
    private double saleDiscountPercent;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isUnderSaleOffer() {
        return true;
    }


	public double getSaleDiscountPercent() {
		return saleDiscountPercent;
	}

	public void setSaleDiscountPercent(double saleDiscountPercent) {
		this.saleDiscountPercent = saleDiscountPercent;
	}
}
