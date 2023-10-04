import java.util.ArrayList;
import java.util.Scanner;

        
        
public class HeartRateDamo {
    

    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);        
        ArrayList<PersonHeartRate> heartRateList = new ArrayList<>();
        

        do{
        System.out.print("Please enter your first name: ");
        String firstName = keyboard.nextLine();
        
        System.out.print("Please enter your last name: ");
        String lastName = keyboard.nextLine();
        
        System.out.print("Please enter your month of birth: ");
        int month = keyboard.nextInt();
        
        System.out.print("Please enter your day of birth: ");
        int day = keyboard.nextInt();
        
        System.out.print("Please enter your year of birth: ");
        int year = keyboard.nextInt();
        
        
        //methods PersoHeartRate and DateOfBirth
        PersonHeartRate.DateOfBirth dateOfBirth =
            new PersonHeartRate.DateOfBirth(year, month, day);
        keyboard.nextLine();
        
        PersonHeartRate person = new PersonHeartRate
        (firstName, lastName, dateOfBirth);
            heartRateList.add(person);
        
        System.out.print("Would you like to add new person "
                + "to the list? YES to continue, NO to exit: ");
            String yesNo = keyboard.nextLine().toLowerCase();

            if (!yesNo.equals("no")) {
                 break; //Ends 
                 
            }
        }while(true);
        
        for (PersonHeartRate person : heartRateList) {
            person.reads();
            System.out.println();
        }

    }//end main
}
