
public class Fibonacci {
	    public static void main(String[] args) {
	        int a=0;
	        int b=1;
	        // 0,1,1,2,3,5,8,13,21...
	        
	        for(int i=1;i<=7;i++) {
	            System.out.println(a);
	            int c=a+b; //0+1=1 c= 1+1=2
	            a=b;       // a=1
	            b=c;      //b=2
	            
	            }

	    }

	}