package collections_tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskTests {

    private Student one;
    private Student two;
    private Student three;


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
        } else if (!Tasks.printLetterCount(null).equals(null)) {
            System.out.println("Test printLetterCount FAILED");
        } else if (!Tasks.printLetterCount("").equals("")) {
            System.out.println("Test printLetterCount FAILED");
        } else {
            System.out.println("Test printLetterCount PASSED !");
        }
    }


    private List<Student> initializeArrayList() {
        List<Student> list = new ArrayList<>();
        this.one = new Student("Bob", 3.95);
        this.two = new Student("Anna", 2.79);
        this.three = new Student("John", 1.25);
        list.add(one);
        list.add(two);
        list.add(three);
        return list;
    }

    public void testSortByName() {
        List<Student> list = initializeArrayList();
        Tasks.sortByName(list);
        if (!list.get(0).equals(two)) {
            System.out.println("Test sortByName FAILED!");
        } else if (!list.get(1).equals(one)) {
            System.out.println("Test sortByName FAILED!");
        } else if (!list.get(2).equals(three)) {
            System.out.println("Test sortByName FAILED!");
        } else {
            System.out.println("Test sortByName passed!");
        }
    }

    public void testSortByGPA() {
        List<Student> list = initializeArrayList();
        Tasks.sortByGPA(list);
        if (!list.get(0).equals(three)) {
            System.out.println("Test sortByName FAILED!");
        } else if (!list.get(1).equals(two)) {
            System.out.println("Test sortByName FAILED!");
        } else if (!list.get(2).equals(one)) {
            System.out.println("Test sortByName FAILED!");
        } else {
            System.out.println("Test sortByName passed!");
        }
    }
}
