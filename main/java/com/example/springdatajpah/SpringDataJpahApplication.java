package com.example.springdatajpah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringDataJpahApplication {

    private void insertFourEmployees(EmployeeRepository repository) {
        repository.save(new Employee("Dalia", "Abo Sheasha"));
        repository.save(new Employee("Trisha", "Gee"));
        repository.save(new Employee("Helen", "Scott"));
        repository.save(new Employee("Mala", "Gupta"));
        repository.save(new Employee("Eyal", "Rotem"));
    }

    private void insertOneClient (ClientRepository repository){
        repository.save(new Client("Frank",
                "Somko",
                "framk@gmail.com",
                "234243",
                "5757575",
                "Frank Address"));
        repository.save(new Client("Dodo",
                "Amsalem",
                "Dodo@gmail.com",
                "123455",
                "665556",
                "Dodo Address"));
    }

    /*
    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {

           // insertFourEmployees(repository);
            //System.out.println(repository.findAll());
            System.out.println( repository.findEmployeeByLastNameContaining("Rotem"));
        };
    }*/


    @Bean
    public CommandLineRunner run(ClientRepository repository) {
        return (args) -> {
            insertOneClient(repository);
            // insertFourEmployees(repository);
            System.out.println(repository.findAll());
            System.out.println( repository.findClientsByLastNameContaining("Amsalem"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpahApplication.class, args);
    }


}
