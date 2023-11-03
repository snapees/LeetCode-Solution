
// Array Example
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[20];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        List<List<Integer>> out = subsets(arr);
//        System.out.println(out);
        List<Integer> a = new ArrayList<Integer>();
        a.add(0);
//        a.add(2);
//        a.add(3);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result = subsets(a);
        System.out.println(result);

    }
    public static List<List<Integer>> subsets(List<Integer> nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int n: nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(res.get(i));
                subset.add(n);
                res.add(subset);
            }
        }
        return res;
    }
}
