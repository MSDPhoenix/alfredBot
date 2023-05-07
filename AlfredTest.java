public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String basicGreeting = alfredBot.basicGreeting();
        String guestGreeting = alfredBot.guestGreeting("Beth Kane");
        String guestGreeting2 = alfredBot.guestGreeting("Inigo","Montoya");
        String dateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.responseBeforeAlexis(
            "Alexis! Play some lo-fi beats."
        );
        String alfredTest = alfredBot.responseBeforeAlexis(
            "I can't find my yo-yo.  Maybe Alfred will know where it is."
        );
        String notRelevantTest = alfredBot.responseBeforeAlexis(
            "Maybe that's what Batman is about.  Not winning.  But failing..."
        );
        System.out.println(basicGreeting);
        System.out.println(guestGreeting);
        System.out.println(guestGreeting2);
        System.out.println(dateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}