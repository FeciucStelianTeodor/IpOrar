/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip;

/**
 *
 * @author Marian
 */
public class Sculptura extends Obiect{
    private String autor;
    
    public Sculptura(String Nume,String Autor, int PretMinim, int Vechime){
        this.nume = Nume;
        this.autor = Autor;
        this.pretMinim = PretMinim;
        this.vechime = Vechime;
    }
    
    public void setAutor(String aut){
        this.autor = aut;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
}
