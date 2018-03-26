/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip6;

/**
 *
 * @author monica
 */
public class Ip6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Licitatie lic = new Licitatie();
        
      //  Obiect tab1 = new Tablou('Artahoho',600, 2);
        //Obiect tab2 = new Tablou('lelel',10, 3);
        //Obiect sculpt1 = new Sculptura('MarianLaPlaja', 200, 10);
        
        Person client1 = new Client("Ivan","Monica","cenepe","nascuta","email@email.com",20);
        Person client2 = new Client("Cojo","Sefan","197etc","nu","email2@email.com",5);
        
        testPerson();
        System.out.println();
        System.out.println("TESTAM OBIECTUL");
        testObiect();
}
    
    public static void testObiect(){
        
        Proprietar prop1 = new Proprietar("Cojo","Sefan","197etc","nu","email2@email.com");

        Obiect ob = new Tablou("Artahoho",600, 2, "autor");
        Obiect ob2 = new Sculptura("super", 20, 1);
        
        ob.list();
    }
    
    public static void testPerson(){
        Client client1 = new Client("Ivan","Monica","cenepe","nascuta","email@email.com",20);
        Client client2 = new Client("Cojo","Sefan","197etc","nu","email2@email.com",5);
        Proprietar prop1 = new Proprietar("Cojo","Sefan","197etc","nu","email2@email.com");

        client1.setMoney(20);
        client2.setBirth("20-10-20");
        client1.list();
        System.out.println();
        client2.list();
        System.out.println();
        prop1.list();
        System.out.println();
        Obiect ob = new Tablou("Artahoho",600, 2, "autor");
        prop1.add(ob);
        prop1.getData("Artahoho");
    }
}