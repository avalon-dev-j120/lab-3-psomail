public class Cpu {

    public Double sum(Double number1, Double number2){

        return 0.0;
    }

    public Double subtract(Double number1, Double number2){

        return 0.0;
    }

    public Double multiply(Double number1, Double number2){

        return 0.0;
    }

    public Double divide(Double number1, Double number2){  // добавить эксершн деления на ноль

        return 0.0;
    }

    public Double operation (Double number1, Double number2, String operation){

        switch (operation){

            case "+":
                return this.sum(number1, number2);

            case "-":
                return this.subtract(number1, number2);

            case "*":
                return this.multiply(number1, number2);

            case "/":
                return this.divide(number1, number2);

        }
        return 0.0; // доделать эксептион непподдерживаемой операции, допустим в виде error на дисплее калькулятора

    }

}
