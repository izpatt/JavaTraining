package validation;

public class Person {

    private String name;
    private String format;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.equals(null)) {
            throw new IllegalArgumentException("Invalid name format");
        }
        this.name = name;


    }

    public void setFormat(String format) {
        if(format.isBlank() || format.equals(null)) {
            throw new IllegalArgumentException("Invalid format");
        }

        this.format = format;

    }

    public void setRating(double rating) {
        if(rating < 0 | rating > 10) {
            throw new IllegalArgumentException("Rating must range from 0 to 10");
        }

        this.rating = rating;

    }
}
