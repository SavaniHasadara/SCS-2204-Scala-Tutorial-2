object Salleries extends App{
      var Normalhoursallery : Int = 250 ;
      var OThoursallery : Int = 85;
      var NoNormalHours : Int = 40 ;
      var NoOTHours : Int = 30 ;
      var WeeklySallery : Float = (Normalhoursallery*NoNormalHours + OThoursallery*NoOTHours) - (((Normalhoursallery*NoNormalHours + OThoursallery*NoOTHours)*12) /100);
      var MonthlySallery : Float = WeeklySallery*4 ;
      
      println(WeeklySallery); println(MonthlySallery);  
   }