package student.oschinaxwj.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import student.oschinaxwj.R;
import student.oschinaxwj.base.BaseFragment;

/**
 * 发现页面
 * Created by user on 2015/6/9.
 */
public class ExploreFragment extends BaseFragment {

    @InjectView(R.id.rl_active)
    LinearLayout mRlActive;
    @InjectView(R.id.rl_find_osc)
    LinearLayout mRlFindOsc;
    @InjectView(R.id.rl_city)
    LinearLayout mRlCity;
    @InjectView(R.id.rl_activities)
    LinearLayout mRlActivities;
    @InjectView(R.id.rl_scan)
    LinearLayout mRlScan;
    @InjectView(R.id.rl_shake)
    LinearLayout mRlShake;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, null);
        ButterKnife.inject(this, view);
        initView(view);
        return view;
    }

    @Override
    public void initView(View view) {
        mRlActive.setOnClickListener(this);
        mRlFindOsc.setOnClickListener(this);
        mRlCity.setOnClickListener(this);
        mRlActivities.setOnClickListener(this);
        mRlScan.setOnClickListener(this);
        mRlShake.setOnClickListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_active:
                break;
            case R.id.rl_find_osc:
                break;
            case R.id.rl_city:
                break;
            case R.id.rl_activities:
                break;
            case R.id.rl_scan:
                break;
            case R.id.rl_shake:
                break;
            default:
                break;
        }
    }
}
