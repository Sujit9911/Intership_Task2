package controller;

import service.ApiService;
import java.util.Scanner;

// controller layer
public class ApiController {

    ApiService service = new ApiService();
    Scanner sc = new Scanner(System.in);

    // method to take user input
    public void fetchData() {

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        service.getAgeData(name);
    }
}
