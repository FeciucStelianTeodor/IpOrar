/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author michael
 */
public class Licitatie {

    private static Licitatie licitatie = null;
    private List<Obiect> obiecte;
    private int currentObiect;

    private Licitatie() {
        this.obiecte = new LinkedList<>();
    }

    public synchronized Licitatie getInstance() {
        if (licitatie == null) {
            licitatie = new Licitatie();
        }
        return licitatie;
    }

    public void addObiect(Obiect obiect) {
        obiecte.add(obiect);
    }

    public Obiect getCurrentBiddingObiect() {
        return this.obiecte.indexOf(currentObiect);
    }
}
