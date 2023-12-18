package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Message;
import gorzela.izabela.MapStructDemo.entities.basicMappings.MessageDto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MessageMapperTest {

    @Test
    void shouldUpdateMessageDtoFromMessage() {

        Message message = new Message();
        message.setTitle("New regulations");
        message.setSenderName("Forenc");
        message.setRecipientName("All");

        MessageDto messageDto = new MessageDto();
        messageDto.setTitle("Old regulations");
        messageDto.setSenderName("Forenc");
        messageDto.setRecipientName("McCartner");

        MessageMapper.INSTANCE.updateMessageDtoFromMassage(message, messageDto);

        assertEquals(message.getTitle(), messageDto.getTitle());
        assertEquals(message.getSenderName(), messageDto.getSenderName());
        assertEquals(message.getRecipientName(), messageDto.getRecipientName());

    }
}