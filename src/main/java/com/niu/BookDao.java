package com.niu;

import com.niu.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ami on 2019/6/24.
 */
public interface BookDao extends MongoRepository<Book, Integer> {
    List<Book> findByAuthorContains(String author);

    Book findByNameEquals(String name);
}
