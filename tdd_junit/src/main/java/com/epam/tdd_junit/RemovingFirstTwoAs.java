package com.epam.tdd_junit;

public class RemovingFirstTwoAs {
	public static void main(String args[]) {
		RemovingFirstTwoAs r=new RemovingFirstTwoAs();
		System.out.print(r.remove("BAACD"));
	}
	
	public String remove(String string) {
		
		char f1=string.charAt(0);
		char f2=string.charAt(1);
		
		if(f1=='A'&f2=='A') {
			return string.substring(2,string.length());
		}
		else if(f1=='A') {
			return string.substring(1,string.length());

		}
		else if(f2=='A') {
			StringBuilder stringbuilder=new StringBuilder();
			stringbuilder.append(string.charAt(0));
			return (stringbuilder.append(string.substring(2,string.length()))).toString();
		}
		else {
			return string;
		}
		
	
	}
}
