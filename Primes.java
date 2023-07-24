package Assigment4;

public class Primes {
	public static void main(String[] args) {
		int n= 4;
	    boolean a = false;
	    for (int i = 2; i <= n-2; ++i) {
	      if (n % i == 0) {
	        a = true;
	      }
	    }
	    if (a)
	      System.out.println("Non prime Number");
	    else
	      System.out.println("prime Number");
	  }
	
	}


