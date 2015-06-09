package student.oschinaxwj.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import student.oschinaxwj.base.BaseFragment;

/**
 * Created by user on 2015/6/9.
 */
public class MyInformationFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(MyInformationFragment.class.getSimpleName());
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
}
