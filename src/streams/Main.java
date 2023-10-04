package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(35.86, 90.38, 124.56, 376.56, 10.50, 18.24);
        prices.stream()
                .filter(price ->  price > 35)
                .map(price -> price - 0)
                .sorted(Comparator.naturalOrder())
                .map((price -> price.toString()))
                .forEach(price -> {
                    // System.out.println(price);
                });

        List<String> usernames = Arrays.asList("pat", "patricia", "patricianne");
        List<String> usernamesCapitalized = usernames.stream()
                .map(username -> username.toUpperCase())
                .toList();

//        System.out.println(usernames);
//        System.out.println(usernamesCapitalized);


        List<Double> grades = Arrays.asList(1.75, 1.00, 2.25, 2.75, 1.25); //9.00
        Double totalGrade = grades.stream()
                .reduce(0.00, ((x,y) -> x+y));
        //System.out.println("Total Grade is: " + totalGrade);



        List<String> menus = Arrays.asList("Coffee", "Tea", "Hot Choco");
        String response = menus.stream()
                .filter(menu -> menu.equals("Cofffee"))
                .findFirst()
                .orElse("Nothing in here");

        //System.out.println(response);

        List<Integer> numbers = Arrays.asList(1,1,1,1,1,6,7,8,9,10);
        long totalCount = numbers.stream().count();
        long totalCount1 = numbers.stream().filter(number -> number == 1).count();
        System.out.println("Total Numbers = " + totalCount);
        System.out.println("Total Count of #1 = " + totalCount1);
    }
}
