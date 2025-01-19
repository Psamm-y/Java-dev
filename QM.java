package Javadev;

import java.util.*;

public class QM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of variables (up to 4):");
        int numVariables = scanner.nextInt();
        if (numVariables < 1 || numVariables > 4) {
            System.out.println("Invalid number of variables. Please enter between 1 and 4.");
            return;
        }

        System.out.println("Enter the minterms separated by spaces (e.g., 0 1 2 5):");
        scanner.nextLine(); // Consume newline
        String[] mintermsInput = scanner.nextLine().split(" ");
        List<Integer> minterms = new ArrayList<>();
        for (String minterm : mintermsInput) {
            minterms.add(Integer.parseInt(minterm));
        }

        System.out.println("Enter the don't-care terms separated by spaces (or leave blank):");
        String dontCareInput = scanner.nextLine();
        List<Integer> dontCares = new ArrayList<>();
        if (!dontCareInput.isEmpty()) {
            String[] dontCareTerms = dontCareInput.split(" ");
            for (String term : dontCareTerms) {
                dontCares.add(Integer.parseInt(term));
            }
        }

        Set<Integer> allTerms = new HashSet<>(minterms);
        allTerms.addAll(dontCares);

        // Convert terms to binary strings
        Map<String, List<Integer>> groupedTerms = groupByOnes(allTerms, numVariables);

        // Find prime implicants
        List<String> primeImplicants = findPrimeImplicants(groupedTerms, numVariables);

        // Identify essential prime implicants
        List<String> essentialPrimeImplicants = findEssentialPrimeImplicants(primeImplicants, minterms, numVariables);

        // Display minimized SOP
        System.out.println("Minimized Boolean function in SOP form:");
        if (essentialPrimeImplicants.isEmpty()) {
            System.out.println("1"); // Tautology
        } else {
            System.out.println(String.join(" + ", essentialPrimeImplicants));
        }
    }

    // Groups terms by the number of 1's in their binary representation
    private static Map<String, List<Integer>> groupByOnes(Set<Integer> terms, int numVariables) {
        Map<String, List<Integer>> groupedTerms = new TreeMap<>();
        for (int term : terms) {
            String binary = toBinaryString(term, numVariables);
            int onesCount = countOnes(binary);
            groupedTerms.computeIfAbsent(String.valueOf(onesCount), k -> new ArrayList<>()).add(term);
        }
        return groupedTerms;
    }

    // Converts an integer to a binary string of fixed length
    private static String toBinaryString(int number, int length) {
        return String.format("%" + length + "s", Integer.toBinaryString(number)).replace(' ', '0');
    }

    // Counts the number of 1's in a binary string
    private static int countOnes(String binary) {
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }

    // Finds prime implicants using Quine-McCluskey method
    private static List<String> findPrimeImplicants(Map<String, List<Integer>> groupedTerms, int numVariables) {
        // Implementation of prime implicant finding logic
        return new ArrayList<>(); // Placeholder
    }

    // Identifies essential prime implicants
    private static List<String> findEssentialPrimeImplicants(List<String> primeImplicants, List<Integer> minterms, int numVariables) {
        // Implementation of essential prime implicant finding logic
        return new ArrayList<>(); // Placeholder
    }
}