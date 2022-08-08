package Pack1;
import java.util.*;
import Pack1.Pack2.Pack3.*;
import Pack1.Pack2.*;

public class first{
	public static void main(String[] args) {
		System.out.println("Hello I am In First Package");
		third t3 = new third();
		t3.callMe3();
		sec s2 = new sec();
		s2.call2();
	}
	/*public void call1(){
		System.out.println("Called call1() from Pack1");
	}*/
	

}
