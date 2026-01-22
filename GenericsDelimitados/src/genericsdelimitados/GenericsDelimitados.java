/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericsdelimitados;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import services.CalculationService;

/**
 *
 * @author Davede faiska
 */
public class GenericsDelimitados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Product> list = new ArrayList<>();
        
        String path = "C:\\temp\\in.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(", ");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            
            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);
                       
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
                
    }
    
}
