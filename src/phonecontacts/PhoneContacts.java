/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = -1, b = 0, c, d, f;
        Contact e = new Contact ("a",1);
        String s;
        MobilePhone contactos = new MobilePhone ();
        do{
            System.out.println("Select an option");
            System.out.println("1. Print list of contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Update an existing contact");
            System.out.println("4. Remove contact");
            System.out.println("5. Search contact");
            System.out.println("0. Exit");
            do{    
                a = teclado.nextInt();
                if (a < -1 && a > 6){
                    System.out.println("Por favor introduce una pocion valida");
                }
            }while(a < -1 && a > 6);
            switch (a){
                case 0:
                    System.out.println("Saliendo del programa");
                    b = 1;
                    break;
                case 1:
                    System.out.println(contactos.toString());
                    break;
                case 2:
                    e = createContact();
                    if (contactos.addContact(e)){
                        System.out.println("El proceso se ha logrado exitosamente");
                    }else{
                        System.out.println("Ha habido un error en los datos");
                    }
                    break;
                case 3:
                    e = createContact();
                    if (contactos.modifyContact(e.getName(),e.getNumber())){
                        System.out.println("El proceso se ha logrado exitosamente");
                    }else{
                        System.out.println("No se han hallado coincidencias");
                    }
                    break;
                case 4:
                    s = obtainName();
                    if (contactos.removeContact(s)){
                        System.out.println("El proceso se ha logrado exitosamente");
                    }else{
                        System.out.println("No se han hallado coincidencias");
                    }
                    break;
                case 5:
                    s = obtainName();
                    if (!contactos.existance(s)){
                        System.out.println("Error");
                    }else{
                        System.out.println(contactos.getContact(s));
                    }
                    break;
                default:
                    System.out.println("Error, regresando al menu");
            }
        }while(b == 0);
    }
    
    public static Contact createContact (){
        String a;
        int b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        a = teclado.nextLine();
        Contact e = new Contact (a,1);
        System.out.println("Introduce el numero");
        b = teclado.nextInt();
        e.setNumber(b);
        return e;
    }
    
    public static String obtainName (){
        String a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        a = teclado.nextLine();
        return a;
    }
}