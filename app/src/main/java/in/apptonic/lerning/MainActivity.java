package in.apptonic.lerning;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.myListView);
        listView.setAdapter(new MyCustomAdapter(this));

        names = new ArrayList<>();
        names.add("Amar");
        names.add("Gopal");
        names.add("Suman");
        names.add("Utpal");

    }

    private class MyCustomAdapter extends BaseAdapter {

        public MyCustomAdapter(Context context){}


        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int i) {

       //     View view = getView();


            return "test string";
        }

        @Override
        public long getItemId(int i) {

            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            TextView textviewItem = new TextView(getApplicationContext());
            textviewItem.setText("Here is my Row for TextView");
            return textviewItem;
        }
    }

}
