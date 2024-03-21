package com.example.application.data;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DatabaseInitializer implements ApplicationRunner {

    private final ContactRepository repo;

    public DatabaseInitializer(ContactRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] firstNames = {
                "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
                "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica",
                "Thomas", "Sarah", "Charles", "Karen"
        };
        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
                "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin",
                "Thompson", "Garcia", "Martinez", "Robinson"
        };

        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
            String phone = String.format("%03d-%03d-%04d",
                    random.nextInt(1000), random.nextInt(1000), random.nextInt(10000));

            repo.save(new Contact(firstName + " " + lastName, email, phone));
        }
    }
}
