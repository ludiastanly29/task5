package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		/*
		 * Create a Scanner object to take user input
		 */
        Scanner scanner = new Scanner(System.in);

        /*
         * Prompt the user to enter the birthday date
         */
        System.out.print("Enter your birthday (yyyy-MM-dd): ");
        String birthdayInput = scanner.nextLine();

        /*
         * Parse the user input into a LocalDate object
         */
        LocalDate birthday = LocalDate.parse(birthdayInput);

        /*
         * Calculate the age using java.time.LocalDate and java.time.Period
         */
        calculateAge(birthday, LocalDate.now());

        

	}

	/*
	 * calculate and display the age
	 */
	private static void calculateAge(LocalDate birthday, LocalDate now) {
		Period age = Period.between(birthday,now);
        System.out.println("Your age is: "+age.getYears()+" years,"+age.getMonths()+" months and "+age.getDays()+" days.");
	}

}
