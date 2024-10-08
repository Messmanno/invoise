package org.example.service;

import org.example.entity.Invoise;
import org.example.repository.InvoiseRepository;
import org.example.repository.InvoiseRepositoryInterface;

public class InvoiseService  implements  InvoiseServiceInterface{
    private static Long inc = 0L;
    private InvoiseRepositoryInterface invoiseRepository;

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    public void createInvoise(Invoise invoise){
       invoise.setNumber(String.valueOf( ++inc));
       invoiseRepository.createInvoise(invoise);
    }
}
