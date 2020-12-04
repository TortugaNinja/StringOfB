package ch;

public class App {
    public static void main(String[] args) {

        String one = "1";

        int solution = 0;

        String largeBinaryString = new String();

        for (int i = 0; i < 400000; i++) {

            largeBinaryString += one;

        }

        if (largeBinaryString.length() == 400000) {

            solution = Solution.solution(largeBinaryString);
            System.out.println(solution);

        } else {}
      

        System.out.println(Solution.solution("011100"));

        System.out.println(Solution.solution("111"));

        System.out.println(Solution.solution("1111010101111"));

    }

}
