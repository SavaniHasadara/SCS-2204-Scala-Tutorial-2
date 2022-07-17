object Profit extends App{
      var TicketPrice : Int = 15;
      var NoAttendees : Int = 120;
      var PerformCost : Int = 500 ;
      var AttendeesCost : Int = 3 ;
      var TotAttendeesCost : Int = AttendeesCost*NoAttendees;
      var Profit :  Int = (TicketPrice*NoAttendees) - (PerformCost + TotAttendeesCost);
      
      println(Profit); 
   }