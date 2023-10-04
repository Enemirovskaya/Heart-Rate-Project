
     import java.util.Calendar;
     
     
public class PersonHeartRate {
    private String firstName;
    private String lastName;
    private DateOfBirth dateOfBirth;

//Constractor setter
public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstname(){
    return firstName;
}
public void setLastName(String firstName){
this.lastName = firstName;
} 
public String getLastName(){
    return lastName;
}

 public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public int calculateAge() { // Calculate Age of the person
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int age = currentYear - dateOfBirth.getYear();
        int currentMonth = currentDate.get(Calendar.MONTH) + 1; 
        int birthMonth = dateOfBirth.getMonth();
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
        int birthDay = dateOfBirth.getDay();

        // if-loop for current day
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        return age;
    }
    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }
    // Calculate Heart Rate Range
    public String calculateTargetHeartRateRange() {
        int maxBPM = calculateMaxHeartRate();
        int lowRange = (int) (maxBPM * 0.50);
        int highRange = (int) (maxBPM * 0.85);
        return lowRange + " - " + highRange;
    }
    //Date Of Birth Class
    public class DateOfBirth {
        private int year;
        private int month;
        private int day; 
 
 public void setYear(int year){
     this.year = year;
 }
 public int getYear(){
     return year;
 }
 public void setMonth(int month){
     this.month = month;
 }
 public int getMonth(){
     return month;
 }
  public void setDay(int day){
     this.day = day;
 }
 public int getDay(){
     return day;
 }
}//end class DateOfBirth
   
public void reads(){ //What will read in Output
     System.out.println("Name: " + firstName + " " + lastName);
     System.out.println("Date of Birth: " + dateOfBirth.getMonth() + "/" + dateOfBirth.getDay() + "/" + dateOfBirth.getYear());
     System.out.println("Age: " + calculateAge() + " years");
     System.out.println("Max Heart Rate: " + calculateMaxHeartRate() + " beats per minute");
     System.out.println("Target Heart Rate Range: " + calculateTargetHeartRateRange() + " beats per minute");
   
}

}//end personHeartRate
