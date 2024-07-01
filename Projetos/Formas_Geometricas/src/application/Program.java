package Projeto3.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Projeto3.entities.Circle;
import Projeto3.entities.Rectangle;
import Projeto3.entities.Shape;
import Projeto3.enums.Color;

public class Program {

    public Program() {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Shape> s = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data: \n", i + 1);
            System.out.print("Rectangle or circle (r/c)? ");
            char answer = in.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(in.next());
            if (answer == 'r') {
                System.out.print("Width: ");
                double width = in.nextDouble();
                System.out.print("Height: ");
                double height = in.nextDouble();
                s.add(new Rectangle(color, width, height));
            } 
            else {
                System.out.print("Radius: ");
                double radius = in.nextDouble();
                s.add(new Circle(color, radius));
            }
        }

        System.out.println();
            System.out.println("SHAPE AREAS: ");
            for(Shape sh : s) {
                System.out.println(String.format("%.2f", sh.area()));
            }
        in.close();
    }

    public static void main(String[] args) {
        new Program();
    }
}
