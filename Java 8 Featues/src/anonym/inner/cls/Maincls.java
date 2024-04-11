package anonym.inner.cls;

public class Maincls {
	public static void main(String[] args) {
		Empl e=new Empl() {
			@Override
			public String getDesignation() {
				return "Software Developer";
			}
			@Override
			public String getSalary() {
				return "15000";
			}
		};
		System.out.println(e.getDesignation());
		System.out.println(e.getSalary());
	}
}
