package student.oschinaxwj.bean;

/**
 * 实体类
 * Created by user on 2015/6/12.
 */
public abstract class Entity extends Base {
    protected int id;

    protected String cacheKey;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }
}
