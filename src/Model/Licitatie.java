/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author michael
 */
public class Licitatie {

    private static Licitatie licitatie = null;

    private Licitatie() {

    }

    public synchronized Licitatie getInstance() {
        if (licitatie == null) {
            licitatie = new Licitatie();
        }
        return licitatie;
    }
}
