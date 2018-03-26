/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import laboratorul6.*;

/**
 *
 * @author stefa
 */
public  class Obiect implements IListable{
    String nume;
    int pretMinim;
    int vechime;

    public Obiect(String nume, int pretMinim, int vechime) {
        this.nume = nume;
        this.pretMinim = pretMinim;
        this.vechime = vechime;
    }
    
    @Override
    public void list(){
        System.out.println("nume:" + nume);
        System.out.println("pretMinim " + pretMinim);
        System.out.println("vechime " + vechime);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPretMinim() {
        return pretMinim;
    }

    public void setPretMinim(int pretMinim) {
        this.pretMinim = pretMinim;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
    
    

}
