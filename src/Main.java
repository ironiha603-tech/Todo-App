//実行前にcmdでchcp 65001と入力、これで文字化けが治る

import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Todolist todolist = new Todolist();
        while (true) {
            System.out.println("===========メニュー===========");
            System.out.println("1. タスクの追加");
            System.out.println("2. タスクの一覧表示");
            System.out.println("3. タスクの完了");
            System.out.println("4. システム終了");
            System.out.print("コマンド入力中...");
            int todo = scan.nextInt();

            if (todo == 1) {
                System.out.println("タスクを入力してください...");
                String task = scan.next();
                todolist.addTodo(task);
            }

            else if (todo == 2) {
                todolist.showTodo();
            }

            else if (todo == 3) {
                System.out.println("タスクの番号を入力...");
                int index = scan.nextInt();
                todolist.completeTodo(index - 1);
            }

            else if (todo == 4) {
                System.out.println("システムが正常に終了しました");
                break;
            }

            else {
                System.out.println("エラー: 存在しないコマンドです");
            }
        }
    }
}
