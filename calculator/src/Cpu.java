public class Cpu {

    public static  Double operation (Double number1, Double number2, String operation){
        switch (operation){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2; // добавить обраблотку деления на ноль
        }

        return 0.0; // доделать эксептион непподдерживаемой операции, допустим в виде error на дисплее калькулятора
    }
}
