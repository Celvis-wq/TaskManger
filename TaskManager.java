// TaskManager.java - By Celvis#5477
// Version: 0.0.3

/*TODO
 * Fix "end" on the start of the program (It shouldn't create a file when you type "end" on the first tasklist creation option)
 */

// Import
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Variables
        int taskListNumber = 0;
        boolean isRunning = true;

        // List
        char[] animationChars = new char[] { '|', '/', '-', '\\' };

        // Menu Display
        System.out.println(
                "\nWelcome to Task Manager BETA!\nWhile entering your tasks, type \"end\" to end task creation and move on.\n(Please note: Do not type end on the third task creation, the third task is the end of this program.)\n");

        // Store/Input
        // User name
        System.out.print("Enter your name.\n=> ");
        String userName = scan.nextLine();

        // Welcome!
        System.out.println("\nWelcome " + userName + "!");

        // Start of TaskList
        while (isRunning) {
            System.out.print("Enter task name!\n=> ");
            String taskName = scan.nextLine();

            // Check for "end" command
            if (taskName.toLowerCase().equals("end")) {
                // Load exit on "end" command
                System.out.println("\n");

                for (int i = 0; i <= 100; i++) {
                    System.out.print("Ending Task Manager... " + i + "% " + animationChars[i % 4] + "\r");
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        scan.close();
                        e.printStackTrace();
                    }
                }
                System.out.println(
                        "\nTask Manager has been successfully terminated!\n!! A Task list file was created under the name \""
                                + userName + "'s Tasklist.txt\" !!\n");
                isRunning = false;
            } else {
                taskListNumber++;
                System.out.println("(Task: \"" + taskName + "\" was successfully added to the list!)\n");

                try {
                    FileWriter fileWrite = new FileWriter(userName + "'s Tasklist.txt",
                            taskListNumber == 1 ? false : true);
                    fileWrite.write(
                            taskListNumber == 1 ? userName + "'s Tasklist:\n\nTask " + taskListNumber + ": " + taskName
                                    : "\nTask " + taskListNumber + ": " + taskName);
                    fileWrite.close();
                } catch (IOException e) {
                    System.out.println("There was an error creating/editing your tasklist file.");
                    scan.close();
                    e.printStackTrace();
                }
            }
        }
        scan.close();
        System.exit(0);
    }
    /*
     * else {
     * // End of taskOne
     * System.out.println("(Task: \"" + taskOne +
     * "\" was successfully added to the list!)\n");
     * 
     * // Start of taskTwo
     * System.out.print("Enter the second task name!\n=> ");
     * String taskTwo = scan.nextLine();
     * 
     * // Check 2
     * if (taskTwo.equals("end") || taskTwo.equals("END")) {
     * // Load exit on "end" command
     * System.out.println("\n");
     * 
     * for (int i = 0; i <= 100; i++) {
     * System.out.print("Ending Task Manager... " + i + "% " + animationChars[i % 4]
     * + "\r");
     * try {
     * Thread.sleep(15);
     * } catch (InterruptedException e) {
     * scan.close();
     * e.printStackTrace();
     * }
     * }
     * System.out.println(
     * "\nTask Manager has been successfully terminated!\n!! A Task list file was created under the name \""
     * + userName + "'s Tasklist.txt !!\n");
     * try {
     * FileWriter fileWrite = new FileWriter(userName + "'s Tasklist.txt");
     * fileWrite.write(userName + "'s Tasklist:\n\nTaskOne: " + taskOne);
     * fileWrite.close();
     * } catch (IOException e) {
     * scan.close();
     * System.out.println("There was an error creating your tasklist file.");
     * e.printStackTrace();
     * }
     * scan.close();
     * System.exit(0);
     * } else {
     * // End of taskTwo
     * System.out.println("(Task: \"" + taskTwo +
     * "\" was successfully added to the list!)\n");
     * 
     * // Start of taskThree
     * System.out.print("Enter the third task name!\n=> ");
     * String taskThree = scan.nextLine();
     * // Check 3
     * // Load exit on the end of task creation
     * // output
     * System.out.println("(Task: \"" + taskThree +
     * "\" was successfully added to the list!)");
     * System.out.println("\n");
     * 
     * for (int i = 0; i <= 100; i++) {
     * System.out.print("Ending Task Manager... " + i + "% " + animationChars[i % 4]
     * + "\r");
     * try {
     * Thread.sleep(15);
     * } catch (InterruptedException e) {
     * scan.close();
     * e.printStackTrace();
     * }
     * }
     * System.out.println(
     * "\nTask Manager has been successfully terminated!\n!! A Task list file was created under the name \""
     * + userName + "'s Tasklist.txt !!\n");
     * try {
     * FileWriter fileWrite = new FileWriter(userName + "'s Tasklist.txt");
     * fileWrite.write(userName + "'s Tasklist:\n\nTaskOne: " + taskOne +
     * "\nTaskTwo: " + taskTwo
     * + "\nTaskThree: " + taskThree);
     * fileWrite.close();
     * } catch (IOException e) {
     * System.out.println("There was an error creating your tasklist file.");
     * scan.close();
     * e.printStackTrace();
     * }
     * scan.close();
     * System.exit(0);
     * }
     * }
     */
}
