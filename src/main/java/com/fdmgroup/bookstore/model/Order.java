package com.fdmgroup.bookstore.model;

import java.time.LocalDateTime;

public class Order {
	private int orderId;
	private Book bookOrdered;
	private User user;
	private LocalDateTime orderDateTime;
	public Order(int orderId, Book bookOrdered, User user, LocalDateTime orderDateTime) {
		super();
		this.orderId = orderId;
		this.bookOrdered = bookOrdered;
		this.user = user;
		this.orderDateTime = orderDateTime;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Book getBookOrdered() {
		return bookOrdered;
	}
	public void setBookOrdered(Book bookOrdered) {
		this.bookOrdered = bookOrdered;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
}
