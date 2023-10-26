package bssic;

public class Overflow {
	
	public static void main(String args[]) {
		int a=130;
		byte b=(byte)a;
		System.out.println(b);
		
		//decause byte have -128 to +127 range value and the default value is 0
		
		//so we trying to access mpore then specified range it will minus the value
		
		//127 is in positve and it jump in to negative number
		
		int d=128;//here we specify with 127 it return 127 positive value
		byte e=(byte)d;
		System.out.println(e);
		
	}

}
