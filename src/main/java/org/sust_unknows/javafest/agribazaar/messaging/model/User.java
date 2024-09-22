package org.sust_unknows.javafest.agribazaar.messaging.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Document(collection = "users")
public class User {
    private String id;
    private String name;
    private String avatar;
    private String type; // 'farmer' or 'buyer'
    private List<String> chatIds; // List of chat IDs the user is involved in
    // Getters and Setters
}
