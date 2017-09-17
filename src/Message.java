import java.io.Serializable;

public class Message implements Serializable{

    private String name;
    private String msg;

    public Message (String name, String  msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }
}
