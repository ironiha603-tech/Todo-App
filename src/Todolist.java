import java.util.ArrayList;

public class Todolist {
    private ArrayList<Todo> todolist = new ArrayList<Todo>();

    public void addTodo(String title){
        Todo todo = new Todo();
        todo.setTitle(title);
        todolist.add(todo);
        System.out.println("タスクを追加しました" + " タスク名: " + title);
    }

    public void showTodo(){
        for(int i = 0; i < todolist.size(); i++){
            Todo todo = todolist.get(i);
            System.out.println(i + 1 + ". タスク名: " + todo.getTitle() + " 状態: " + (todo.getIsCompleted() ? "完了" : "未完了"));
        }
    }

    public void completeTodo(int index){
        if (index >= 0 && index < todolist.size()) {
            Todo todo = todolist.get(index);
            todo.setIsCompleted();   
        }

        else {
            System.out.println("エラー: 存在しないタスクです");
        }
    }
}
