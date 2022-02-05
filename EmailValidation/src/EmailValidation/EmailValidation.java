package EmailValidation;
import java.util.regex.*;    
import java.util.*;    
public class EmailValidation {
	 public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("abc.def@mail.cc");  
	        emails.add("abc.def@mail-archive.com");  
	        emails.add("abc.def@mail.org");  
	        emails.add("abc.def@mail.com");
	      //Add invalid emails in list  
	        emails.add("@yahoo.com");  
	        emails.add("abc.def@mail.c");  
	        emails.add("abc.def@mail#archive.com");  
	        emails.add("abc.def@mail");
	        emails.add("abc.def@mail..com");
	        //Regular Expression   
	        String regex = "^[A-Za-z0-9+_.-]+@+[A-Za-z](.+)+$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  

