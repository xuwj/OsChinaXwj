package student.oschinaxwj.widget;

import android.content.Context;
import android.support.v4.app.FragmentTabHost;
import android.util.AttributeSet;

/**
 * Created by user on 2015/6/8.
 */
public class MyFragmentTabHost extends FragmentTabHost {
    private String mCurrentTag;
    private String mNoTabChangedTag;

    public MyFragmentTabHost(Context context) {
        this(context,null);
    }

    public MyFragmentTabHost(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onTabChanged(String tabId) {
        if (tabId.equals(mNoTabChangedTag)) {
            setCurrentTabByTag(mCurrentTag);
        } else {
            super.onTabChanged(tabId);
            mCurrentTag = tabId;
        }
    }

    public void setNoTabChangedTag(String tag) {
        this.mNoTabChangedTag = tag;
    }
}
