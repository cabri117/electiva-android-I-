package practica.android.com.ve.electiva;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import static android.widget.TabHost.*;

/**
 * Created by dcabr_000 on 10/13/2014.
 */
public class HelloTabWidget extends TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, ArtistsActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("artists").setIndicator("Artists",
                res.getDrawable(R.drawable.ic_tab_artists))
                .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, ArtistsActivity.class);
        spec = tabHost.newTabSpec("albums").setIndicator("Albums",
                res.getDrawable(R.drawable.ic_tab_artists))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ElectivaActivity.class);
        spec = tabHost.newTabSpec("songs").setIndicator("Songs",
                res.getDrawable(R.drawable.ic_tab_artists))
                .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(2);
    }
}
