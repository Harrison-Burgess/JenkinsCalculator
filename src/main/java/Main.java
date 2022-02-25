public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        String string = args[0];
        int firstNum = Integer.parseInt(args[1]);
        int secondNum = Integer.parseInt(args[2]);
        if(string.equals("add")){
            System.out.println(calculator.add(firstNum, secondNum));
        }
        if(string.equals("subtract")){
            System.out.println(calculator.subtract(firstNum, secondNum));
        }
        if(string.equals("multiply")){
            System.out.println(calculator.multiply(firstNum, secondNum));
        }
        if(string.equals("divide")){
            System.out.println(calculator.divide(firstNum, secondNum));
        }
        if(string.equals("fibonacci")){
            System.out.println(calculator.fibonacciNumberFinder(firstNum));
        }
        if(string.equals("binary")){
            System.out.println(calculator.intToBinaryNumber(firstNum));
        }

    }
}
