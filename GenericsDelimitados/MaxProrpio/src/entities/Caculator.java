/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Davede faiska
 */
public class Caculator implements Comparable<Caculator>{
    
    private Double number;

    public Caculator(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number = " + number;
    }

    @Override
    public int compareTo(Caculator o) {
        return number.compareTo(o.getNumber());
    }
    
    
    
}
