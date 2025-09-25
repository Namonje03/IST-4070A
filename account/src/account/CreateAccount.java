/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Esther Namonje
 */
public class CreateAccount {
    public static void main(String[] args) {
        Account emmaAccount = new Account();

        // Assign values directly
        emmaAccount.accountNo = 1299;
        emmaAccount.accountName = "Emma";
        emmaAccount.balance = 500;

        // Print details
        System.out.println("A/C no: " + emmaAccount.accountNo +
                           ", A/C name: " + emmaAccount.accountName +
                           ", Balance: " + emmaAccount.balance);
    }
}

   
