package herança.fixacao2.entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(Double customsFee) {
		this.customsFee = customsFee;
	} 
	
	@Override
	public String priceTag(String name, Double price) {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $ " + price);		
		return sb.toString();			
	}
	

}
