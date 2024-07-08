public class Grade {
    public static void main(String[] args) {
        int marks = 85; 
        int passMark = 75;      
   if (marks >= 93) {
            System.out.println("Grade is A. Passed exam.");
        } else if (marks >= 85 && marks < 93) {
            System.out.println("Grade is B. Passed exam.");
        } else if (marks >= 80 && marks < 85) {
            System.out.println("Grade is C. Passed exam.");
        } else if (marks >= 75 && marks < 80) {
            System.out.println("Grade is D. Passed exam.");
        } else if (marks < 75 && marks >= 0) {
            System.out.println("Grade is E. Fail exam.");
        } else {
            System.out.println("Unknown value");
        }
    }
}
