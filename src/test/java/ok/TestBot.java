package ok;

public class TestBot {
    private final String login;
    private final String password;
    private final String UsName;

    public TestBot(String login, String password, String name){
        this.login=login;
        this.password=password;
        this.UsName=name;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName(){
        return UsName;
    }

}
