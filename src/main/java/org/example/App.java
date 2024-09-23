package org.example;

import org.example.controller.InvoiseController;
import org.example.controller.InvoiseControllerMichel;
import org.example.entity.Invoise;
import org.example.repository.InvoiseRepository;
import org.example.service.InvoiseService;
import org.example.service.InvoiseServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InvoiseControllerMichel invoiseControllerMichel = new InvoiseControllerMichel();
        InvoiseController invoiseController = new InvoiseController();
        Scanner sc = new Scanner(System.in);


        System.out.println("what's configuration do you want to use?");
        int config = sc.nextInt();

        if(config == 1){
            InvoiseService invoiseService = new InvoiseService();
            invoiseController.setInvoiseService(invoiseService);
            InvoiseRepository invoiseRepository = new InvoiseRepository();
            invoiseService.setInvoiseRepository(invoiseRepository);
            invoiseController.createInvoise();
        }else if(config == 2){
            InvoiseServiceMichel invoiseServiceMichel = new InvoiseServiceMichel();
            invoiseControllerMichel.setInvoiseService(invoiseServiceMichel);
        invoiseControllerMichel.createInvoiceWebForm();
        }




    }
}
