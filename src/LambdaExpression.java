@FunctionalInterface
interface Addition {
    int sum(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Addition res = (a, b) -> a + b;
        System.out.println(res.sum(5, 6));
    }
}
