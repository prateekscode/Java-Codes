package objclassmeth;

class O3 extends Object{
	int a;
	int b;
	O3(int a,int b){
		this.a=a;
		this.b=b;
	}
}
public class Lab446 {

	public static void main(String[] args) {
		O3 n=null;
		System.out.println(n);
		
		O3 n2=new O3(85,58);
		System.out.println(n2.hashCode());
		System.out.println("1."+n2);
		System.out.println("2."+n2.toString());
	}

}
