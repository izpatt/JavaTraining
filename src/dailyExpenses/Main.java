package dailyExpenses;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        MyExpenses myExpenses = new MyExpenses();

        //Item - 15 characs and Desc - 30 characs
        myExpenses.add(new Item("Ballpen", "GTEC Ballpen 0.3 point", BigDecimal.valueOf(100), LocalDateTime.of(
                2023, Month.APRIL, 24, 14, 33)));
        myExpenses.add(new Item("Yellow Paper", "100 leaves", BigDecimal.valueOf(100), LocalDateTime.of(
                2023, Month.AUGUST, 24, 14, 33)));
        myExpenses.add(new Item("Plastic Bag", "Transparent XL plastic bag", BigDecimal.valueOf(100), LocalDateTime.of(
                2022, Month.APRIL, 24, 14, 33)));
        myExpenses.add(new Item("Wall Decoration", "30 x 30 grid black", BigDecimal.valueOf(100), LocalDateTime.of(
                2022, Month.AUGUST, 24, 14, 33)));
        myExpenses.add(new Item("Slippers", "Aqua Shoes with pink shade", BigDecimal.valueOf(300), LocalDateTime.of(
                2025, Month.APRIL, 24, 14, 33)));

        myExpenses.add(new Item("Mouse Pad", "Full length with rounded corners", BigDecimal.valueOf(100), LocalDateTime.of(
                2023, Month.APRIL, 24, 14, 33)));
        myExpenses.add(new Item("Facial Wash", "COSRX Low PH Cleanser", BigDecimal.valueOf(500), LocalDateTime.of(
                2023, Month.AUGUST, 18, 14, 33)));
        myExpenses.add(new Item("Acryllic Box", "Two layers, medium size", BigDecimal.valueOf(100), LocalDateTime.of(
                2022, Month.APRIL, 24, 14, 33)));
        myExpenses.add(new Item("Headset", "Jabra in the shade of gray", BigDecimal.valueOf(500), LocalDateTime.of(
                2022, Month.AUGUST, 24, 14, 33)));
        myExpenses.add(new Item("Charger", "Type C-Android phone", BigDecimal.valueOf(300), LocalDateTime.of(
                2023, Month.DECEMBER, 01, 14, 33)));

        System.out.println("");
        myExpenses.displayMyExpenses();
        System.out.println("");
        myExpenses.displayDailyExpenses();


    }

}
