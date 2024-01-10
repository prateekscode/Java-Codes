package objclassmeth;

class Customer{
	int cid;
	String cname;
	String email;
	long phone;
	Customer(){}
	
	Customer(int cid, String cname, String email, long phone){
		this.cid=cid;
		this.cname=cname;
		this.email=email;
		this.phone=phone;
	}
	public String toString() {
		String str="[cid="+cid+",cname="+cname+",email="+email+",phone="+phone+"]";
		return str;
	}
}
public class Lab448 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1);
		
		Customer c2=new
		Customer(101,"James","james@mail.com",1234567890);
		System.out.println(c2);
	}

}
