



import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.junit.Test;


public final class ShapeTests {
	
	@Test
	public void test1(){
		Shape s=new Square(5);
		assertEquals(25.0,s.getArea(),0);
		assertEquals(20.0,s.getPerimeter(),0);
	}
	
	@Test
	public void test2(){
		Shape s=new Square(1.214);
		assertEquals(1.214*1.214,s.getArea(),0);
		assertEquals(4.856,s.getPerimeter(),0);
	}
	
	@Test
	public void test3(){
		Shape s=new Rectangle(3,2);
		assertEquals(6.0,s.getArea(),0);
		assertEquals(10.0,s.getPerimeter(),0);
	}
	
	@Test
	public void test4(){
		Shape s=new Rectangle(9.88,1.2);
		assertEquals(11.856,s.getArea(),0);
		assertEquals(22.16,s.getPerimeter(),0);
	}
	
	@Test
	public void test5(){
		Shape s=new Circle(2.3);
		assertEquals(Math.PI*2.3*2.3,s.getArea(),0);
		assertEquals(Math.PI*2.3*2,s.getPerimeter(),0);
	}

}
