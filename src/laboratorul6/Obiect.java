/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipobiect;

/**
 *
 * @author stefa
 */
public abstract class Obiect {
    String nume;
    int pretMinim;
    int vechime;

    public Obiect(String nume, int pretMinim, int vechime) {
        this.nume = nume;
        this.pretMinim = pretMinim;
        this.vechime = vechime;
    }
    
    public void list(){
        System.out.println("nume:" + nume);
        System.out.println("pretMinim " + pretMinim);
        System.out.println("vechime " + vechime);
    }

}
