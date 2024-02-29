package task5;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysTask {

	public static void main(String[] args) {
		/*
		 * Create a Scanner object to take user input
		 */
        Scanner scanner = new Scanner(System.in);

        /*
         * Prompt the user for input
         */
        System.out.println("Enter strings (type 'exit' to stop):");
        /*
         * Collect user input into a list
         */
        List<String> inputList = collectUserInput(scanner);
        
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
	private static List<String> collectUserInput(Scanner scanner) {
        List<String> inputList = Stream.generate(scanner::nextLine).takeWhile(line -> !line.equalsIgnoreCase("exit"))
                .collect(Collectors.toList());

        return inputList;
    }
}
