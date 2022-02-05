package accessSpecifiers1;

public class PriAccessSpecifier {
	private void display() 
    { 
		
        System.out.println("You are using private access specifier"); 
 
    } 

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			PriAccessSpecifier  obj = new PriAccessSpecifier(); 
	        //trying to access private method of another class 
	        obj.display();

		}


}
