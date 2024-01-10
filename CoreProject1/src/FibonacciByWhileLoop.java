public class FibonacciByWhileLoop {
	    public static void main(String[] args) {
	        //Find the fibbcanni series till 100
	        //0,1,1,2,3,5.........
	        int a=0;
	        int b=1;
	        while(a<=1000) {
	            System.out.println(a);
	            int c=a+b;
	            a=b;
	            b=c;
	        }

	    }

	}