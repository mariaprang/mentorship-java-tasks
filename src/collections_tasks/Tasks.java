package collections_tasks;
import java.util.HashMap;
import java.util.List;

public class Tasks {

    /**
     * Implement this method using a HashMap
     * It should accepts a string argument and return the most frequently used letter in the word.
     * For example, "apple" -> will return 'p', "java" -> will return 'a'
     * If the empty string is passed to a method an empty space should be returned -> ' '
     */

    public static char findMostFrequentLetter(String word) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * This method should accept a word and return a string containing the count of each letter like this:
     * (for word apple the returned
     * "a" is used 1 times
     * "p" is used 2 times
     * "l" is used 1 times
     * "e" is used 1 times
     * @return
     * @param word
     */
    public static String printLetterCount(String word) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * This is a helper method for the methods 'findMostFrequentLetter' and 'printLetterCount'
     *
     * @param word
     * @return
     */
    private static HashMap<Character, Integer> getLetterMap(String word) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * This method should accept a student list as an argument, sort all students by name using a
     * Comparator and should return a sorted list of students
     * @param list
     * @return
     */
    public static List<Student> sortByName(List<Student> list){
        throw new UnsupportedOperationException("Not implemented yet");
    }


    /**
     * This method should accept a student list as an argument, sort all students by GPA using a
     * Comparator and should return a sorted list of students
     * @param list
     * @return
     */
    public static List<Student> sortByGPA(List<Student> list){
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
