/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.List;

/**
 *
 * @author Davede faiska
 */
public class MediaUtil {
    
    public static <T extends Number> double calcularMedia(List<T> valores){
        if(valores.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        
        Double sum = 0.0;
        
        for (int i = 0; i < valores.size(); i++) {
            sum += valores.get(i).doubleValue();                   
        }
        return sum/valores.size();
    }
    
}
