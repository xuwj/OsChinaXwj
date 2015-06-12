package student.oschinaxwj.bean;

import java.io.Serializable;

/**
 * 实体基类：实现序列化
 * Created by user on 2015/6/12.
 */
public abstract class Base implements Serializable {

    protected Notice notice;

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

}
