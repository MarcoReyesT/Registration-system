/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class RegistrationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int cantidad = Integer.parseInt(in.nextLine());
        Map <String, Integer> dataBase = new HashMap<String, Integer>();
        String user;
        for (int i = 0; i < cantidad; i++) {
            user = in.nextLine();
            if (dataBase.get(user) == null) {
                dataBase.put(user, 0);
                System.out.println("OK");
            }
            else{
                dataBase.put(user, dataBase.get(user) + 1);
                dataBase.put(user + dataBase.get(user), 1);
                System.out.println(user + dataBase.get(user));
            }
            
        }
    }
    
}
