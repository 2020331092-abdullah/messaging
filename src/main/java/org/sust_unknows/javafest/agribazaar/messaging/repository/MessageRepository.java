package org.sust_unknows.javafest.agribazaar.messaging.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.sust_unknows.javafest.agribazaar.messaging.model.Message;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByChatId(String chatId);
}
