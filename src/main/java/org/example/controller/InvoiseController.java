package org.example.controller;

import org.example.entity.Invoise;
import org.example.service.InvoiseService;
import org.example.service.InvoiseServiceInterface;

import java.util.Scanner;


public class InvoiseController {


    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    public void createInvoise(){
        Invoise invoise = new Invoise();
    System.out.println("what's a customer's name?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    invoise.setCustomerName(name);

    invoiseService.createInvoise(invoise);
    }

}
