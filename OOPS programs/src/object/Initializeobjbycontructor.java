package object;

public class Initializeobjbycontructor {
	int id;
	 Initializeobjbycontructor(int i) {
		 
		 id=i;}
		void method1() {
		  System.out.println(id);

	}
	  public static void main(String args[]) {
		  Initializeobjbycontructor obj=new Initializeobjbycontructor(2);
		  obj.method1();
	  }
}
