package objclassmeth;

class O{}
class P extends O{
	void show() {
		System.out.println("P show()");
	}
}
public class Lab443 {

	public static void main(String[] args) {
		P p1=new P();
		p1.show();
		Class cls=p1.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSuperclass());
	}

}
