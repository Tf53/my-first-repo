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

    System.out.println("java");
  }
}
  

