import edu.princeton.cs.algs4.MaxPQ;

public class PQTester {

    public static void main (String[] args) {
        System.out.println("N\tRuntime(ns)");
        for (int n = 10; n <= 1000000; n*=10) {
            int i;
            long running = 0;
            for (i = 0; i < 5; i++) {
                long start = System.nanoTime();
                MaxPQ<Integer> q = new MaxPQ<Integer>();
                randomFill(q, n);
                remove(q, q.size()/2);
                randomFill(q, n);
                remove(q, q.size());
                running += System.nanoTime() - start;
                q = null;
            }
            System.out.println(n + "\t" + running/(i+1));
        }
    }
    
    private static void randomFill(MaxPQ<Integer> q, int n) {
        for (int i = 0; i < n-q.size(); i++)
            q.insert(StdRandom.uniform(n));
    }
    
    private static void remove(MaxPQ<Integer> q, int num) {
        for (int i = 0; i < num; i++)
            q.delMax();
    }
}
