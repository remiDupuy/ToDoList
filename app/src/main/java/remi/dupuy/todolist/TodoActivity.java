package remi.dupuy.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by dupuyr on 16/01/2017.
 */
public class TodoActivity extends Activity{

    private Button btnValider;
    private Button btnViderListe;
    private EditText input;
    private ListView listView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        btnValider = (Button)findViewById(R.id.btnValider);

        input = (EditText)findViewById(R.id.editText);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,ListActivity.getInstance().getListTodo()));
        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListActivity.getInstance().getListTodo().add(input.getText().toString());
                listView.setAdapter(new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,ListActivity.getInstance().getListTodo()));
            }
        });


        btnViderListe = (Button) findViewById(R.id.btnViderListe);
    }


}
