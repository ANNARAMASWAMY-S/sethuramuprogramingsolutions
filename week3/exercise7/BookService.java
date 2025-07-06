package service;

import repository.BookRepository;

public class BookService 
{
	String name;
	
	BookRepository br;
	
	public BookRepository getBr() {
		return br;
	}

	public void setBr(BookRepository br) {
		this.br = br;
	}

	public BookService() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting up............");
		this.name = name;
	}

	public BookService(String name) {
    System.out.println("Setting up............");
		this.name = name;
	}


	public BookService(int id) {
    System.out.println("Setting up............");
		this.id = id;
	}


	
	
	
	
}
