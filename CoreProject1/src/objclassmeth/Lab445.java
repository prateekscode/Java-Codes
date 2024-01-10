package objclassmeth;

class O2 extends Object{
	int a;
	O2(int a){
		this.a=a;
	}
	void show() {
		System.out.println("O2 show():"+a);
	}
	public int hashCode() {
		return a*5;
	}
}

public class Lab445 {

	public static void main(String[] args) {
		O2 a1=new O2(10);
		a1.show();
		
		int x=a1.hashCode();
		System.out.println(x);
		
		O2 a2=new O2(20);
		a2.show();
		
		int y=a2.hashCode();
		System.out.println(y);
	}

}
