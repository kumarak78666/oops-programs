
public class parameter_constructor {
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    parameter_constructor(int i,String n){  
	    id = i;  
	    name = n;  
	    System.out.println(id+" "+name);
	    }  
	    //method to display the values  
	//    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	parameter_constructor s1 = new parameter_constructor(111,"Karan");  
	    	parameter_constructor s2 = new parameter_constructor(222,"Aryan");  
	    //calling method to display the values of object  
	//    s1.display();  
	//    s2.display();  
	   }  
	}  

