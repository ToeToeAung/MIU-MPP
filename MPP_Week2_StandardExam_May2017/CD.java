package MPP_Week2_StandardExam_May2017;

public class CD extends LendingItem{
	private String productId;
	private String title;
	private String company;
	
	public CD(String productId,String title,String company) {
		super(1);
		this.productId = productId;
		this.title = title;
		this.company = company;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCompany() {
		return company;
	}
	
	public ItemType getItemType() {
		return ItemType.CD;
	}
}
