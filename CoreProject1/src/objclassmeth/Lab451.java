package objclassmeth;

class Account{
	 int acno;
	 String actype;
	 double bal;
	 
	 Account(){}
	 Account(int acno,String actype,double bal){
		 this.acno=acno;
		 this.actype=actype;
		 this.bal=bal;
	 }
	 public boolean equals(Account ac) {
		 boolean b=this.acno==ac.acno
				 && this.actype.equals(ac.actype)
				 && this.bal==ac.bal;
		 return b;
		 }
}
class Customer1{
	int cid;
	String cname;
	String email;
	long phone;
	Account account;
	
	Customer1(){}
		Customer1(int cid,String cname,String email,long phone,Account account){
		this.cid=cid;
		this.cname=cname;
		this.email=email;
		this.phone=phone;
		this.account=account;
		}
		public boolean equals(Customer1 cust) {
			boolean b=this.cid==cust.cid &&
					this.cname.equals(cust.cname) &&
					this.email.equals(cust.email) &&
					this.phone==cust.phone &&
					this.account.equals(cust.account);
			return b;	
		}
}
public class Lab451 {

	public static void main(String[] args) {
		Account ac1=new Account(55,"CA",55000);	
		Account ac2=new Account(55,"CA",55000);
		
		Customer1 c1=new Customer1(101,"Bow","bow@mail",554,ac1);
		Customer1 c2=new Customer1(101,"Bow","bow@mail",554,ac2);
		Customer1 c3=new Customer1(102,"Bob","bob@mail",774,ac2);
		
		boolean b1=c1.equals(c2);
		System.out.println(b1);
		
		boolean b2=c2.equals(c3);
		System.out.println(b2);
	}
}
