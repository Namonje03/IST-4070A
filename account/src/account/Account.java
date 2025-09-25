/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;

/**
 *
 * @author Esther Namonje
 */
public class Account {
    public int accountNo;
    public String accountName;
    public double balance;

    
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
}
