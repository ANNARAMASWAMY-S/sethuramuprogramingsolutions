package product;




public class Main 
{
	public static void main(String args[])
	{
		
		
		Product[] products = {
	            new Product(1, "Laptop", "Electronics"),
	            new Product(2, "Shirt", "Fashion"),
	            new Product(3, "Phone", "Electronics"),
	            new Product(4, "Shoes", "Footwear")
	        };

	        // Linear search
	        System.out.println("Linear Search Result:");
	        Product result1 = LinearSearch.linearSearch(products, "Phone");
	        if(result1!=null)
	        {
	        	System.out.println(result1.toString());
	        }
	        else
	        {
	        	System.out.println("Product not found");
	        }
	        
	        
	        
	        //BinarySearch
	        System.out.println("Binary Search Result:");
	        BinarySearch.sortProducts(products);
	        Product target3=BinarySearch.binarySearch(products, "Phone");
	        if(target3!=null)
	        {
	        	System.out.println(target3.toString());
	        }
	        else
	        {
	        	System.out.println("Product not found");
	        }
	        
		
	        
	        
	        
		
		
		
		
		
	}
}
