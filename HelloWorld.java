import java.util.HashMap;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        SineIn signIm = new SineIn(map);
        signIm.hello();
    
    }
}

class SineIn {
    String id;
    
    SineIn(HashMap<String, String> map) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("IDを入力してください:");
            String userId = scanner.nextLine();
            id = userId;
            System.out.println("パスワードを入力してください:");
            String userPass = scanner.nextLine();
            map.put(userId, userPass);
        } finally {
            scanner.close();
        }
    }
    public void hello() {
        System.out.println(id + "さん登録完了しました");
    }
}
// class LogIn {
//     String id;
//     String pass;
    
//     LigIn(HashMap<String, String> map) {
//         Scanner scanner = new Scanner(System.in);


//         try {
//             System.out.println("IDを入力してください:");
//             String userId = scanner.nextLine();
//             id = userId;
//             System.out.println("パスワードを入力してください:");
//             String userPass = scanner.nextLine();
//         } finally {
//             scanner.close();
//         }
//     }
//     public void hello() {
//         System.out.println(id + "さんログイン完了しました");
//     }
// }