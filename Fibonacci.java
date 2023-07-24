package ifCondition;

public class Fibonacci {
	public static void main(String[] args) {
	 int firstNum=0;
	 int secNum=1;
	  int num;    
	 
	    
	 for(int i=2;i<11;i++)
	 {    
	  num=firstNum+secNum;    
	  System.out.print(" "+num);    
	  firstNum=secNum;    
	  secNum=num;    
	 }    
	  
	}
}
