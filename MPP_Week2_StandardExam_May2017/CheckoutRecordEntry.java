package MPP_Week2_StandardExam_May2017;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType itemType;
	private LendingItem lendingItem;
	
	public CheckoutRecordEntry(LendingItem lendingItem,LocalDate checkoutDate,LocalDate dueDate,ItemType itemType) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.itemType = itemType;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	
	public ItemType getLendingItemType() {
		return itemType;		
	} 
	
	
	
	
}
