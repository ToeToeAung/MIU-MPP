package MPP_Week3_Day6_Standard_Exam_Stream_May2017_HandWriting;

public class Snippet {
	public static void main(String[] args) {
		
		/*
		 * public class Problem1_HandWriting { // test methods public static void
		 * main(String[] args) { testFirstMethod(); testSecondMethod(); }
		 * 
		 * private static void testFirstMethod() { List<String> list1 =
		 * Arrays.asList(new String[] { "friend", "tree", "bike", "bat" }); List<String>
		 * list2 = Arrays.asList(new String[] { "tree", "strong", "bike", "weak" });
		 * System.out.println("Strings occurring in just one of the two lists: " +
		 * elementsInJustOne(list1, list2)); }
		 * 
		 * private static void testSecondMethod() { Customer cust1 = new Customer("Bob",
		 * "11 Adams", "Fairfield", "52556"); Customer cust2 = new
		 * Customer("Laurence Lebihans", "12, rue des Bouchers", "Marseille", "13008");
		 * Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto",
		 * "94301"); Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd",
		 * "Chicago", "57532"); Customer cust5 = new Customer("Blauer Delikatessen",
		 * "Forsterstr. 57", "Mannheim", "68306"); Customer cust6 = new Customer("Anna",
		 * "1000 N 4th", "Fairfield", "52557"); List<Customer> list =
		 * Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6);
		 * System.out.println("Names of Customers who live in Fairfield: " +
		 * getAllFairfieldCustomers(list)); }
		 * 
		 * static List<String> elementsInJustOne(List<String> list1, List<String>
		 * list2){ List<String> ele = list1.stream().filter(l1 -> !list2.contains(l1) &&
		 * list2.stream().filter(l2 -> !list1.contains(l2)).toList(); }
		 * 
		 * static List<String> getAllFairfieldCustomers(List<Customer> list){ return
		 * List<String> cusList = list.stream() .filter(cus ->
		 * cus.getCity().equals("Fairfield")) .map(Customer::getName) .toList();
		 * 
		 * 
		 * List<String> cusNameList = list.stream()
		 * .collect(Collectors.groupingBy(Customer::getCity)) .entrySet() .stream()
		 * .filter(city -> city.equals("Fairfield")) .flatMap(Map.Entry::getValue)
		 * .toList(); }
		 * 
		 * }
		 */
	}
}

