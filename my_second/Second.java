package my_second;

import java.io.*;
import java.util.*;

public class Second {
    // Fast input reader
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                String line = br.readLine();
                if (line == null)
                    return null; // End of input
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    // long[] ai = Arrays.stream(fs.nextLine().split("
    // ")).mapToLong(Long::parseLong).toArray();

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        // Example: read two integers and output their sum
        int n = fs.nextInt();
        long k = fs.nextLong();
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            long x = fs.nextLong();
            pq.add(new long[] { x, (long) i + 1 });
        }

        while (k > 0) {
            if (pq.size() < 2) {
                long[] t = pq.poll();
                t[0] += t[1] * k;
                pq.add(t);
                break;
            }

            long[] t = pq.poll();
            long[] s = pq.peek();

            long diff = s[0] - t[0];
            long step = t[1];

            long need = diff / step + 1;

            long count = Math.min(need, k);

            t[0] += step * count;
            k -= count;

            pq.add(t);
        }

        System.out.println(pq.peek()[0]);
    }
}
