package dailyExpenses;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Item  {

    private String item;
    private String description;
    private BigDecimal amount;
    private LocalDateTime date;

    public Item(String item, String description, BigDecimal amount, LocalDateTime date) {
        this.item = item;
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item.substring(0,15);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description.substring(0,30);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
