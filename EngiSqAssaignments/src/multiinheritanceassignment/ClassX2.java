package multiinheritanceassignment;

public class ClassX2 extends AbsX1{
	int var1ClassX2 = 200;
	boolean var2ClassX2= true;
     public void operationClassX2() {
	System.out.println("This is normal classX2");

}
	@Override
	public void operation1InterX3() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX3-1.1");
	}
	@Override
	public void operation2InterX3() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX3-1.2");
	}
	@Override
	public void operation1InterX1() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX1-1.1");
	}
	@Override
	public void operation2InterX1() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX1-1.2");
	}
	@Override
	public void operation1InterX2() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX1-2.1");
	}
	@Override
	public void operation2InterX2() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX1-2.2");
	}
}
