/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coringasdelimitados;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Davede faiska
 */
public class CoringasDelimitados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));
        
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new  Circle(2.0));
        myCircles.add(new Circle(3.0));
        
        System.out.println("Total area: " + totalArea(myCircles));
    }
    
    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
        
        
    }
    
}
