/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

/**
 *
 * @author osiri
 */
public class Contact {
    //atributos
    private String name;
    private int number;

    //constructor
    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //metodos
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString (){
        return "(Contact name = "+this.name+", number = "+this.number+")";
    }
}