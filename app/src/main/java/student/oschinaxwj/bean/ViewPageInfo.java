package student.oschinaxwj.bean;

import android.os.Bundle;

/**
 * Created by user on 2015/6/10.
 */
public class ViewPageInfo {
    public  String title;
    public  String tag;
    public  Class<?> clss;
    public  Bundle args;

    public ViewPageInfo(String _title, String _tag, Class<?> _class, Bundle _args) {
        title = _title;
        tag = _tag;
        clss = _class;
        args = _args;
    }

}
