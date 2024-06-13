import java.util.Arrays;

// 2037. Minimum Number of Moves to Seat Everyone
public class LC2037 {
    // Using Arrays.sort
    /*public static int minMovesToSit(int[] seats, int[] students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves =0;
        for (int i=0; i<seats.length; i++){
            moves+= Math.abs(seats[i]-students[i]);
        }
        return moves;
    }*/

    // Using counting sort
    public static int minMovesToSeat(int[] seats, int[] students) {
        int[] position = new int[101];
        for(int i=0; i<seats.length; i++){
            position[seats[i]]++;
            position[students[i]]--;
        }
        int result =0;
        int current =0;
        for(int i : position){
            result += Math.abs(current);
            current += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] seats ={2,2,6,6};
        int[] students = {1,3,2,6};
        System.out.println(minMovesToSeat(seats, students));

    }
}
