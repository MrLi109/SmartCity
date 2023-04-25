package com.example.smartcity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.view.fragment.FragmentHome;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private static final int PAGE_ZERO = 0;
    private static final int PAGE_ONE = 1;
    private static final int PAGE_Two = 2;
    private static final int PAGE_Three = 3;
    private static final int PAGE_Four = 4;

    private TextView view_list0;
    private TextView view_list1;
    private TextView view_list2;
    private TextView view_list3;
    private TextView view_list4;
    private ViewPager viewpager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题框
        initView();//初始化视图
    }

    private void initView() {
        //获取下方导航栏的控件属性，并且设置点击事件
        view_list0 = (TextView) findViewById(R.id.view_list0);
        view_list0.setOnClickListener(this);
        view_list1 = (TextView) findViewById(R.id.view_list1);
        view_list1.setOnClickListener(this);
        view_list2 = (TextView) findViewById(R.id.view_list2);
        view_list2.setOnClickListener(this);
        view_list3 = (TextView) findViewById(R.id.view_list3);
        view_list3.setOnClickListener(this);
        view_list4 = (TextView) findViewById(R.id.view_list4);
        view_list4.setOnClickListener(this);

        viewpager1 = (ViewPager) findViewById(R.id.viewpager1);
        //添加触发事件
        viewpager1.addOnPageChangeListener(this);

        Fragment fragment0 = new FragmentHome();


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //设置点击时，显示当前页面
            case R.id.view_list0:
                viewpager1.setCurrentItem(PAGE_ZERO);
                break;
            case R.id.view_list1:
                viewpager1.setCurrentItem(PAGE_ONE);
                break;
            case R.id.view_list2:
                viewpager1.setCurrentItem(PAGE_Two);
                break;
            case R.id.view_list3:
                viewpager1.setCurrentItem(PAGE_Three);
                break;
            case R.id.view_list4:
                viewpager1.setCurrentItem(PAGE_Four);
                break;
        }
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        //设置当前页面的文字颜色设置，并初始化
        switch (position){
            case PAGE_ZERO:
                view_list0.setTextColor(Color.BLUE);
                view_list1.setTextColor(Color.BLACK);
                view_list2.setTextColor(Color.BLACK);
                view_list3.setTextColor(Color.BLACK);
                view_list4.setTextColor(Color.BLACK);
                break;
            case PAGE_ONE:
                view_list0.setTextColor(Color.BLACK);
                view_list1.setTextColor(Color.BLUE);
                view_list2.setTextColor(Color.BLACK);
                view_list3.setTextColor(Color.BLACK);
                view_list4.setTextColor(Color.BLACK);
                break;
            case PAGE_Two:
                view_list0.setTextColor(Color.BLACK);
                view_list1.setTextColor(Color.BLACK);
                view_list2.setTextColor(Color.BLUE);
                view_list3.setTextColor(Color.BLACK);
                view_list4.setTextColor(Color.BLACK);
                break;
            case PAGE_Three:
                view_list0.setTextColor(Color.BLACK);
                view_list1.setTextColor(Color.BLACK);
                view_list2.setTextColor(Color.BLACK);
                view_list3.setTextColor(Color.BLUE);
                view_list4.setTextColor(Color.BLACK);
                break;
            case PAGE_Four:
                view_list0.setTextColor(Color.BLACK);
                view_list1.setTextColor(Color.BLACK);
                view_list2.setTextColor(Color.BLACK);
                view_list3.setTextColor(Color.BLACK);
                view_list4.setTextColor(Color.BLUE);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}