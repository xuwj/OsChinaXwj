package student.oschinaxwj.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import student.oschinaxwj.base.BaseFragment;

/**
 * Created by user on 2015/6/10.
 */
public class BlogFragment extends BaseFragment{
    public static final String BUNDLE_BLOG_TYPE = "BUNDLE_BLOG_TYPE";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(BlogFragment.class.getSimpleName());
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
}
