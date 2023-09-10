package encapsulation;

public class Phonebook {
    private String name;
    private String mobileNumber;

    public Phonebook(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    //Assessor - Name
    public String getName() {
        return this.name;
    }

    //Mutator - Name
    public void setName(String name) {
        this.name = name;
    }

    //Assessor - Mobile Number
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    //Mutator - Mobile Number
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber; //0
    }

    public void displayContact(){
        System.out.println("Name: " + this.name + "\nContact: " + 639 +
                this.mobileNumber +"\n");
    }
}
