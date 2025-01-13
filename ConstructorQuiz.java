package com.coreJava;

public class ConstructorQuiz {
	int num = 10;
	 ConstructorQuiz() {
		 num = 20;
	}

	public static void main(String[] args) {
		
		//Quiz 1:
		ConstructorQuiz obj = new ConstructorQuiz();
		System.out.println(obj.num);
		
		//Explanation: The value assigned inside constructor overwrite the values initialized with declaration
		
		

	}

}

/* Quiz 2:
class Point {
int m_x, m_y;
public Point(int x, int y) {    m_x = x;    m_y = y;  }
public static void main(String args[])
{
  Point p = new Point();
}
}
Explanation: The main function calls parameterless constructor, but there is only one constructor 
defined in class which takes two parameters. Note that if we write our own constructor, 
then compiler doesn\’t create default constructor in Java
*/
