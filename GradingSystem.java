public class GradingSystem {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade)
        {
            case 'A': System.out.println("Excellence"); break;
            case 'B': System.out.println("Very Good"); break;
            case 'C': System.out.println("Good"); break;
            case 'D': System.out.println("Fair"); break;
            case 'E': System.out.println("Repeat"); break;
            default: System.out.println("Invalid Grade");
        }
    }
}