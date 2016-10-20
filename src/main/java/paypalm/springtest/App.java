package paypalm.springtest;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class App 
{
    @Bean(name="mock")
    MessageService mockMessageService() {
    	return new ChineseMessageService();
    }
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
		          new AnnotationConfigApplicationContext(App.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();     
    }
}
