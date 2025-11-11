package solutions.funtions;

public class VotingEligibility {
    static boolean isEligible(int age) {
        return (age>=18);
    }

    public static void main(String[] args) {
        int age;

        age = 15;
        System.out.println(isEligible(age));

        age = 20;
        System.out.println(isEligible(age));

        age = 25;
        System.out.println(isEligible(age));
    }
}
