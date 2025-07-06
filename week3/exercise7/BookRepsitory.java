package repository;

public class BookRepository 
{
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting ID.......");
		this.id = id;
	}


  public BookRepository(){
    this.id=id;
    System.out.println("Constructor");
  }

	
}
