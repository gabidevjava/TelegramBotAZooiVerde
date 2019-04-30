package azooiverdebot.guedes.com.br;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class AZooiverdeBotConfig extends TelegramLongPollingBot {
	
	private final String botName  = "Juninho Bot";
	private final String botToken = "792784760:AAFE_d8CfhFJDPztbPukfJ-TWuHW1u0eD9E";
	public static final String CHATID_FIELD = "chat_id";
	public static final String DISABLEWEBPAGEPREVIEW_FIELD = "disable_web_page_preview";
	public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
	public static final String REPLYMARKUP_FIELD = "reply_markup";
	private static Integer chatId;
    private static Boolean disableWebPagePreview; 
    private static Integer replyToMessageId; 
    

	public String getBotUsername() {
		return botName;
	}

	public void onUpdateReceived(Update update) {
		
		String command = update.getMessage().getText();
		SendMessage message = new SendMessage();
		
		SendPhoto photo = new SendPhoto();
		
		if(command.equals("/start")) {
			message.setChatId(CHATID_FIELD);
			message.setText("Muito bem vindo jovem " + update.getMessage().getFrom().getFirstName());
		}
		
		if(command.equals("/meunome")) {
			System.out.println(update.getMessage().getFrom().getFirstName());
			message.setText("Ótimo nome " + update.getMessage().getFrom().getFirstName());
		}
		
		if(command.equals("/nudes")) {
			message.setText("Enviando, por favor aguarde Srº " + update.getMessage().getFrom().getFirstName());
	
		}
		
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
