package top.wuhaojie.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaojie on 2016/9/11 18:14.
 */
public class MyAdapter extends BaseAdapter {

    private List<String> mList = new ArrayList<>();

    {
        mList.add("我的收藏");
        mList.add("我的行程");
        mList.add("消息中心");
        mList.add("我的收藏");
        mList.add("我的行程");
        mList.add("消息中心");

    }


    private Context mContext;

    public MyAdapter(Context context) {
        mContext = context;
    }

    /**
     * ListView中子项的个数
     *
     * @return
     */
    @Override
    public int getCount() {
        return mList.size();
    }

    /**
     * 取得每一个对象
     *
     * @param i
     * @return
     */
    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    /**
     * 取得对象的名字
     *
     * @param i
     * @return
     */
    @Override
    public long getItemId(int i) {
        return i;
    }

    /**
     * 取得每一个子项的视图
     *
     * @param i
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View inflate = inflater.inflate(R.layout.lv_item, null);

        TextView textView = (TextView) inflate.findViewById(R.id.tv_lv_item);
        textView.setText(mList.get(i));

        return inflate;
    }
}
