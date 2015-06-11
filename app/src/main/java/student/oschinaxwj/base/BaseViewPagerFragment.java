package student.oschinaxwj.base;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import student.oschinaxwj.R;
import student.oschinaxwj.adapter.ViewPageFragmentAdapter;
import student.oschinaxwj.widget.PagerSlidingTabStrip;

/**
 * Created by user on 2015/6/9.
 */
public abstract class BaseViewPagerFragment extends BaseFragment {
    protected PagerSlidingTabStrip mTabStrip;
    protected ViewPager mViewPager;
    protected ViewPageFragmentAdapter mTabsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.base_viewpage_fragment, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mTabStrip = (PagerSlidingTabStrip) view
                .findViewById(R.id.pager_tabstrip);
        mViewPager = (ViewPager) view.findViewById(R.id.pager);
        mTabsAdapter = new ViewPageFragmentAdapter(getChildFragmentManager(),
                mTabStrip, mViewPager);
        setScreenPageLimit();
        onSetupTabAdapter(mTabsAdapter);
    }

    protected void setScreenPageLimit() {
    }

    protected abstract void onSetupTabAdapter(ViewPageFragmentAdapter adapter);
}
