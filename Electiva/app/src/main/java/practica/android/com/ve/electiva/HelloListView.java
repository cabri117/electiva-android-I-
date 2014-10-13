package practica.android.com.ve.electiva;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dcabr_000 on 10/13/2014.
 */
public class HelloListView extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] countries = getResources().getStringArray(R.array.countries_array);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_listview, countries));

        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
