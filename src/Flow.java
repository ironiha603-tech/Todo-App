import java.util.Scanner;

public class Flow {
    private Scanner scan = new Scanner(System.in);
    private Todolist todolist = new Todolist();
    private Ui ui = new Ui();

    public void flowOfWhole(){
        while (true) {
            ui.userMenu();
            int command = scan.nextInt();
            if (command == 1) {
                ui.addTaskUi();
                String task = scan.next();
                todolist.addTodo(task);
            }

            else if (command == 2) {
                todolist.showTodo();
            }

            else if (command == 3) {
                ui.completeTaskUi();
                int index = scan.nextInt();
                todolist.completeTodo(index - 1);
            }

            else if (command == 4) {
                ui.exitAppUi();
                break;
            }

            else {
                ui.errorUi();
            }
        }
    }
}
