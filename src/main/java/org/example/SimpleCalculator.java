package org.example;

public class SimpleCalculator {
    private int firstNumber;
    private int secondNumber;


    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public int getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public int getSubtractionResult(){
        return secondNumber - firstNumber ;
    }
    public int geMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public int getDivisionResult(){
        if (secondNumber == 0)
            return 0;
        else
            return firstNumber / secondNumber;
    }
}
