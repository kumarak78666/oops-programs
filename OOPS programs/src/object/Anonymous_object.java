package object;

public class Anonymous_object {
		void refermethod() {
			 int a=2;
			a+=4;
			  System.out.println(a);

		}
		String refermethod1(){
			 
			return "akshay";
			
		} 
	/*	void refermethod1(){
			int b=3;
			System.out.println(b);
		}  */
		  public static void main(String args[]) {
			  new Anonymous_object().refermethod();
		//	  new Anonymous_object().refermethod1();
			  Anonymous_object an=new Anonymous_object();
			  System.out.println(an.refermethod1());
		  }
	}


