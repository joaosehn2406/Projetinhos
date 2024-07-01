package Projeto4.entities;

public class Company extends TaxPayer{
    
    private Integer workersNumber;

    public Company() {
        super();
    }

    public Company(String name, Double income, Integer workersNumber) {
        super(name, income);
        this.workersNumber = workersNumber;
    }

    public Integer getWorkersNumber() {
        return workersNumber;
    }

    public void setWorkersNumber(Integer workersNumber) {
        this.workersNumber = workersNumber;
    }

    @Override
    public double taxes() {
        if (workersNumber > 10) {
            income -= income * 0.86;
        } 
        else {
            income -= income * 0.84;
        }
        return income;
    }

    
}
