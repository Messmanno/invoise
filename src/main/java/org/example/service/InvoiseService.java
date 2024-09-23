package org.example.service;

import org.example.entity.Invoise;
import org.example.repository.InvoiseRepository;

public class InvoiseService {
    private static Long inc = 0L;
    private static final InvoiseRepository invoiseRepository = new InvoiseRepository();

    public void createInvoise(Invoise invoise){
       invoise.setNumber(String.valueOf( ++inc));
       invoiseRepository.createInvoise(invoise);
    }
}
