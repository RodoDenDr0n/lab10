package adapter.task3;

public class Database extends БазаДаних {

    public String retrieveUserData() {
        return отриматиДаніКористувача();
    }

    public String retrieveStaticData() {
        return отриматиСтатистичніДані();
    }
}
