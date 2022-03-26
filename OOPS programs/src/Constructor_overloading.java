
public class Constructor_overloading {
	    int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    Constructor_overloading(int i,String n){  
	    id = i;  
	    name = n;  
	    System.out.println(id+" "+name+" ");
	    }  
	    //creating three arg constructor  
	    Constructor_overloading(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    System.out.println(id+" "+name+" "+age);
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	Constructor_overloading s1 = new Constructor_overloading(111,"Karan");  
	    	Constructor_overloading s2 = new Constructor_overloading(222,"Aryan",25);  
	   
	   }  
	}  

