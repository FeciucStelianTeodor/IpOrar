/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorul6;

/**
 *
 * @author Marian
 */
public class Sculptura extends Obiect{
    private String Autor;
    
    public void setVechime(int varsta){
        this.Vechime = varsta;
    }
    @override
    public void setNume(String num){
        this.Nume = num;
    }
    
    public void setAutor(String aut){
        this.Autor = aut;
    }
    @override
    public String getNume(){
        return this.Nume;
    }
    
    public String getAutor(){
        return this.Autor;
    }
    @override
    public Number getVechime(){
        return this.Vechime;
    }
}
