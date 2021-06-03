package sg.edu.rp.c346.id20011806.l07demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] arrayExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);
        arrayExamTips = new String[5];
        arrayExamTips[0] = "Don't just read the code, code it as much as possible during each practical session";
        arrayExamTips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        arrayExamTips[2] = "Prepare your template source code for each topic";
        arrayExamTips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        arrayExamTips[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayExamTips);
        lvExamTips.setAdapter(adapter);


    }
}