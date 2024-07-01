package Projeto2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Projeto2.entities.ImportedProduct;
import Projeto2.entities.Product;
import Projeto2.entities.UsedProduct;

public class Program {
    
    public Program() throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = in.nextInt();

        List<Product> pr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.printf("Product #%d data: \n", i + 1);
            System.out.print("Commum, used or imported (c/u/i)? ");
            String type = in.next().toLowerCase();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Price: ");
            double price = in.nextDouble();
            if (type.equals("c")) {
                pr.add(new Product(name, price));
            } else if (type.equals("i")) {
                System.out.print("Customs fee: ");
                double cf = in.nextDouble();
                pr.add(new ImportedProduct(name, price, cf));
            } else {
                System.out.print("Date (DD/MM/YYYY): ");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String data = in.next();
                Date date  = sdf.parse(data);
                pr.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println("PRODUCTS: ");
        for(Product p : pr) {
           System.out.println(p.priceTag(p.getName(), p.getPrice()));
        }

        in.close();
    }


    public static void main(String[] args) throws ParseException {
        new Program();
    }
}
