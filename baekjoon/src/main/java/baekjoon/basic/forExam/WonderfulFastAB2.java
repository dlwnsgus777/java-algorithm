package baekjoon.basic.forExam;

import java.io.*;
import java.util.StringTokenizer;

public class WonderfulFastAB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String string = "" + a + " + " + b + " = ";

            bw.write("Case #" + i + ": " + string + (a + b) + "\n");
        }

        bw.flush();
    }
}
