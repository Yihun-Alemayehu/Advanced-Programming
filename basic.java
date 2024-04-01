public class basic {
    public static void main(String[] args) {

        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        switch (number) {
            case 1:
            System.out.println("The number is 1.");
            break;
            case 2:
            System.out.println("The number is 2.");
            break;
            case 3:
            System.out.println("The number is 3.");
            break;
            default:
            System.out.println("The number is not 1, 2, or 3.");
            break;
        }

        
    }
}

