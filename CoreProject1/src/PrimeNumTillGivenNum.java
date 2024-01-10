public class PrimeNumTillGivenNum {
	public static void main(String[] args) {
		int n=100;
		boolean res=false;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				System.out.println(i+" is not prime number");
				i++;
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					res=true;
					break;
			}
				res=false;
		}
		if(res==true)
			System.out.println(i+" is not prime number");
		else
			System.out.println(i+" is a prime number");
		
		}
		}
		
	}

