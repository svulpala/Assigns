package multiinheritanceassignment;

public class ClassX1 extends AbsX1{
	int var1ClassX1 = 200;
	boolean var2ClassX1= true;
	public void operationClassX1() {
		System.out.println("This is normal classx1");
	}
	@Override
	public void operation1InterX3() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX3-1");
	}
	@Override
	public void operation2InterX3() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX3-2");
	}
	@Override
	public void operation1InterX1() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX1-1");
	}
	@Override
	public void operation2InterX1() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX1-2");
	}
	@Override
	public void operation1InterX2() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX2-1");
	}
	@Override
	public void operation2InterX2() {
		// TODO Auto-generated method stub
		System.out.println("This is InterX2-2");
	}

}
