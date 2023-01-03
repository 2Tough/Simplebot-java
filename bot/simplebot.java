package bot;

import java.util.Scanner;

public class simplebot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        newTopic();
    }



    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

     static void test() {
        System.out.println("Let's test your knowledge.");
        System.out.println("What is the meaning of life?");
        System.out.println("1. To make money.");
        System.out.println("2. To struggle and never give up.");
        System.out.println("3. To do what you want.");
        System.out.println("4. To suffer");

        int input = scanner.nextInt();

        if (input == 1)  {
            System.out.println("Please, try again.");
        } else if (input == 4 ){
            System.out.println("Please, try again.");
        } else if (input == 3) {
            System.out.println("Please, try again.");
        } else {
            newTopic();
        }
    }

    static void newTopic() {
        System.out.println("Congratulations! that is correct!");
        System.out.println("Now, would you like to talk about something interesting?"); 

        String topicAnswer = scanner.nextLine();

        if (topicAnswer.equals("Yes") || topicAnswer == "yes") {
            System.out.println("Then any of the following topics!");
            System.out.println("1. Programing.");
            System.out.println("2. Antarctida.");
            System.out.println("3. Stolen history.");

            int answerInput = scanner.nextInt();

            if (answerInput == 1)  {
                System.out.println("Please, read about redpills. Don't watch hollywood movies or listen to anything mainstrain. They want to control you by programming you without your knowledge.");
            } else if (answerInput == 2 ){
                System.out.println("Something is hidden there. Check Robert Byrd and his tale about his voyage to Antarctida. There is a piramid and creatures from nightmares roaming there.");
            } else if (answerInput == 3) {
                System.out.println("History is written by the victor. Ancient culture, the way it has been told to us is a lie. Look into world fairs, something doesn't add up.");
            } else {
                System.out.println("Please select a topic.");
            }
            
        } else {
            System.out.println("Talk to you later!");
        }
    }


}
