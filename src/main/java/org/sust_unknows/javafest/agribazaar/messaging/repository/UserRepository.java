package org.sust_unknows.javafest.agribazaar.messaging.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.sust_unknows.javafest.agribazaar.messaging.model.User;

//import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    // Custom query methods can be added here if needed
}
