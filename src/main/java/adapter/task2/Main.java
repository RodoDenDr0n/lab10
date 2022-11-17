package adapter.task2;

import java.time.LocalDate;

public class Main {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClientWrapper(new TwitterUser("dobosevych@gmail.com", "Ukraine", "2021-11-11"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClientWrapper(new FacebookUser("dobosevych@gmail.com", Country.Ukraine, LocalDate.of(2021, 1, 1)));
        }
        return null;
    }
}
