package multiinheritanceassignment;

public class TestClass1 extends ClassX1{
	
	int var1TestClass1 = 300;
	
	boolean ClassX1 =var2ClassX1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 obj =new TestClass1();
		obj.operation1AbsX1();
		obj.operation1InterX1();
		obj.operation1InterX3();
		obj.operation2InterX1();
		obj.operation2InterX2();
		obj.operation2InterX3();
		obj.operationClassX1();
		obj.operation1InterX2();
		System.out.println(obj.ClassX1);
		System.out.println(obj.var1AbsX1);
		System.out.println(obj.var1ClassX1);
		System.out.println(obj.var1TestClass1);
		System.out.println(obj.var2AbsX1);
		System.out.println(obj.var2ClassX1);
		System.out.println(obj.var1InterX1);
		System.out.println(obj.var1InterX2);
		System.out.println(obj.var1InterX3);
	
	}

}
