public class EvenOddArray {
	public static void main(String[] args) {
			int evencounter=0;
			int oddcounter=0;
				int[] ar={10,6,5,9,12,64,23,7,54,21,28,81,89,39,82};
				for(int i=0;i<ar.length;i++){
					if(ar[i]%2==0)
						evencounter++;
					else
						oddcounter++;
				}
				int[] evenar=new int[evencounter];
				int[] oddar=new int[oddcounter];
				int j=0,k=0;
				for(int i=0;i<ar.length;i++){		
				if(ar[i]%2==0){
					evenar[j++]=ar[i];
				}
					else{
					oddar[k++]=ar[i];
					}
				}
				System.out.println("Even array elements:-");
				for(int i=0;i<evenar.length;i++){
				System.out.println(evenar[i]);
				}
				System.out.println("Odd array elements:-");
				for(int i=0;i<oddar.length;i++){
				
				System.out.println(oddar[i]);
				}
		}
}
