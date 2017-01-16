package remi.dupuy.todolist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dupuyr on 16/01/2017.
 */
public class ListActivity {

    public List<String> getListTodo() {
        return listTodo;
    }

    public void setListTodo(List<String> listTodo) {
        this.listTodo = listTodo;
    }

    private List<String> listTodo;

    private static ListActivity ourInstance = new ListActivity();

    public static ListActivity getInstance() {
        return ourInstance;
    }

    private ListActivity() {
        listTodo = new ArrayList<String>();
    }
}
