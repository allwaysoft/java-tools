import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 
import java.util.Date;
import java.math.BigDecimal; 

public class Example {  
  public static void main(String[] args) {  
    LocalDateTime currentDateTime = LocalDateTime.now();  
    
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy");  
    String formatDateTime = currentDateTime.format(format1);   
    System.out.println(formatDateTime); 
    
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("YYYY");  
    String formatDateTime2 = currentDateTime.format(format2);   
    System.out.println(formatDateTime2); 
    
    Date date1 = new Date();
    
    SimpleDateFormat simpleformat1 = new SimpleDateFormat("yyyy");
    String formatDateTime3 = simpleformat1.format(date1);  
    System.out.println(formatDateTime3); 
    
    SimpleDateFormat simpleformat2 = new SimpleDateFormat("YYYY");
    String formatDateTime4 = simpleformat2.format(date1);  
    System.out.println(formatDateTime4); 
    

    try {
        String[] dates = {"2020-12-01", "2020-12-31", "2021-01-01"};
        for (String date: dates) {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            Date d = dt.parse(date);

            SimpleDateFormat dtYYYY = new SimpleDateFormat("YYYY");
            SimpleDateFormat dtyyyy = new SimpleDateFormat("yyyy");

            System.out.println("For date " + date + " the YYYY year is " + dtYYYY.format(d) + " while for yyyy it's " + dtyyyy.format(d));
        }
    } catch (Exception e) {
        System.out.println("Failed with exception: " + e);
    }  

    LocalDate date = LocalDate.of(2019, 10, 18);
    System.out.println(date); // 2019-10-18
    LocalDate date2 = LocalDate.parse("2018-09-16");
    System.out.println(date2); // 2019-10-18
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
    String time = "10:15:30";
    LocalTime time1 = LocalTime.parse(time, dateTimeFormatter);
    System.out.println(time1);
    LocalTime localTime = LocalTime.of(8, 00);
    System.out.println(localTime);
    LocalTime t = LocalTime.parse("09:22");
    System.out.println(t);

    t = LocalTime.parse("20:40", DateTimeFormatter.ISO_TIME);
    System.out.printf("ISO_TIME: %s%n",t);

    t = LocalTime.parse("02:30",
                        DateTimeFormatter.ISO_LOCAL_TIME);
    System.out.printf("ISO_LOCAL_TIME: %s%n",t);
    LocalDateTime localDateTime = LocalDateTime.parse("2018-09-16T08:00:00");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    String formatDateTime5 = localDateTime.format(formatter);
    System.out.println(formatDateTime5);

    double a=0.03;
    double b=0.04;
    double c=b-a;
    System.out.println(c);
    
    BigDecimal _a = new BigDecimal("0.03");
    BigDecimal _b = new BigDecimal("0.04");
    BigDecimal _c = _b.subtract(_a);
    System.out.println(_c);

  }  
}