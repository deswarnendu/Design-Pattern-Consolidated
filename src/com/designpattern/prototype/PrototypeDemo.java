package com.designpattern.prototype;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bookShop = new BookShop();
		bookShop.setShopName("A1");
		bookShop.loadBooks();
		BookShop bookShop2 = (BookShop) bookShop.clone();
		bookShop.getBooks().remove(2);
		System.out.println(bookShop);
		
		
		//Shallow Cloning
		
		bookShop2.setShopName("A1-Clone");
		System.out.println(bookShop2);
		

	}

}
