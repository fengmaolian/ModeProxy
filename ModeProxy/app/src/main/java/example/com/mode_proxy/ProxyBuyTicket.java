package example.com.mode_proxy;

import android.widget.TextView;

/**
 * Created by fml on 2015/12/9 0009.
 *
 * 新建12306代理购票
 */
public class ProxyBuyTicket implements BuyTicket{
    private People mPeople;

    public People getmPeople() {
        return mPeople;
    }

    public void setmPeople(People mPeople) {
        this.mPeople = mPeople;
    }


    @Override
    public void buyTicket(TextView mTextView) {
        if(mPeople.getName().isEmpty()){
            mTextView.setText("没有姓名，购票失败");
            return;
        }
        if(mPeople.getMoney().isEmpty()){
            mTextView.setText("没有钱，购票失败");
            return;
        }
        if(Double.parseDouble(mPeople.getMoney()) < 500){
            mTextView.setText("钱不足，购票失败");
            return;
        }
        mTextView.setText("恭喜" + mPeople.getName() + "购票成功");
    }
}
