public class GrassHopper {

  // void method that does not return anything
  static void cityGreeting(String city) {
    city = "New York";
    System.out.println("Hello" + " " + city);
  }

  // multiple parameters
  static void sumGame(int x, int y, int z){
    int totals = (x + y + z);
    System.out.println(totals);
  }

  // methods that return something need to have a data type
  static String personName(String firstName, String secondName){
    return ("My name is " + firstName + " " + secondName);
  }

  // method with conditions
  static String jacketOptions(String weather){ 
    
    String weatherType[] = {"Sunny", "Cold"};
    String jacketType[] = {"Heavy", "Light"};

    String[][] jack = {{"Sunny", "Cold"}, {"Heavy", "Light"}};


    String[] firstWeatherArray = {};

    for (String i : jack[0]){
      i = 
      System.out.println(i);

    }
    // System.out.println(firstWeatherArray);


    System.out.println(jack[0][0]);

    if (weather == weatherType[0]){
      String jacket = jacketType[1];
      return "The weather today is " + weather + ". " + "Please wear a " + jacket + " jacket";
    }
    else{
      weather = weatherType[1];
      String jacket = jacketType[0];
      return "The weather today is " + weather + ". " + "Please wear a " + jacket + " jacket";
    }
    // return "The weather today is ";
    
  }
  public static void main(String[] args){
    cityGreeting("Nairobi");
    sumGame(2,3,4);
    System.out.println(personName("John", "Doe"));
    System.out.println(jacketOptions("Sunny"));
  }
}
