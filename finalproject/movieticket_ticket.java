package movieticketbooking;
import java.util.Date;
public class ticket {
 screen s = new screen();

 void print_ticket(String movie,String showtime,int screen,String cat, String rowch, int colch)
 {
  Date date = new Date();
  int cost = s.getcost(cat);
  System.out.println("========================BELL Cinemas=======================");
  System.out.println("\t\t ----Ticket----");
  System.out.println("\tMovie: "+movie+"\t");
  System.out.print("\tTime: "+showtime);
  System.out.println("\t\t\tSeat: "+rowch+colch);
  System.out.print("\tCategory: "+cat);
	
  System.out.println("\tDate: "+date);
  System.out.println("\tPrice: Rs-"+cost);
  System.out.println("\tThank You for Booking ! see you again soon!\n\n");
 }
}
