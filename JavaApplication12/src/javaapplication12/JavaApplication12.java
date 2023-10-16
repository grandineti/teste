/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author Administrator
 */

import java.io.*;


import java.util.*;

public class JavaApplication12 {
   
public static void main(String[] args)
	{
		Parent p = new Parent();
		// calling Parent's show()
		p.show();
		// cannot override Parent's show()
	}

}


// Override of static method
class Parent {

	// static method
	static void show()
	{
		System.out.println("Parent");
	}
}

// Parent inherit in Child class
class Child extends Parent {

	
// override show() of Parent 	void show(){System.out.println("Child");}
}

class GFG {
	
}
