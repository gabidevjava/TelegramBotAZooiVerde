package azooiverdebot.guedes.com.br;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class AZooiverdeBotConfig extends TelegramLongPollingBot {
	
	private final String botName  = "Juninho Bot";
	private final String botToken = "792784760:AAFE_d8CfhFJDPztbPukfJ-TWuHW1u0eD9E";

	public String getBotUsername() {
		return botName;
	}

	public void onUpdateReceived(Update arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBotToken() {
		return botToken;
	}

}
