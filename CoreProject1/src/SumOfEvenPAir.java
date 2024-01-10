public class SumOfEvenPAir {
	
	    public static void main(String[] args) {
	        int a[]= {4,1,3,5,6,2,8,12,9,11}; // sum of even pair from given array 4+6=10%2==0
	        for(int i=0;i<a.length;i++) {
	            for(int j=0;j<a.length;j++) {
	            if((j<i)&&(a[i]+a[j])%2==0) {
	                System.out.println("Even pair :"+a[i]+" and "+a[j]);
	            }
	            }
	            
	        }

	    }

	}