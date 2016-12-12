package cn.edu.seu.cose.javacourse.ch05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {
	Integer[] a = new Integer[10];;
	
	String[] b = new String[]{"Hello", "World!"};
	{
		for(int i=0; i<a.length; i++){
			a[i] = i*2;
		}
	}
	
	public void test(){
		System.out.println(Arrays.toString(a));
	}
	
	public static int getMax(int[] a){
		List list = Arrays.asList(a);
		return 10;
	}
	
	public static void main(String[] args){
		ArrayTest test = new ArrayTest();
		//test.test();
		String[] str1 = new String[10];
		String[] str2 = new String[10];
		String[] str3;
 		Arrays.fill(str1, "Kobe");
 		Arrays.fill(str2, "Kobe");
 		str3 = Arrays.copyOfRange(str1, 0, 1);
		System.out.println(Arrays.hashCode(str1));
		System.out.println(Arrays.hashCode(str2));
		System.out.println(Arrays.equals(str1, str2));
		System.out.println(Arrays.toString(str1));
		System.out.println(str3.length);
		
		
		/*List list = Arrays.asList(test.a);
		System.out.println(Collections.max(list));*/
	}
}
