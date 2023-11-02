//import java.util.ArrayList;
//import java.util.List;
//
//public class Subsets2 {
//    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<Integer>();
//        a.add(1);
//        a.add(2);
//        a.add(2);
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        result = subsetsWithDup(a);
//        System.out.println(result);
//    }
//    public static List<List<Integer>> subsetsWithDup(List<Integer> nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        res.add(new ArrayList<>());
//        for (int n: nums) {
//            int size = res.size();
//            for (int i = 0; i < size; i++) {
//                List<Integer> subset = new ArrayList<>(res.get(i));
//                subset.add(n);
//                res.add(subset);
//            }
//        }
//        return res;
//    }
//}
