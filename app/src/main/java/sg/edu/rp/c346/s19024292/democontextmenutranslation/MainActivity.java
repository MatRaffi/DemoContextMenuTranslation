package sg.edu.rp.c346.s19024292.democontextmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tv);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0,0, "English" );
        menu.add(0, 1, 1, "Italian");

    }
    @Override
    public boolean onContextItemSelected (@NonNull MenuItem item){
        if(item.getItemId()==0){
            Toast.makeText(MainActivity.this , "English it is", Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }
}
