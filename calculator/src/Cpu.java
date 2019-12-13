public class Cpu {

    public static  String operation (Double number1, Double number2, String operation){
        switch (operation){
            case "+":
                return Double.toString(number1 + number2);
            case "-":
                return Double.toString(number1 - number2);
            case "*":
                return Double.toString(number1 * number2);
            case "/":
                if (number2 == 0) return "error";
                else return Double.toString(number1 / number2);
        }
        return "error";
    }
}
