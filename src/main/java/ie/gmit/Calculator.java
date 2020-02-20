package ie.gmit;

public class Calculator {
    private int firstNum;
    private int secondNum;

    public Calculator() {
        this.firstNum = 0;
        this.secondNum = 0;
    }

    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int divide(int firstNum, int secondNum) {
        if(firstNum == 0 || secondNum == 0)
            throw new ArithmeticException("Cannot divide by 0");
        else
            return firstNum / secondNum;
    }
}
