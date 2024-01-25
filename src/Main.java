public class Main {
    public static void main(String[] args) {
        if (args.length == 3) {
            int operator_a = Integer.parseInt(args[0]);
            int operator_b = Integer.parseInt(args[1]);
            int operator_c = Integer.parseInt(args[2]);
            Work work = new Work(operator_a, operator_b, operator_c);
            double[] array = work.quadraticEquation();
            for (double element  : array) {
                System.out.printf("x = %f\n", element);
            }
        } else if (args.length == 1) {
            int operator_a = Integer.parseInt(args[0]);
            Work work = new Work(operator_a);
            double sum = work.sumRow();
            System.out.println(sum);
        } else {
            System.out.println("?");
        }
    }
}
//java Main.java 12
// D:\Vsaka\Projects\Progects\Java-project\HomeWorkNum2\src>
