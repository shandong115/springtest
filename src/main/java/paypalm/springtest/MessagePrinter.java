package paypalm.springtest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
	
	@Resource(name="english")
    private MessageService service;

    
//    public MessagePrinter(MessageService service) {
//        this.service = service;
//    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
