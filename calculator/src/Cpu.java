public class Cpu {

    public static Double sum(Double number1, Double number2){
        return number1 + number2;
    }

    public static Double subtract(Double number1, Double number2){
        return number1 - number2;
    }

    public static Double multiply(Double number1, Double number2){
        return number1 * number2;
    }

    public static Double divide(Double number1, Double number2){  // добавить эксершн деления на ноль
        return number1 / number2;
    }

    public static  Double operation (Double number1, Double number2, String operation){
        switch (operation){
            case "+":
                return sum(number1, number2);
            case "-":
                return subtract(number1, number2);
            case "*":
                return multiply(number1, number2);
            case "/":
                return divide(number1, number2);
        }

        return 0.0; // доделать эксептион непподдерживаемой операции, допустим в виде error на дисплее калькулятора
    }
}
