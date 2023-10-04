package lambda;

import java.util.Arrays;
import java.util.List;
import static java.lang.Math.PI;

public class Main {

    enum DaysOfTheWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    static DaysOfTheWeek day = DaysOfTheWeek.MONDAY;

    public static void main(String[] args) {
        System.out.println(day);
        System.out.println(DaysOfTheWeek.FRIDAY);
        System.out.println(PI);

        //Consumer
        List<String> studentList = Arrays.asList("Patricia", "Anne", "Jasper","Lance");
        studentList.forEach(student -> { System.out.println(student);});

        //Comparator
        List<Integer> numberList = Arrays.asList(10, 5, 9, 12, 13);
        numberList.sort((right, left) -> left.compareTo(right));
        System.out.println("Sorted List: " + numberList);

    }
}
