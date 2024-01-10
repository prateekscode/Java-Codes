package objclassmeth;

class O1{
	int a;
	O1(int a){
		this.a=a;
	}
	void show() {
		System.out.println("O show():"+a);
	}
}
public class Lab444 {

	public static void main(String[] args) {
		O1 o=new O1(560);
		o.show();
		
		int  c=o.hashCode();
		System.out.println(c);
		
		O1 oo=new O1(800);
		oo.show();
		
		int y=oo.hashCode();
		System.out.println(y);
	}

}
