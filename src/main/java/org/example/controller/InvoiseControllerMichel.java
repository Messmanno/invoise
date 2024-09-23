package org.example.controller;

import org.example.entity.Invoise;
import org.example.service.InvoiseService;
import org.example.service.InvoiseServiceInterface;
import org.example.service.InvoiseServiceMichel;

public class InvoiseControllerMichel {

    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    Invoise invoise = new Invoise();

    public void createInvoiceWebForm(){

        String name = "Tesla";
        invoise.setCustomerName(name);

        invoiseService.createInvoise(invoise);
    }

}
