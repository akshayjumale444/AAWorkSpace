package com.lti.bean;

public class Order 
{
	private int orderid;
	private Product product;
	private int quantity;
	private double bill;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, Product product, int quantity) {
		super();
		this.orderid = orderid;
		this.product = product;
		this.quantity = quantity;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}
	
	public void showOrder()
	{
		System.out.println("Your Order ID "+orderid);
		System.out.println("List of order\n"+product.display());
		System.out.println("Quantity"+quantity);
		bill=product.getPrice()*quantity;
		System.out.println("Payable bill is Rs "+bill);
	}

}
