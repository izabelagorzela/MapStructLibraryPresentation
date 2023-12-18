package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Book;
import gorzela.izabela.MapStructDemo.entities.basicMappings.BookDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookMapperTest {

    @Test
    void shouldMapBookToBookDto() {

        Book book = new Book();
        book.setTitle("Biografia Wisły");

        BookDto bookDto = BookMapper.INSTANCE.bookToBookDto(book);

        assertNull(book.getId(), "Book id should be null");
        assertNotNull(bookDto.getId());
        assertEquals(14, bookDto.getId());

        assertEquals(book.getTitle(), bookDto.getTitle());
    }
}