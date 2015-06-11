package student.oschinaxwj.viewpagerfragment;


import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import student.oschinaxwj.R;
import student.oschinaxwj.adapter.ViewPageFragmentAdapter;
import student.oschinaxwj.base.BaseListFragment;
import student.oschinaxwj.base.BaseViewPagerFragment;
import student.oschinaxwj.bean.BlogList;
import student.oschinaxwj.bean.NewsList;
import student.oschinaxwj.fragment.BlogFragment;
import student.oschinaxwj.fragment.NewsFragment;


/**
 * Created by user on 2015/6/9.
 */
public class NewsViewPagerFragment extends BaseViewPagerFragment {


    @Override
    protected void onSetupTabAdapter(ViewPageFragmentAdapter adapter) {
        String[] title = getResources().getStringArray(
                R.array.news_viewpage_arrays);
        adapter.addTab(title[0], "news", NewsFragment.class,
                getBundle(NewsList.CATALOG_ALL));
        adapter.addTab(title[1], "news_week", NewsFragment.class,
                getBundle(NewsList.CATALOG_WEEK));
        adapter.addTab(title[2], "latest_blog", BlogFragment.class,
                getBundle(BlogList.CATALOG_LATEST));
        adapter.addTab(title[3], "recommend_blog", BlogFragment.class,
                getBundle(BlogList.CATALOG_RECOMMEND));
    }

    private Bundle getBundle(int newType) {
        Bundle bundle = new Bundle();
        bundle.putInt(BaseListFragment.BUNDLE_KEY_CATALOG, newType);
        return bundle;
    }

    @Override
    protected void setScreenPageLimit() {
        mViewPager.setOffscreenPageLimit(3);
    }

    /**
     * 基类会根据不同的catalog展示相应的数据
     *
     * @param catalog
     *            要显示的数据类别
     * @return
     */
    private Bundle getBundle(String catalog) {
        Bundle bundle = new Bundle();
        bundle.putString(BlogFragment.BUNDLE_BLOG_TYPE, catalog);
        return bundle;
    }


}
