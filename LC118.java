import java.util.ArrayList;
import java.util.List;

// 118. Pascal's Triangle
public class LC118 {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        List<Integer> prev = row;
        for (int i=1; i<numRows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j=1; j<i; j++){
                curr.add(prev.get(j)+ prev.get(j-1));
            }
            curr.add(1);
            //result.add(new ArrayList<>(curr));
            result.add(curr);
            prev = curr;
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> PascalsTriangle = generate(numRows);
        for (List<Integer> i: PascalsTriangle){
            System.out.println(i);
        }
    }
}
