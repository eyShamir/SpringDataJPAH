package com.example.springdatajpah;


import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findClientsByLastNameContaining (String str);
}


