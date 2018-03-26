/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */

//complexitate ciclomatica 3
public class Proprietar extends Person{
    String Certificat;
    ArrayList<Obiect> Obiecte = new ArrayList<>();
    
    
    public Proprietar(String a, String b, String c, String d, String e){
        super(a,b,c,d,e);
    }
    public Proprietar(String a, String b, String c, String d, String e, String cert){
        super(a,b,c,d,e);
        this.Certificat = cert;
    }
    
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
    
    
}
