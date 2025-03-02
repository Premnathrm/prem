 public class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b,int c)  {
        return a + b + c;
    }
   
    public  Double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        calculator calculator = new calculator();
        int sum1 = calculator.add(5, 10);  
        int sum2 = calculator.add(3, 4, 7);  
        double sum3 = calculator.add(5.5, 4.5); 
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}

