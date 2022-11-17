import java.util.Scanner;
public class nextDay
{
    public static void main(String [] args) {
        int day, month, year;
        
        Scanner kb = new Scanner (System.in);
        
        System.out.println("please, input the day");
        day= kb.nextInt ();
        
        System.out.println("please, input the month");
        month= kb.nextInt ();
        
        System.out.println("please, input the year");
        year= kb.nextInt ();
        
        if ((day == 01) || (day == 02) || (day == 03) || (day == 04) || (day == 05) || (day == 06) || (day == 07) || (day == 8) || (day == 9) || 
        (day == 10) || (day == 11) || (day == 12) || (day == 13) || (day == 14) || (day == 15) || (day == 16)|| (day == 17) || (day == 18) || 
        (day == 19) || (day == 20) || (day == 21) || (day == 22) || (day == 23) || (day == 24) || (day == 25) || (day == 26) || (day == 27) || 
        (day == 28) || (day == 29)) {
        
        day = ++day;
        
        }
        if (day == 30){
        
        day = 01;
        
        }
        if ((day == 01) && (month <= 11)){
        
        month = ++month;
        
        }
        if ((month == 12) && (day == 01) || (day == 30)){
        
        month = 01;
        
        }
        if ((day == 01) && (month == 01)){
        
        year = ++year;
        
        }
        
        System.out.println("next day is: " + day + "/" + month + "/" + year);
        
    }
}