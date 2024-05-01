public class HeartRates {
   private String firstName;
   private String lastName;
   private int birthYear;
   private int currentYear;
   
   public HeartRates(String firstName, String lastName, int birthYear, int currentYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthYear = birthYear;
    this.currentYear = currentYear; 
   }

   public String getFirstName() {
    return firstName;
   }

   public void setFirstName(String firstName) {
    this.firstName = firstName;
   }

   public String getLastName() {
    return lastName;
   }

   public void setLastName() {
    this.lastName = lastName;
   }

   public int getBirthYear() {
    return birthYear;
   }

   public void setBirthYear() {
    this.birthYear = birthYear;
   }

   public int getCurrentYear() {
    return currentYear;
   }

   public void setCurrentYear() {
    this.currentYear = currentYear;
   }

   public int calculateAge() {
    int currentAge = (currentYear - birthYear);
    return currentAge;
   }

   public int calculateMaxHR() {
    return (220 - calculateAge());
   }

   public double lowerTargetRange() {
    double lowerHR = 0.5 * calculateMaxHR();
    return lowerHR;
   }

   public double upperTargetRange() {
    double upperHR = 0.85 * calculateMaxHR();
    return upperHR;
   }
}
