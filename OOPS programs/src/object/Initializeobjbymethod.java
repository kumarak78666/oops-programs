package object;

public class Initializeobjbymethod {
	int b;
	void refermethod() {
		 int a=2;
		a+=4;
		  System.out.println(a);

	}
	  public static void main(String args[]) {
		  Initializeobjbymethod obj=new Initializeobjbymethod();
		  obj.refermethod();
	  }
}
