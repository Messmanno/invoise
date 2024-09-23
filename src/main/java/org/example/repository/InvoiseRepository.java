package org.example.repository;

import org.example.entity.Invoise;

import java.util.ArrayList;
import java.util.List;

public class InvoiseRepository {

    List<Invoise> invoiseList = new ArrayList<>();

    public void createInvoise(Invoise invoise) {
        invoiseList.add(invoise);
        System.out.println("invoise number " + invoise.getNumber() + " for Mister " + invoise.getCustomerName());
    }
}
