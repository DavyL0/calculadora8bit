package calculadora.model.entities;

/*
 * @created 09/10/2024 - 13:57
 * @project calculadora
 * @Aauthor Davy
 */public class Numero {
     private double number;
     private double result;

    public Numero(double number, double result) {
        this.number = number;
        this.result = result;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
