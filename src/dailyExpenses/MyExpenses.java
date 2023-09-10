package dailyExpenses;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class MyExpenses {

    private List<Item> myExpenses;
    private BigDecimal totalExpenses;

    public MyExpenses() {
        this.myExpenses = new ArrayList<>();
        this.totalExpenses = BigDecimal.valueOf(0);
    }

    public List<Item> getMyExpenses() {
        return myExpenses;
    }

    public BigDecimal getTotalExpenses() {
        return totalExpenses;
    }

    public BigDecimal add(Item item) {
        myExpenses.add(item);
        totalExpenses = totalExpenses.add(item.getAmount());
        return totalExpenses;
    }

    public void displayMyExpenses() {
        System.out.printf(
                "%-25s %-20s %-40s %-30s\n",
                "Date", "Item","Date", "Item");

        for (Item item : myExpenses) {
            System.out.printf(
                    "%-25s %-20s %-40s %-30s\n",
                    item.getDate(), item.getItem(), item.getDescription(), item.getAmount());
        }
    }

    public void displayDailyExpenses() {

        Map<LocalDateTime, BigDecimal> allExpenses = myExpenses.stream()
                .collect(Collectors.groupingBy(
                        item -> item.getDate(),
                        Collectors.reducing(BigDecimal.ZERO, Item::getAmount,
                                BigDecimal::add)
                ));

        //Two list for Hash Map Key Value pairs
        List<LocalDateTime> dateList = new ArrayList<>();
        List<BigDecimal> amountList = new ArrayList<>();

        for (Map.Entry<LocalDateTime, BigDecimal> entry :
                allExpenses.entrySet()) {
            String oldDateTime = entry.getKey().toString().replace(" ", "T");
            LocalDateTime result = LocalDateTime.parse(oldDateTime,
                    DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
            dateList.add(result);
            amountList.add(entry.getValue());
        }

        //Putting 2 list in the hash map
        HashMap<LocalDateTime, BigDecimal> hashmap =
                new HashMap<>();
        for (int i = 0; i < dateList.size(); i++) {
            hashmap.put((dateList.get(i)), amountList.get(i));
        }

        //Sort the hash map
        ArrayList<LocalDateTime> sortedHashMap = new ArrayList<>(hashmap.keySet());
        Collections.sort(sortedHashMap);

        System.out.println("Date\t\t\tAmount");
        // Display the sorted map
        for (LocalDateTime keys : sortedHashMap) {
            System.out.printf("[%s]   %5s\n",
                    keys.toLocalDate(),
                    hashmap.get(keys));
        }
    }

}
