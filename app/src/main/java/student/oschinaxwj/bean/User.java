package student.oschinaxwj.bean;


/**
 * 登录用户实体类
 * Created by user on 2015/6/12.
 */
public class User extends Entity {

    private String account;

    private String pwd;

    private boolean isRememberMe;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean isRememberMe() {
        return isRememberMe;
    }

    public void setIsRememberMe(boolean isRememberMe) {
        this.isRememberMe = isRememberMe;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
