/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iporar;

/**
 *
 * @author Catalin
 */
//client is the person who bids
public class Client extends Person {
    private int money;
    
    public Client(String firstName, String lastName, String cnp, String birth, String email, int money) {
        super(firstName, lastName, cnp, birth, email);
        this.money = money;
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }
    
    
}
