// Java 프로그래밍 - 입출력_2

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt");
        String memo = "헤드 라인\n";
        fw.write(memo);

        memo = "1월 1일 날씨 맑음\n";
        fw.write(memo);

        fw.close(); // 꼭 작성해야 함

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo.txt");
        memo = "헤드 라인";
        pw.println(memo); // 엔터키 포함

        memo = "1월 1일 날씨 맑음";
        pw.println(memo); // 엔터키 포함

        pw.close(); // 꼭 작성해야 함

//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true); // true하면 이어쓰기

        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);

        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true)); // 이어쓰기

        memo = "1월 3일 날씨 또 맑음!";
        pw2.println(memo);

        pw2.close();

//      2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));

        while (true) {
            String line = br.readLine();

            if (line == null) {
                break;
            }

            System.out.println(line);
        }

        br.close();

    }
}
