import java.util.*;

class Question {
    String questionText;
    List<String> options;
    int correctOption; // index starting from 1

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
                "1. What are Java loops?",
                Arrays.asList("To store data", "To execute code repeatedly", "To define classes", "None of the above"),
                2));

        questions.add(new Question(
                "2. What is enhanced for-loop?",
                Arrays.asList("Loop with multiple conditions", "Simplified for iteration over collections", "Infinite loop", "While loop"),
                2));

        questions.add(new Question(
                "3. How do you handle multiple user inputs?",
                Arrays.asList("Scanner with loops", "Only one Scanner", "By using if-else", "You cannot"),
                1));

        questions.add(new Question(
                "4. How is switch-case different from if-else?",
                Arrays.asList("Switch supports strings from Java 7", "Switch is faster in some cases", "Switch checks equality only", "All of the above"),
                4));

        questions.add(new Question(
                "5. What are collections in Java?",
                Arrays.asList("Group of objects", "Only arrays", "Primitive storage", "None"),
                1));

        questions.add(new Question(
                "6. What is ArrayList?",
                Arrays.asList("Resizable array", "Fixed-size array", "Hash table", "Tree set"),
                1));

        questions.add(new Question(
                "7. How to iterate using iterators?",
                Arrays.asList("Using for-each", "Using while with iterator.hasNext()", "Using do-while", "Cannot be done"),
                2));

        questions.add(new Question(
                "8. What is a Map?",
                Arrays.asList("Key-Value collection", "Single value list", "Only integers", "Tree only"),
                1));

        questions.add(new Question(
                "9. How to sort a list?",
                Arrays.asList("Collections.sort()", "list.sort()", "Using Streams", "All of the above"),
                4));

        questions.add(new Question(
                "10. How to shuffle elements?",
                Arrays.asList("Collections.shuffle()", "Randomize manually", "Sort in reverse", "Cannot shuffle"),
                1));

        // Shuffle questions if needed
        Collections.shuffle(questions);

        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.questionText);
            for (int i = 0; i < q.options.size(); i++) {
                System.out.println((i + 1) + ". " + q.options.get(i));
            }
            System.out.print("Enter your choice (1-4): ");
            int answer;
            while (true) {
                try {
                    answer = Integer.parseInt(sc.nextLine());
                    if (answer >= 1 && answer <= 4) break;
                    else System.out.print("Invalid choice. Try again: ");
                } catch (NumberFormatException e) {
                    System.out.print("Enter a number between 1 and 4: ");
                }
            }
            if (answer == q.correctOption) {
                score++;
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.size());

        sc.close();
    }
}
