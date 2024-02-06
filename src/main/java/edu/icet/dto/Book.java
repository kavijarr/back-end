package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private int qty;
}
