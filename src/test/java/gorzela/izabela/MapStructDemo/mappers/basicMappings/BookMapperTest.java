package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case1.d.Book;
import gorzela.izabela.MapStructDemo.basicMappings.case1.d.BookDto;
import gorzela.izabela.MapStructDemo.basicMappings.case1.d.BookMapper;
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