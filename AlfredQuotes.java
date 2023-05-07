import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    public String basicGreeting(){
        return "Hello,lovely to see you. How are you?";
    }
    public String guestGreeting(String name){
        return String.format("Hello %s,lovely to see you. How are you?",name);
    }
    public String guestGreeting(String firstName,String lastName){
        return String.format("Hello %s %s,lovely to see you. How are you?",firstName,lastName);
    }
    public String dateAnnouncement(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd HH:mm:ss zz yyyy");
        formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String formatted = formatter.format(date);
        return String.format("It is currently %s",formatted);
    }
    public String responseBeforeAlexis(String sentence){
        String response;
        if (sentence.toLowerCase().contains("alexis")){
            response = "Right away, sir.  She certainly isn't sophisticated enough for that.";
        } else if(sentence.toLowerCase().contains("alfred")){
            response = "At your service.  As you wish, naturally.";
        } else {
            response = "Right.  And with that, I shall retire.";
        }
        return response;
    }
}
