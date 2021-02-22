package Study;

public class Main {
    public static void main(String[] args) {

        Sum pop = new Sum();
        boolean b1 = pop.numbersSum(23, 445);
        System.out.println(b1);


        Year year = new Year();
        year.visokos(1600);

        Expression expression = new Expression();
        float v = expression.countNumbers(3, 5, 5.563f, 6.44f);
        System.out.println(v);
    }
}



