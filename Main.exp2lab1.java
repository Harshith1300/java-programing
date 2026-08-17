import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read customer name
        String name = sc.nextLine();

        // Read feedback
        String feedback = sc.nextLine();

        // Read keyword
        String keyword = sc.nextLine();

        // Check whether feedback is empty
        if (feedback.isEmpty()) {
            System.out.println("Invalid Feedback Message");
        }
        else if (feedback.length() > 500) {
            System.out.println("Feedback Exceeds Maximum Length");
        }
        else {

            // Count characters
            int characters = feedback.length();

            // Count words
            String[] words = feedback.split(" ");
            int wordCount = words.length;

            // Convert both to lowercase
            String lowerFeedback = feedback.toLowerCase();
            String lowerKeyword = keyword.toLowerCase();

            // Count keyword occurrences
            int count = 0;

            for (String word : words) {

                if (word.toLowerCase().equals(lowerKeyword)) {
                    count++;
                }
            }

            // Display character and word count
            System.out.println("Characters = " + characters);
            System.out.println("Words = " + wordCount);

            // Display keyword result
            if (count > 0) {
                System.out.println("Keyword Found = " + count);
            }
            else {
                System.out.println("Keyword Not Found");
            }
        }
    }
}