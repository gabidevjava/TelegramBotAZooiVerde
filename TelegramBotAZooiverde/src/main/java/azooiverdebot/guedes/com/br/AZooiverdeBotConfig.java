package azooiverdebot.guedes.com.br;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class AZooiverdeBotConfig extends TelegramLongPollingBot {
	
	private final String botName  = "Juninho Bot";
	private final String botToken = "792784760:AAFE_d8CfhFJDPztbPukfJ-TWuHW1u0eD9E";

	public String getBotUsername() {
		return botName;
	}

	public void onUpdateReceived(Update update) {
		
		String command = update.getMessage().getText();
		SendMessage message = new SendMessage();
		
		if(command.equals("/start")) {
			message.setText("Muito bem vindo nessa poha " + update.getMessage().getFrom().getFirstName());
		}
		
		if(command.equals("/meunome@azooiverde_bot")) {
			System.out.println(update.getMessage().getFrom().getFirstName());
			message.setText("Mas que bosta de nome hein jovem, pqp " + update.getMessage().getFrom().getFirstName());
		}
		
		message.setChatId(update.getMessage().getChatId());
		
		try {
			execute(message);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String getBotToken() {
		return botToken;
	}

}
