/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author erojasar
 */
public class Retriever extends Dog{
    
    public Retriever(License license, String name) {
        super(license, name);
    }
    
    public Bird retrieve(){
        Bird ave = new Bird();
        return ave;
    }
}
