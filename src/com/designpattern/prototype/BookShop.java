package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;
	private List<Book> books  = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void loadBooks() {
		for(int i=1;i<=10;i++) {
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book "+i);
			getBooks().add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		BookShop bookShop = new BookShop();
		for(Book b: getBooks()) {
			bookShop.getBooks().add(b);
		}
		return bookShop;
	}
	
	
	
	

}
