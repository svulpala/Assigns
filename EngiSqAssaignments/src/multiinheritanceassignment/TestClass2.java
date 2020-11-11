package multiinheritanceassignment;

public class TestClass2 extends ClassX2 {
	int var1TestClass2= 400;
	
	boolean ClassX2= var2ClassX2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass2 obj = new TestClass2();
		obj.operation1AbsX1();
		obj.operation1InterX1();
		obj.operation1InterX2();
		obj.operation1InterX3();
		obj.operation2InterX1();
		obj.operation2InterX2();
		obj.operation2InterX3();
		obj.operationClassX2();
	System.out.println(obj.var1AbsX1);
	System.out.println(obj.var1TestClass2);
	System.out.println(obj.var2AbsX1);
	System.out.println(obj.ClassX2);
	}

}
