public class Todo {
    private String title;
    private boolean isCompleted;

    public String getTitle(){
        return this.title;
    }

    public boolean getIsCompleted(){
        return this.isCompleted;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIsCompleted(){
        this.isCompleted = true;
    }
}
