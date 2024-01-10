package com.practice;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateT {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
		 System. out. println(dateFormat.format(date));
	}

}
