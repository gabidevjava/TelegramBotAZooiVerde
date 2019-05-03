package config;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class AZooiverdeBotConfig extends TelegramLongPollingBot {
	
	private final String botName  = "Juninho Bot";
	private final String botToken = "792784760:AAFE_d8CfhFJDPztbPukfJ-TWuHW1u0eD9E";
	
	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		
	}
	
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return botName;
	}
	
	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return botToken;
	}
	
}
