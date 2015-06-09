package student.oschinaxwj.viewpagerfragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import student.oschinaxwj.base.BaseViewPagerFragment;

/**
 * Created by user on 2015/6/9.
 */
public class TweetsViewPagerFragment extends BaseViewPagerFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(TweetsViewPagerFragment.class.getSimpleName());
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
}
