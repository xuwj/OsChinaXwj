package student.oschinaxwj.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.ButterKnife;
import student.oschinaxwj.R;
import student.oschinaxwj.base.BaseFragment;

/**
 * 用户（我的信息）界面
 * Created by user on 2015/6/9.
 */
public class MyInformationFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_information,
                container, false);
        ButterKnife.inject(this, view);
        initView(view);
        return view;
    }
}
