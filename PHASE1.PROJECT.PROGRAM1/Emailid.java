package Email;
import java.util.regex.*;    
import java.util.*; 
public class email {
	public static void main(String[] args) {
        ArrayList<String> emailId = new ArrayList<String>();  
        emailId.add("mailid@domain.co.in");  
        emailId.add("mailid@domain.com");  
        emailId.add("mailid.name@domain.com");  
        emailId.add("mailid#@domain.co.in");  
        emailId.add("mailid@domain.com");  
        emailId.add("mailid@domaincom");  
         
        emailId.add("@yahoo.com");  
        emailId.add("mailid#domain.com");  
        
        String regex = "^(.+)@(.+)$";  
         
        Pattern pattern = Pattern.compile(regex);  
        
        for(String email : emailId){  
             
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}
