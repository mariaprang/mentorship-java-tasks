package collections_tasks;
public class TaskTests {


    public void testFindMostFrequentLetter() {
        if (Tasks.findMostFrequentLetter("apple") != 'p') {
            System.out.println("Test findMostFrequentLetter FAILED");
        } else if (Tasks.findMostFrequentLetter("") != ' ') {
            System.out.println("Test findMostFrequentLetter FAILED");
        } else if (Tasks.findMostFrequentLetter("a") != 'a') {
            System.out.println("Test findMostFrequentLetter FAILED");
        } else {
            System.out.println("Test findMostFrequentLetter PASSED !");
        }
    }

    public void testPrintLetterCount() {
        String resultApple = "\"a\" is used 1 times\n" +
                "     * \"p\" is used 2 times\n" +
                "     * \"l\" is used 1 times\n" +
                "     * \"e\" is used 1 times";
        if (!Tasks.printLetterCount("apple").equals(resultApple)) {
            System.out.println("Test printLetterCount FAILED");
        }
        else if (!Tasks.printLetterCount(null).equals(null)) {
            System.out.println("Test printLetterCount FAILED");
        }
        else if (!Tasks.printLetterCount("").equals("")) {
            System.out.println("Test printLetterCount FAILED");
        }
        else {
            System.out.println("Test printLetterCount PASSED !");
        }
    }
}
