package encapsulation;

public class Main {
    public static void main(String[] args) {
        Phonebook patricia = new Phonebook("Default Name", "000000000");
        System.out.println("\n--- Default Phonebook --- ");
        patricia.displayContact();

        System.out.println("\n--- Updated Phonebook --- ");
        patricia.setName("Patricia Anne");
        patricia.getName();
        patricia.setMobileNumber("299928421");
        patricia.getMobileNumber();
        patricia.displayContact();
    }

}