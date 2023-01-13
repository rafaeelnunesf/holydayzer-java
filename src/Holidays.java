import java.util.HashMap;

public class Holidays {
  // Create a HashMap object called holidays
  HashMap<String, String> holidays;
  Holidays(){
    // Add keys and values (Date, Description)
      holidays = new HashMap<String, String>();
      holidays.put("01/01/2023", "Confraternização mundial");
      holidays.put("21/02/2023", "Carnaval");
      holidays.put("17/04/2023", "Páscoa");
      holidays.put("21/04/2023", "Tiradentes");
      holidays.put("01/05/2023", "Dia do trabalho");
      holidays.put("08/06/2023", "Corpus Christi");
      holidays.put("25/08/2023", "Meu aniversário <3");
      holidays.put("07/09/2023", "Independência do Brasil");
      holidays.put("12/10/2023", "Nossa Senhora Aparecida");
      holidays.put("02/11/2023", "Finados");
      holidays.put("15/11/2023", "Proclamação da República");
      holidays.put("25/12/2023", "Natal");
  }

  public String getHoliday(String date) {
      String description =  holidays.get(date);
      if(description == null) {
          return "There are no holidays on the given date!";
      }
      return description;
  }

  public void getAllHolidays(){
    for(String date : holidays.keySet()){
      System.out.println(date + ": " + holidays.get(date));
    }
  }
}