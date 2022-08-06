package movieticketbooking;
public class screen {
 void display_seats()
 {
  System.out.println(" Screen this side");
  System.out.println(" \t\t ========================");
  System.out.println(" \t\t ========================");
  System.out.println("\t ------------------------------------------------");
  System.out.println("\t A 1 2 3 4 5 6 7 8 9 10 11 12 Gold – Rs 150");
  System.out.println("\t B 1 2 3 4 5 6 7 8 9 10 11 12 Gold – Rs 150");
  System.out.println("\t ------------------------------------------------");
  System.out.println("\t C 1 2 3 4 5 6 7 8 9 10 11 12 Silver – Rs 200");
  System.out.println("\t D 1 2 3 4 5 6 7 8 9 10 11 12 Silver – Rs 200");
  System.out.println("\t ------------------------------------------------");
  System.out.println("\t E 1 2 3 4 5 6 7 8 9 10 11 12 Platinum – Rs 280");
  System.out.println("\t F 1 2 3 4 5 6 7 8 9 10 11 12 Platinum – Rs 280");  
  System.out.println("\n\n Please Enter Preferred Row. Seat will be booked as per availability.");
 }
	
 String getcat(String a)
 {
  String cat;
  if(a.compareToIgnoreCase("A")==0||a.compareToIgnoreCase("B")==0)
   cat="Gold";
  else if(a.compareToIgnoreCase("C")==0||a.compareToIgnoreCase("D")==0)
   cat="Silver";
  else if(a.compareToIgnoreCase("E")==0||a.compareToIgnoreCase("F")==0)
   cat="Platinum";
  else
   cat="N/A";
  return cat;
 }
	
 int getcost(String cat)
 {
  int cost = 0;
  if(cat.compareToIgnoreCase("Gold")==0)
   cost=150;
  else if(cat.compareToIgnoreCase("Silver")==0)
   cost=200;
  else if(cat.compareToIgnoreCase("Platinum")==0)
   cost=280;
  else
   return 0;
  return cost;
 }
}
