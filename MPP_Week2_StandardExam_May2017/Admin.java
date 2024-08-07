package MPP_Week2_StandardExam_May2017;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		for(LibraryMember member: members) {
			phoneNums.add(member.getPhone());
		}
		return phoneNums;
	}
}
