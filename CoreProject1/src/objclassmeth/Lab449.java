package objclassmeth;

class O4 extends Object{
	int a;
	int b;
	O4(int a,int b){
		this.a=a;
		this.b=b;
	}
}

public class Lab449 {

	public static void main(String[] args) {
		O4 m1=new O4(33,55);
		O4 m2=new O4(33,55);
		O4 m3=new O4(43,54);
		
		boolean b1=m1.equals(m2);
		System.out.println(b1);
		
		boolean b2=m1.equals(m3);
		System.out.println(b2);
	}

}
