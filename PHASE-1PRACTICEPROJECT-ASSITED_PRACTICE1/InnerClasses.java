package innerClasses;
public class classes {
 private String msg="Welcome to Eclipse"; 
 class Inner{  
	 void hai(){System.out.println(msg+", Let us start E-learning Inner Classes");}  
	 }  
 public static void main(String[] args) {
	 classes obj=new classes();
	 classes.Inner in=obj.new Inner();  
	 in.hai();  
	 }
 }

