// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

    public abstract int compute2(int x, int y);
}



public class Main {

    public static void main(String[] args) {

        // 익명 클래스
        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }

            @Override
            public int compute2(int x, int y) {
                return 0;
            }
        };
        System.out.println(cTool1.compute(1, 2)); // 3

        // 람다식
        // 추상메소드가 2개 일 때 람다식은 사용이 제한된다
//        ComputeTool cTool2 = (x, y) -> { return x + y; };
//        System.out.println(cTool2.compute(1, 2)); // 3

    }
}
