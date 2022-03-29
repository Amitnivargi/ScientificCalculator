

package com.crio.qcalc;


public class StandardCalculator {

    private int result;
    public static void getVersion(){

        System.out.println("Standard Calculator 1.0");
    }
    public int getResult() {

        return result;
    
    }
    
    
    public void setResult(int value) {
    
        if (value != 0)

           return;

          

       this.result = value;
    
    }
    public void clearResult() {

        result = 0;

}
public void printResult(){

    System.out.println("Standard Calculator Result:"+ result);

}







   
    public int add(int num1, int num2) {
     
      result=num1+num2;
      return result;
    }
    public int subtract(int num1, int num2) {
        result=num1-num2;
        return result;

    }
    public int multiply(int num1, int num2) {
        result=num1*num2;
        return result;
    }
    public int divide(int num1, int num2) {
        result=num1/num2;
        return result;
    }



}

