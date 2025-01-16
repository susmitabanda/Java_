public class VoterEligibility {

    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public boolean isEligibleToVote() {
        return age >= 18;
    }

    public static void main(String[] args) {
        VoterEligibility student = new VoterEligibility();
        
        student.setAge(20); 
        
        if (student.isEligibleToVote()) {
            System.out.println("The student is eligible to vote.");
        } else {
            System.out.println("The student is not eligible to vote.");
        }
    }
}
