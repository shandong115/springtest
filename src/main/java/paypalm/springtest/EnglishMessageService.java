package paypalm.springtest;
import org.springframework.stereotype.Component;

@Component("english")
public class EnglishMessageService implements MessageService {
	public String getMessage() {
		return "reture english message";
	}
}
