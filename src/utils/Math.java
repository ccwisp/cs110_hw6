package utils;

public class Math {

	public static int rfactorial(int a){
		if (a==0) { return 1; }
		return a * rfactorial(a-1);
	}
	
	public static int lfactorial(int a) {
		int t = 1;
		if (a==0) { return 1;}
		for (int i=1 ; i<=a; i++) {
			t = t*i;
		}
		return t; 
		
			
	}
}
