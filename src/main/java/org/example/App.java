package org.example;

import org.example.entity.Invoise;
import org.example.repository.InvoiseRepository;
import org.example.service.InvoiseService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Invoise invoise = new Invoise();
        InvoiseService invoiseService = new InvoiseService();

        System.out.println("what's a customer's name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        invoise.setCustomerName(name);

        invoiseService.createInvoise(invoise);




    }
}
