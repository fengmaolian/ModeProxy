package example.com.mode_proxy;
import android.widget.TextView;
/**
 * Created by fml on 2015/12/9 0009.
 *
 * 新建一个人，具有买票行为，实现接口BuyTicket
 */
public class People implements BuyTicket{
    private String money;
    private String name;

    @Override
    public void buyTicket(TextView mTextView) {
        mTextView.setText(name+"购票成功");
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "money='" + money + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
