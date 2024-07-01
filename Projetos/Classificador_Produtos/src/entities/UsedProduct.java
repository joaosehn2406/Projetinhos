package Projeto2.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    Date manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public final String priceTag(String name, double price) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.priceTag(name + " (used)", price) + " (Manufactored date: " + sdf.format(manufacturedDate) + ")";
    }
}
