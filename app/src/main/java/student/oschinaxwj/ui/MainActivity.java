package student.oschinaxwj.ui;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import student.oschinaxwj.R;
import student.oschinaxwj.widget.MyFragmentTabHost;

public class MainActivity extends ActionBarActivity implements TabHost.OnTabChangeListener {
    private MyFragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (MyFragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        if (Build.VERSION.SDK_INT >= 11) {
            mTabHost.getTabWidget().setShowDividers(0);
        }
        initTabs();
        mTabHost.setCurrentTab(0);
        mTabHost.setOnTabChangedListener(this);
    }

    private void initTabs() {
        MainTab[] tabs = MainTab.values();
        final int size = tabs.length;
        for (int i = 0; i < size; i++) {
            MainTab mainTab = tabs[i];
            TabHost.TabSpec tab = mTabHost.newTabSpec(getString(mainTab.getResName()));
            View indicator = LayoutInflater.from(getApplicationContext())
                    .inflate(R.layout.tab_indicator, null);
            TextView title = (TextView) indicator.findViewById(R.id.tab_title);
            Drawable drawable = this.getResources().getDrawable(mainTab.getResIcon());
            title.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            if (i == 2) {
                indicator.setVisibility(View.INVISIBLE);
                mTabHost.setNoTabChangedTag(getString(mainTab.getResName()));
            }
            title.setText(getString(mainTab.getResName()));
            tab.setIndicator(indicator);
            tab.setContent(new TabHost.TabContentFactory() {
                @Override
                public View createTabContent(String tag) {
                    return new View(MainActivity.this);
                }
            });
            mTabHost.addTab(tab, mainTab.getClz(), null);
        }
    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public void onTabChanged(String tabId) {
        int size = mTabHost.getTabWidget().getTabCount();
        for (int i = 0; i < size; i++) {
            View view = mTabHost.getTabWidget().getChildAt(i);
            if (i == mTabHost.getCurrentTab()) {
                view.setSelected(true);
            } else {
                view.setSelected(false);
            }
        }
    }
}
