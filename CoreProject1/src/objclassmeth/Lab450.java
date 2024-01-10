package objclassmeth;

class O5{
	int a;
	int b;
	O5(int a,int b){
		this.a=a;
		this.b=b;
	}
public boolean equals(Object ob) {
	O5 n=(O5)ob;
	if(this.a==n.a && this.b==n.b)
		return true;
		return false;
}
}
public class Lab450 {

	public static void main(String[] args) {
		O5 m1=new O5(55,44);
		O5 m2=new O5(55,44);
		O5 m3=new O5(99,66);
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		
		boolean b1=m1.equals(m2);
		System.out.println(b1);
		
		boolean b2=m1.equals(m3);
		System.out.println(b2);
	}

}
