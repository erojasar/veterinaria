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
public class Dog extends Pet implements ILicensable {
    
    protected License license;

    public Dog(License license, String name) {
        super(name);
        this.license = license;
    }
    
    @Override
    public void speak() {
        System.out.println("yo ladro");
    }

    @Override
    public License getLicense() {
        return this.license;
    }
    
}
