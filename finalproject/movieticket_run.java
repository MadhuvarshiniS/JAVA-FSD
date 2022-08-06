package movieticketbooking;
import java.util.Scanner;
public class run {

 public static void main(String args[])
 {
  Scanner on = new Scanner(System.in);
  int ch,i,n,movch; String rowch[]=new String[12];
  int colch[]=new int[12];
  login objlogin = new login();
  String time = new String();
  String timecheck = new String();
  show objshow = new show();
  screen objscreen = new screen();
  ticket objticket = new ticket();
  while(true)
  {
   
   if((boolean) login.happy())
   {
  System.out.println("Movie Ticket Booking System");
  System.out.println("1.Book Movie Tickets");
  System.out.println("2.See Movies/Show Timings");
  System.out.println("3.Exit");
  System.out.println("\nEnter Choice");
  ch = on.nextInt();
  switch(ch)
  {
   case 1: objshow.display_show_timings();
     System.out.println("Choose the Movie");
     movch=on.nextInt();
     do{
     System.out.println("Enter Show timings (hh:mm)");
     time=on.next();
     timecheck=objshow.check_time(movch,time);
     }while(timecheck.equals("false"));
     System.out.println("Enter Number of seats");
     n=on.nextInt();
     for(i=0;i<n;i++){
      objscreen.display_seats();
      rowch[i]=on.next().toUpperCase();
      objshow.show_empty_seats(rowch[i],movch);
      colch[i]=on.nextInt();
      if(objshow.check_seats(rowch[i],colch[i],movch))
      {
       System.out.println("Seat is not available");
      }
      objshow.fill_seat(rowch[i],colch[i],movch);
     }
     for(i=0;i<n;i++)
     {
        objticket.print_ticket(objshow.getmovie(movch), time, 3, objscreen.getcat(rowch[i]), rowch[i], colch[i]);
     }
     break;
    
   case 2: objshow.display_show_timings();
     break;
     
   case 3: System.out.println("Thankyou for visiting...\n");  
  }
 }
 }
 }
}
