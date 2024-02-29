package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysTask {

	public static void main(String[] args) {
	/*
	 * Create a Scanner object to take user input
	 */
        Scanner scanner = new Scanner(System.in);

        /*
         * Prompt the user for input
         */
       
        System.out.println("Enter the total number of strings to store: ");
        int totalCount = scanner.nextInt();
		scanner.nextLine();  // Consume newline character
        /*
         * Collect user input into a list
         */
	System.out.println("Enter strings");
        List<String> inputList = collectUserInput(scanner,totalCount);
        
        /*
         * 
         */
        List<String> outputList = inputList.stream().filter(s->!s.isBlank()).collect(Collectors.toList());

        System.out.println("Original list: " + inputList);
        System.out.println("non-empty list: " + outputList);
	}

	/*
	 * Collect user input into a list
	 */
	private static List<String> collectUserInput(Scanner scanner, int totalCount) {
	List<String> inputList = new ArrayList<>();
	String[] inputArray = new String[totalCount];
	int i=0;
	String input;
        while (true) {
            input = scanner.nextLine();
            if (i >= totalCount) {
                break;
            }
            inputArray[i] = input;
            i++;
        }
        inputList =Arrays.asList(inputArray);
        return inputList;
    }
}
