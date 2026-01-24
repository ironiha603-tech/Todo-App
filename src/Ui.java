public class Ui {

    public void userMenu(){
        System.out.println("===========メニュー===========");
        System.out.println("1. タスクの追加");
        System.out.println("2. タスクの一覧表示");
        System.out.println("3. タスクの完了");
        System.out.println("4. システム終了");
        System.out.print("コマンド入力中...");
    }

    public void addTaskUi(){
        System.out.println("タスクを入力してください...");
    }

    public void completeTaskUi(){
        System.out.println("タスクの番号を入力...");
    }

    public void exitAppUi(){
        System.out.println("システムが正常に終了しました");
    }

    public void errorUi(){
        System.out.println("エラー: 存在しないコマンドです");
    }
}
