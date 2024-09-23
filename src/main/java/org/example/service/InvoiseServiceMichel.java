package org.example.service;

import org.example.entity.Invoise;
import org.example.repository.InvoiseRepository;
import org.example.repository.InvoiseRepositoryInterface;

public class InvoiseServiceMichel implements InvoiseServiceInterface {
    private static Long inc = 112L;
    private InvoiseRepositoryInterface invoiseRepository;

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    public void createInvoise(Invoise invoise){
       invoise.setNumber("INV_" + (++inc));
       invoiseRepository.createInvoise(invoise);
    }
}
