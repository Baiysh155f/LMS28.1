import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(10,1,2,3,4,5,6,7,8));
        System.out.println(integers.stream().filter(x -> x % 2 == 0).max(Comparator.naturalOrder()).map(x -> x * x).get());
    }
}