/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP6;

/**
 *
 * @author monica
 */
public class Tablou extends Ipobiect{
    
    String autor;
    
    public Tablou(String nume, int pretMinim, int vechime){
        super(nume, pretMinim, vechime);
    }
    
    public Tablou(String nume, int pretMinim, int vechime, String autor){
        super(nume, pretMinim, vechime);
        this.autor = autor;
    }
    
    public void setAuthor(String autor){
        this.autor = autor;
    } 
}
