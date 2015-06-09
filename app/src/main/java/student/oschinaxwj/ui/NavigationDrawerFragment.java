package student.oschinaxwj.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import student.oschinaxwj.R;
import student.oschinaxwj.base.BaseFragment;

/**
 * Created by user on 2015/6/8.
 */
public class NavigationDrawerFragment extends BaseFragment {
    private View mDrawerListView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mDrawerListView = inflater.inflate(R.layout.fragment_navigation_drawer,
                container, false);
        mDrawerListView.setOnClickListener(this);
        // ButterKnife.inject(this, mDrawerListView);
        initView(mDrawerListView);
        initData();
        return mDrawerListView;
    }


}
