package model1;
public class Calculator {
  public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0)
            return a / b;
        else
            return 0;
    }
  
}
