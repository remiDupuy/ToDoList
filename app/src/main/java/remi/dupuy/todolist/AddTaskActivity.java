package remi.dupuy.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

/**
 * Created by dupuyr on 16/01/2017.
 */
public class AddTaskActivity extends Activity {
    private ListView listview;
    private Button btnBack;
    private Button btnVider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        btnBack = (Button)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), TodoActivity.class);
                startActivity(myIntent);
            }
        });

        btnVider = (Button)findViewById(R.id.btnVider);
        btnVider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListActivity.getInstance().getListTodo().clear();
                listview.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.listviewcustom,ListActivity.getInstance().getListTodo()));

            }
        });

        listview = (ListView)findViewById(R.id.listView);
        listview.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.listviewcustom,ListActivity.getInstance().getListTodo()));
    }
}


