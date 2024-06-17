public class Test {
    public static int number_one = 8;

    public void display_one() {
        System.out.println(number_one);
    }

    public static void display_two() {
        // Create an instance of the class to access the non-static member
        Test t = new Test();
        System.out.println(t.number_two);
    }

    public void display_three() {
        System.out.println(number_two);
    }

    public void display_four() {
        System.out.println(number_two);
        number_two = number_two++;
        System.out.println(number_two);
    }

    public int number_two = 12;

    public static void main(String[] args) {
        Test t = new Test();
        t.display_one();
        t.display_three();
        t.display_four();
        t.display_three();
        t.display_three();
        t.display_four();
        t.display_three();
    }
}
