package HelloWorld;

public class VotingEligibility {

    public static void main(String[] args) {

        int age = 20;

        if (age < 0) {
            System.out.println("Invalid Age");
        }
        else if (age >= 18) {
            System.out.println("Age is Valid");
            System.out.println("Eligible for Voting");
        }
        else {
            System.out.println("Age is Valid");
            System.out.println("Not Eligible for Voting");
        }
    }
}