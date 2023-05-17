import java.util.Scanner;

public class HelloWorld {
public static void main(String[] args) {
    Scanner setUserId = new Scanner(System.in);
    Scanner setUserPass = new Scanner(System.in);

    try {
        System.out.println("IDを入力してください:");
        String userId = setUserId.nextLine();
        System.out.println("パスワードを入力してください:");
        String userPass = setUserPass.nextLine();
        SineIn sineIn = new SineIn(userId, userPass);
        sineIn.hello();
    } finally {
        setUserId.close();
        setUserPass.close();
    }
}
}
class SineIn {
    String id;
    String pass;

    SineIn(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public void hello() {
        System.out.println( id + "さんこんにちわ登録完了しました");
    }
}