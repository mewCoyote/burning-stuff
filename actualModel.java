import java.io.*;
import java.util.*;

public class actualModel{

  public static void main(String[] args){
    /**
    * Stuff does end up getting inputed later when we get to that
    * stage of the game
    */
    Atmosphere atmos = new Atmosphere();
    Cookstove stove = new Cookstove();
    PeoplePopulation peoples = new PeoplePopulation();
    
    FileWriter moneySpent = new FileWriter("Budget.csv");
    FileWriter CO2 = new FileWriter("AtmosphericCO2.csv");
    FileWriter temps = new FileWriter("TemperatureChanges.csv");
    
    for (int i = 0; i <= years; i++){ //Years will be the required number of years the model wants to run for
      moneySpent.println(idk something goes here);
      CO2.println(atmos.getCO2());
      temps.println(atmos.calcTempChange());
      
      //Now the yearly increment section happens
      double amountOfCO2 = peoples.calcCO2(stove);
      atmos.addCO2(amountOfCO2);
      peoples.grow();
      
    }
    
    moneySpent.close();
    CO2.close();
    temps.close();
  }

}