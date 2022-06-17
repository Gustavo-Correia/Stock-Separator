package entities;

public class Product {

	public String productName;
	public double productPrice;
	public int productQuantity;

	public double totalValueInStock() {
		return productPrice * productQuantity;
	}

	public void addProducts(int quantity) {
		this.productQuantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.productQuantity -= quantity;
	}

	public String toString() {
    return productName + ", $" + String.format("%.2f", productPrice) + ", " + productQuantity
    		+ "unity, Total Value: $ " + totalValueInStock();
       
        
        
        
        
        
        
        
	}

}
