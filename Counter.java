/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedexample;

/**
 *
 * @author student
 */
class Counter {
private int count = 0;

    void increment() {
        count++;

       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getCount() {
        return count;
    }

}
