import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge {

    public static int betterSolution(int[] array){
        Map<Integer, Integer> map = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(val -> 1)));
        System.out.println(map.entrySet());
        return map.entrySet().stream().filter(entry -> entry.getKey().equals(entry.getValue())).mapToInt(Map.Entry::getValue).max().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(betterSolution(new int[]{3, 8, 2, 3, 3, 2}));
        System.out.println(betterSolution(new int[]{7, 1, 2, 8, 2}));
        System.out.println(betterSolution(new int[]{3, 1, 4, 1, 5}));
        System.out.println(betterSolution(new int[]{5, 5, 5, 5, 5}));
    }

}
