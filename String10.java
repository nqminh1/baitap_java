package baitap;

import java.util.Calendar;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar tg = Calendar.getInstance();
	    System.out.println("ngay va gio hien tai :"); 
	    System.out.format("%tB %te, %tY%n", tg, tg, tg);
	    System.out.format("%tl:%tM %tp%n", tg, tg, tg); 
	}

}
