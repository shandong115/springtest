package paypalm.springtest;

import org.springframework.stereotype.Component;

@Component("chinese")
public class ChineseMessageService implements MessageService {

	public String getMessage() {
		return "中文";
	}
}
