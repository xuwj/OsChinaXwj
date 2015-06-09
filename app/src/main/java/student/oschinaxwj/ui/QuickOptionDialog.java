package student.oschinaxwj.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import student.oschinaxwj.R;

/**
 * Created by user on 2015/6/9.
 */
public class QuickOptionDialog extends Dialog implements View.OnClickListener{
    private ImageView mClose;

    public interface OnQuickOptionformClick {
        void onQuickOptionClick(int id);
    }

    private OnQuickOptionformClick mListener;

    public QuickOptionDialog(Context context) {
        this(context, R.style.quick_option_dialog);
    }


    protected QuickOptionDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


    public QuickOptionDialog(Context context, int theme) {
        super(context, theme);
        View contentView = getLayoutInflater().inflate(
                R.layout.dialog_quick_option, null);
        contentView.findViewById(R.id.ly_quick_option_text).setOnClickListener(
                this);
        contentView.findViewById(R.id.ly_quick_option_album)
                .setOnClickListener(this);
        contentView.findViewById(R.id.ly_quick_option_photo)
                .setOnClickListener(this);
        contentView.findViewById(R.id.ly_quick_option_voice)
                .setOnClickListener(this);
        contentView.findViewById(R.id.ly_quick_option_scan).setOnClickListener(
                this);
        contentView.findViewById(R.id.ly_quick_option_note).setOnClickListener(
                this);
        mClose = (ImageView) contentView.findViewById(R.id.iv_close);

        Animation operatingAnim = AnimationUtils.loadAnimation(getContext(),
                R.anim.quick_option_close);
        LinearInterpolator lin = new LinearInterpolator();
        operatingAnim.setInterpolator(lin);
        mClose.startAnimation(operatingAnim);
        mClose.setOnClickListener(this);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.setContentView(contentView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_close:
                dismiss();
                break;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(Gravity.BOTTOM);
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = d.getWidth();
        getWindow().setAttributes(p);
    }

    public void setOnQuickOptionformClickListener(OnQuickOptionformClick lis) {
        mListener = lis;
    }
}
