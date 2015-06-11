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
import student.oschinaxwj.bean.TweetsList;
import student.oschinaxwj.fragment.BlogFragment;
import student.oschinaxwj.fragment.NewsFragment;
import student.oschinaxwj.fragment.TweetsFragment;

/**
 * 动弹界面（包括最新动弹、热门动弹、我的动弹）
 * Created by user on 2015/6/9.
 */
public class TweetsViewPagerFragment extends BaseViewPagerFragment {

    @Override
    protected void onSetupTabAdapter(ViewPageFragmentAdapter adapter) {

        String[] title = getResources().getStringArray(
                R.array.tweets_viewpage_arrays);
        adapter.addTab(title[0], "new_tweets", TweetsFragment.class,
                getBundle(TweetsList.CATALOG_LATEST));
        adapter.addTab(title[1], "hot_tweets", TweetsFragment.class,
                getBundle(TweetsList.CATALOG_HOT));
        adapter.addTab(title[2], "my_tweets", TweetsFragment.class,
                getBundle(TweetsList.CATALOG_ME));
    }

    private Bundle getBundle(int catalog) {
        Bundle bundle = new Bundle();
        bundle.putInt(BaseListFragment.BUNDLE_KEY_CATALOG, catalog);
        return bundle;
    }

    @Override
    protected void setScreenPageLimit() {
        mViewPager.setOffscreenPageLimit(2);
    }


}
