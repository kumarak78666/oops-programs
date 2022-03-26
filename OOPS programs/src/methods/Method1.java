package methods;

public class Method1 {
	static int a=2;
	static int b=2;
	public static int add(int n1,int n2) {
		int c=a+b;
		return c;
	}
public static void main(String args[]) {
	int c=add(a,b);
	System.out.print(c);
		
}
}
