package Assignment_1;

public class Child extends Parent{
	public void display() {
		
		System.out.println("This is a child");
	}
	public static void main(String[] args) {
		new Child().display();
	}
}