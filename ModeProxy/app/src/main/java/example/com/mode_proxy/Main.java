package example.com.mode_proxy;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import example.com.baseactivity.BaseActivity;
/**
 * java设计模式：代理模式；
 * 其他理解：代理模式是对象的结构模式。代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。
 * 个人理解：A对象不想或者不能直接去引用B对象，代理C对象在A和B之间起到中介的作用；
 * 生活中案例：快过年了，(A)我们都不想直接去(B)车站买票,所以登录(C)12306官网去购票；(12306代理对象)
 *
 *
 * 买票的例子
 */
public class Main extends BaseActivity {
    private EditText mName , mMoney;
    private Button mBuy;
    private TextView mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mName = (EditText) findViewById(R.id.name);
        mMoney = (EditText) findViewById(R.id.money);
        mBuy = (Button) findViewById(R.id.buy_ticket);
        mResult = (TextView) findViewById(R.id.result);
        mBuy.setOnClickListener(new onClick());
    }

    class onClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            People mPeople = new People();
            mPeople.setName(mName.getText().toString().trim());
            mPeople.setMoney(mMoney.getText().toString().trim());

            ProxyBuyTicket mProxyBuyTicket = new ProxyBuyTicket();
            mProxyBuyTicket.setmPeople(mPeople);
            mProxyBuyTicket.buyTicket(mResult);
        }
    }
}
