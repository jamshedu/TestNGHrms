package com.class02;

import org.testng.annotations.Test;

public class Task {
	
@Test(priority =3)	
public void firstMethod() {
	System.out.println("First Method");
}
@Test
public void firstMethod1() {
	System.out.println("firstMethod");
}

}
