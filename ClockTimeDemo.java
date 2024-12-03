//Joshua Coleman
import java.util.Scanner;

public class ClockTimeDemo {
    public static void main(String[] args) throws TimeException {
        
        boolean done = false;

        Scanner key = new Scanner(System.in);
        do
        //runs code first before asking to continue
        {
        String isDone;

        TimeConverter tc1 = new TimeConverter();
        //creates first time object

        System.out.println("Enter the hours on the military clock");

        tc1.setHours(key.nextInt());

        System.out.println("Enter the minutes on the military clock");

        tc1.setMinutes(key.nextInt());

        System.out.println("Enter the seconds on the military clock");

        tc1.setSeconds(key.nextInt());

        //updates time based off inputed values
        System.out.println("12-hour clock time: "+ tc1.updateTime(tc1.getHours(),tc1.getMinutes(),tc1.getSeconds()));

        //second time conversion object
        TimeConverter tc2 = new TimeConverter();

        System.out.println("\nEnter 24 hour clock time in the format \"hours:minutes:seconds\"");
        
        String currentTime = key.next();

        //updates time based off string values
        System.out.println("12-hour clock time: "+tc2.updateTime(currentTime));

        System.out.println("\nContinue? \"Yes or No\"");
        //checks if user wants to continue
        isDone = key.next();

        if(isDone.equalsIgnoreCase("Yes"))
        {
            done = false;
        }
        else if(isDone.equalsIgnoreCase("No"))
        {
            done = true;
        }
        else 
        {
            System.out.println("Invalid input!");
        }//input validation

        }while(done = false);
    }
}
