import java.util.function.Function;
import java.util.function.BiFunction;
public class lambda {
    public static void main(String[] args) {
        Function<Integer, Integer> plusFunction = x-> x+ 1;
        // int bbb = plusFunction.apply(3);
        System.out.println(plusFunction.apply(3));

        Function<Integer, Integer> squareFunction = x-> x * x;
        System.out.println(squareFunction.apply(3));

        BiFunction<String, String, String> firstLastName = (firstName, lastName)-> firstName + ", " + lastName;
        System.out.println(firstLastName.apply("Apoesas", "dejene"));
    }
}