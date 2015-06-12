package student.oschinaxwj.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import student.oschinaxwj.AppContext;
import student.oschinaxwj.R;
import student.oschinaxwj.base.BaseFragment;
import student.oschinaxwj.util.UIHelper;
import student.oschinaxwj.widget.AvatarView;
import student.oschinaxwj.widget.CircleImageView;

/**
 * 用户（我的信息）界面
 * Created by user on 2015/6/9.
 */
public class MyInformationFragment extends BaseFragment {

    @InjectView(R.id.iv_avatar)
    AvatarView mIvAvatar;

    @InjectView(R.id.ll_user_container)
    View mUserContainer;

    @InjectView(R.id.rl_user_unlogin)
    View mUserUnLogin;

    private boolean mIsWatingLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_information,
                container, false);
        ButterKnife.inject(this, view);
        initView(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        requestData(true);
    }

    @Override
    public void initView(View view) {
        mIvAvatar.setOnClickListener(this);
        mUserUnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.showLoginActivity(getActivity());
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @Override
    public void onClick(View v) {
        if (mIsWatingLogin) {
            //AppContext.showToast(R.string.unlogin);
            UIHelper.showLoginActivity(getActivity());
            return;
        }
        switch (v.getId()) {
            case R.id.iv_avatar:
                break;
            default:
                break;
        }
    }

    private void requestData(boolean refresh) {
        if (AppContext.getInstance().isLogin()) {
            mIsWatingLogin = false;
        } else {
            mIsWatingLogin = true;
        }
        steupUser();
    }

    private void steupUser() {
        if (mIsWatingLogin) {
            mUserContainer.setVisibility(View.GONE);
            mUserUnLogin.setVisibility(View.VISIBLE);
        } else {
            mUserContainer.setVisibility(View.VISIBLE);
            mUserUnLogin.setVisibility(View.GONE);
        }
    }
}
