package pratice;// Java program to Illustrate isAlive() Method
// of Thread class

// Main class extending Thread class
class A extends Thread {
	public void run(){
		System.out.println("Is Alive me ");
	}
}
class B {
	public static void main(String[] args) {
		A t1 = new A();
		A t2 = new A();
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
	}
}