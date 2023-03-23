import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        System.out.println(VowelOnly.vowelOnly("My name is Kyalo"));
        int[] arr = {1,2,3,4,5};
        System.out.println(BinarySearch.findTarget(arr, 1));
        Recursion.printPermutn(arr,0);
        String[] array = {"abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee"};
        List<String> input = Arrays.asList(array);
        System.out.println(Lists.groupString(input));
        for (List<String> ans : Lists.groupString(input)) {
            System.out.print(ans);
            System.out.println();
        }
        System.out.println(Calculator.calculate("3*2+5"));
    }
}
