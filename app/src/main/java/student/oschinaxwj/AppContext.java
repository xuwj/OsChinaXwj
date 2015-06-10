package student.oschinaxwj;

import student.oschinaxwj.base.BaseApplication;

/**
 * Created by user on 2015/6/10.
 */
public class AppContext extends BaseApplication {
    private static AppContext instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    /**
     * 获得当前app运行的AppContext
     *
     * @return
     */
    public static AppContext getInstance() {
        return instance;
    }
}
