package Chapter_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
 
public class Permutation {
    public static void main(String[] args) {
        //jvm在调用主函数时,传入的是new args[0]
        int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> rq = new RandomizedQueue<String>();
        while (!StdIn.isEmpty()) {
            rq.enqueue(StdIn.readString());
        }
        while ( rq.size()-k > 0) rq.dequeue();
        for(int i = 0; i < k; i++) {
            StdOut.println(rq.dequeue());
        }
    }
}   