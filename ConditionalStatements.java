public class ConditionalStatements {
    public static void main(String[] args) {
        //conditional statements in java
        //1. if statement
        boolean isSunUp = false;
        if (isSunUp == true) 
            System.out.println("Day Time");
        else
            System.out.println("Night Time");
//2. if-else statement
        int age = 20;
        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }
//3. switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //4. ternary operator
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        
}
}
