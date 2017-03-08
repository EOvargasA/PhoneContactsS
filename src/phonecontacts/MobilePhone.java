/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.ArrayList;
/**
 *
 * @author Osiris
 */
public class MobilePhone {
    //atributos
    private ArrayList<Contact> contacts = new ArrayList<> ();
    
    //constructor
    public MobilePhone (){
    }
    
    //metodos
    public boolean addContact (Contact contact){
        if (this.contacts.contains(contact)){
            return false;
        }else{
            this.contacts.add(contact);
            return true;
        }
    }
    
    public boolean removeContact (String name){
        if (existance(name)){
            this.contacts.remove(obtainPosition(name));
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modifyContact (String name, int number){
        if (existance(name)){
            this.contacts.get(obtainPosition(name)).setNumber(number);
            return true;
        }else{
            return false;
        }
    }
    
    public String getContact (String name){
        if (existance(name)){
            return this.contacts.get(obtainPosition(name)).toString();
        }else{
            return "";
        }
    }
    
    private int obtainPosition (String name){
        for(int a = 0; a < this.contacts.size(); a++){
            if (this.contacts.get(a).getName().equals(name)){
                return a;
            }
        }
        return -1;
    }
    
    public boolean existance (String name){
        for(int a = 0; a < this.contacts.size(); a++){
            if (this.contacts.get(a).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString (){
        String b = "";
        for (int a = 0; a < this.contacts.size(); a++){
            if (a == 0){
                b = this.contacts.get(a).toString();
            }else{
                b = b+", "+this.contacts.get(a).toString();
            }
        }
        return "Contacts = ("+b+")";
    }
}
