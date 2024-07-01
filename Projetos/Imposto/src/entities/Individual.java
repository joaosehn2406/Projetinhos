package Projeto4.entities;

public class Individual extends TaxPayer{
    
    private Double medicalExpenses;

    public Individual(){
        super();
    }

    public Individual(String name, Double income, Double medicalExpenses) {
        super(name, income);
        this.medicalExpenses = medicalExpenses;
    }

    @Override
    public double taxes() {
        if(income < 20000) {
            income -= income * 0.85;
            if (medicalExpenses != 0) {
                income -= medicalExpenses * 0.5; 
            } 
        } 
        else {
            income -= income * 0.75;
            if (medicalExpenses != 0) {
                income -= medicalExpenses * 0.5;
            }
        }
        return income;
    }
}
