package azooiverdebot.guedes.com.br;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class AZooiverdeBotInitializer {
	
    public static void main( String[] args ) {
    	ApiContextInitializer.init();
    	 
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        
         try {
             telegramBotsApi.registerBot(new AZooiverdeBotConfig());
            
         } catch (TelegramApiException e) {
             e.printStackTrace();
         }
         
    }
}
