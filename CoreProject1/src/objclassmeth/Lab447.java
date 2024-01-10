package objclassmeth;

class O4 extends Object{
	int a;
	int b;
	O4(int a,int b){
		this.a=a;
		this.b=b;
	}
	public String toString() {
		String str="[a="+a+",b="+b+"]";
		return str;
		
	}
}
public class Lab447 {

	public static void main(String[] args) {
		O4 m1=new O4(30,90);
		System.out.println(m1);
		System.out.println(m1.toString());
		
		O4 m2=new O4(86,23);
		System.out.println(m2);
		System.out.println(m2.toString());
	}

}
