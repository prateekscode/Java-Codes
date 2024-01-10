class Sumofevenpair1{
	public static void main(String[] args){
		int arr[]={4,1,3,5,6,2,8,12,9,11};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if((arr[i]+arr[j])%2==0 && i<j){
					System.out.println("Sum of"+arr[i]+"and"+arr[j]+"is even");
				}
			}
		}
	}
}	