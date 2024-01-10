package com.utilpack;
import java.util.*;
public class Lab611 {

	public static void main(String[] args) {
	
		Collection col=new ArrayList();
		
		System.out.println(col.size());
		System.out.println(col.isEmpty());
		
		col.add("Java");
		col.add(" is Language");
		col.add("and Technology");
		col.add("best");
		col.add("or");
		col.add("in industry.");
		
		System.out.println(col.size());
		System.out.println(col.isEmpty());
		
		System.out.println(col);
		System.out.println(col.remove("or"));
		System.out.println(col);
		System.out.println(col.contains("best"));
		System.out.println(col.remove("best"));
		System.out.println(col);
		System.out.println(col.contains("best"));
		System.out.println("++++++++++++++");
		System.out.println(col);
		/*the return type of clear method is void so we cannot write 
		the methods with void return type inside the println. 
		*/
		col.clear();
		System.out.println(col);
		System.out.println(col.size());
		System.out.println(col.isEmpty());
	}

}
