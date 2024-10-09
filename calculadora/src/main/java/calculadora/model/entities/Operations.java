package calculadora.model.entities;

/*
 * @created 09/10/2024 - 13:58
 * @project calculadora
 * @Aauthor Davy
 */public class Operations extends Numero{

    public Operations(double number, double result) {
        super(number, result);
    }

    public double sum(double number, double number2){
        return number + number2;
    }

    public double sub(double number, double number2){
        return number - number2;
    }

    public double mul(double number, double number2){
        return number * number2;
    }

    public double div(double number, double number2){
        return number / number2;
    }

    public double exp(double number){
        return Math.exp(number);
    }

    public double sqrt(double number){
        return Math.sqrt(number);
    }

    public double por(double number){
        return number/100;
    }
}
