package remi.dupuy.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;



import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by dupuyr on 16/01/2017.
 */
public class TodoActivity extends Activity{

    private Button btnValider;
    private Button btnDisplay;
    private EditText input;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        btnValider = (Button)findViewById(R.id.btnValider);
        input = (EditText)findViewById(R.id.editText);

        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListActivity.getInstance().getListTodo().add(input.getText().toString());
            }
        });

        btnDisplay = (Button)findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), AddTaskActivity.class);
                startActivity(myIntent);
            }
        });


    }


}
