import java.util.*;
public class HeartRatesApp {
    public static void main(String[]args) {
        Scanner word = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = word.next();

        System.out.print("Enter last name: ");
        String lastName = word.next();

        System.out.print("Enter birth year: ");
        int birthYear = word.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = word.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, birthYear, currentYear);

        person.setBirthYear();
        person.setCurrentYear();
        
        int age = person.calculateAge();
        int maxHR = person.calculateMaxHR();
        double targetHigh = person.upperTargetRange();
        double targetLow = person.lowerTargetRange();

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Max heart rate: " + maxHR);
        System.out.println("Target heart rate range: ");
        System.out.println("    Min: " + targetLow);
        System.out.println("    Max: " + targetHigh);

        word.close();

    }
}
