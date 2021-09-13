package mt.caseone;

public class Foo {
    public static void main(String[] args) {
        int[] data = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);

        }

        new Foo().solution(data);
    }

    public static class Circle {
        public final int left;

        public final int center;

        public final int right;

        public Circle(int center, int radius) {
            this.left = center - radius;
            this.center = center;
            this.right = center + radius;
        }
    }

    public int solution(int[] data) {
        Circle[] circles = new Circle[data.length];
        for (int i = 0; i < data.length; i++) {
            circles[i] = new Circle(i, data[i]);
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (circles[i].right >= circles[j].left) {
                    System.out.println("" + i + ", " + j);
                }
            }
        }

        return 0;
    }
}