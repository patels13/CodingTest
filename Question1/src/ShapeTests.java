



import static org.junit.Assert.*;

import org.junit.Test;



public final class ShapeTests {
	
	@Test
	public void test1(){
		Shape s=new Square(1050);
		assertEquals(1102500.0,s.getArea(),0);
		assertEquals(4200.0,s.getPerimeter(),0);
	}
	
	@Test
	public void test2(){
		Shape s=new Square(1.214);
		assertEquals(1.214*1.214,s.getArea(),0);
		assertEquals(4.856,s.getPerimeter(),0);
	}
	
	public void test9(){
		Shape s=new Square(.313);
		assertEquals(.097969,s.getArea(),0);
		assertEquals(1.252,s.getPerimeter(),0);
	}
	
	@Test
	public void test11(){
		Shape s=new Square(-30);
		assertEquals(Double.NaN,s.getArea(),0);
		assertEquals(Double.NaN,s.getPerimeter(),0);
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
	public void test10(){
		Shape s=new Rectangle(-.43,1.2);
		assertEquals(new Double(Double.NaN),s.getArea(),0);
		assertEquals(new Double(Double.NaN),s.getPerimeter(),0);
	}
	
	
	@Test
	public void test5(){
		Shape s=new Triangle(30,40,50);
		assertEquals(600.0,s.getArea(),0);
		assertEquals(120.0,s.getPerimeter(),0);
	}
	
	@Test
	public void test6(){
		Shape s=new Triangle(5,5,8);
		assertEquals(12.0,s.getArea(),0);
		assertEquals(18.0,s.getPerimeter(),0);
	}
	
	@Test
	public void test7(){
		Shape s=new Triangle(-1,20,-32);
		assertEquals(new Double(Double.NaN),s.getArea(),0);
		assertEquals(new Double(Double.NaN),s.getPerimeter(),0);
	}
	
	
	@Test
	public void test8(){
		Shape s=new Circle(2.3);
		assertEquals(Math.PI*2.3*2.3,s.getArea(),0);
		assertEquals(Math.PI*2.3*2,s.getPerimeter(),0);
	}
	
	@Test
	public void test12(){
		Shape s=new Circle(-2);
		assertEquals(Double.NaN,s.getArea(),0);
		assertEquals(Double.NaN,s.getPerimeter(),0);
	}
	

}




