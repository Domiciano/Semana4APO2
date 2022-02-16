package model;

import java.util.ArrayList;

public class EmailsData {
	
	private static ArrayList<String> emails = new ArrayList<>();
	
	public static void addEmail(String email) {
		
		emails.add(email);
	}
	
	public static ArrayList<String> getData(){
		
		return emails;
	}
	
}
