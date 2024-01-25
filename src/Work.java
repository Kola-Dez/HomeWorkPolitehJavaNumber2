public class Work {
        private final double operand_a;
        private double operand_b = 0;
        private double operand_c = 0;
        private final double[] array = new double[2];
        private double sum = 0;
        public Work(double operand_a, double operand_b, double operand_c){
            this.operand_a = operand_a;
            this.operand_b = operand_b;
            this.operand_c = operand_c;
        }
        public Work(double operand_a) {
            this.operand_a = operand_a;
        }

        public double[] quadraticEquation(){
            double discriminant = Math.pow(operand_b, 2) - 4 + operand_a * operand_c;

            if (discriminant > 0) {
                //Если D > 0, то у уравнения два действительных корня
                array[0] = (-operand_b + Math.sqrt(discriminant)) / (2 * operand_a);
                array[1] = (-operand_b - Math.sqrt(discriminant)) / (2 * operand_a);
            } else if (discriminant == 0) {
                //Если D = 0, то у уравнения один действительный корень
                array[0] = (-operand_b) / (2 * operand_a);
            } else {
                //Если D < 0, то у уравнения нет действительных корней,
                // а есть два комплексных корня
                double realPart = -operand_b / (2 * operand_a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * operand_a);
                array[0] = realPart + imaginaryPart;
                array[1] = realPart - imaginaryPart;
            }
            return array;
        }
        public double sumRow() {
            for (int i = 0; i < operand_a; i++) {
                sum += (Math.pow(8, operand_a) - Math.pow(3, operand_a + 1)) / Math.pow(10, operand_a);
            }
            return sum;
        }
    }
