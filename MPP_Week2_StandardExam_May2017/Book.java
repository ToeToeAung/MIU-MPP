package MPP_Week2_StandardExam_May2017;

public class Book extends LendingItem{
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	public Book(String isbn,String title,String authorFirstName,String authorLastName) {
		super(1);
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName =  authorLastName;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthorFirstName(){
		return authorFirstName;
	}
	
	public String getAuthorLastName() {
		return authorLastName;
	}	
	
	public ItemType getItemType() {
		return ItemType.BOOK;
	}
}
