import java.util.*;
public class Jobsequence04 {
    public static class Job { // Class job blueprint
        int deadline;
        int profit;
        int id; // 0(A), 1(B)
        // Constructor
        public Job(int d, int p, int i) {
            deadline = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size:");
        int n = sc.nextInt();
        System.out.println("Enter the deadline and profit:");
        Integer jobinfo[][] = new Integer[n][n];
        for(int i = 0,j =0; i<n; i++,j++) {
            jobinfo[i][j] = sc.nextInt();
        }
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0; i<jobinfo.length; i++) {
            jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
        }
        // sort
        Collections.sort(jobs,(a,b) -> a.profit-b.profit);
      




    }
}