package org.company;
import org.client.Client;
public class Company extends Client {
private void companyName() {
	System.out.println("Company Name is ABC pvt ltd");
}
public static void main(String[] args) {
	
	Company c = new Company();
	c.clientName();
	c.companyName();
}
}
