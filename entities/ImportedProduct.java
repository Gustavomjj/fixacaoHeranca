package herança.fixacao2.entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String toString () {	
		return String.format("%s $ %.2f (Customs fee: $ %.2f)", name, (price+customsFee), customsFee);			
	}
	
}
