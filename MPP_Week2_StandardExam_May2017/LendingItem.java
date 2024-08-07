package MPP_Week2_StandardExam_May2017;

public abstract class LendingItem {
	private int numCopiesInLab;
	
	public LendingItem(int numCopiesInLab) {
		this.numCopiesInLab = numCopiesInLab;
	}
	
	public int getNumCopiesInLib() {
		return numCopiesInLab;
	}
	
	public void setNumCopiesInLib(int numCopiesInLab) {
		this.numCopiesInLab =numCopiesInLab;
	}
	
	public abstract ItemType getItemType();
}
