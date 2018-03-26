/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipobiect;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Proprietar extends Person{
    String Certificat;
    ArrayList<Obiect> Obiecte = new ArrayList<>();
    
    public void add(Obiect item){
        Obiecte.add(item);
    }
    public void getData(String nume){
        for(Obiect I : Obiecte){
            if(I.nume.equals(nume)){
                I.list();
            }
        }
        this.list();
        System.out.println("Certificat " + Certificat);
    }
    
    public void list(){
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Cnp: " + this.cnp);
        System.out.println("Date of birth:" + this.birth);
        System.out.println("Email: " + this.email);
    }
}
