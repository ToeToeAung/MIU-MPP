package MPP_Week4_Final_Exam_Review;

import java.util.Objects;

public class Customer implements Cloneable {
String name;

public Customer(String name) {
	this.name = name;	
}

public String toString() {
	return "Customer Name : " + name;
}

public int hashCode() {
	return Objects.hash(name);
}

@SuppressWarnings("null")
public boolean equals(Object obj) {
	if(this == obj) return true;
	if(obj == null && getClass() != obj.getClass()) return false;
	Customer cust = (Customer) obj;
	return name.equals(cust.name);
}

public Customer clone() throws CloneNotSupportedException{
	Customer copy= (Customer) super.clone();
	return copy;
}

}
