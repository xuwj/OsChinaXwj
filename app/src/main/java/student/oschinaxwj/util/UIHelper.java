package student.oschinaxwj.util;

import android.content.Context;
import android.content.Intent;

import student.oschinaxwj.ui.LoginActivity;

/**
 * 界面帮助类
 * Created by user on 2015/6/12.
 */
public class UIHelper {

    /**
     * 显示登录界面
     *
     * @param context
     */
    public static void showLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

}
