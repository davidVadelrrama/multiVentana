package model;

import java.util.ArrayList;

public class EmailsData {

	public static ArrayList<String> emails = new ArrayList<String>();
	
	public static void addEmail(String email) {
		emails.add(email);
	}
	
	public static ArrayList<String> getData(){
		
		return emails;
	}

}
