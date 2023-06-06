package com.example.smartcity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.utils.FragmentPager;
import com.example.view.fragment.FragmentHome;
import com.example.view.fragment.FragmentSelect;
import com.example.view.fragment.FragmentService;
import com.example.view.fragment.FragmentUser;
import com.example.view.fragment.FragmentcNews;

import java.util.ArrayList;

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
        initView();//初始化视图
    }

    private void initView() {
        //获取上方滑动视图的控件属性，并且设置点击事件
        viewpager1 = (ViewPager) findViewById(R.id.viewpager_homepage);
        viewpager1.addOnPageChangeListener(this);

        //获取下方导航栏的文字控件属性，并且设置点击事件
        view_list0 = (TextView) findViewById(R.id.textview_list0);
        view_list0.setOnClickListener(this);
        view_list1 = (TextView) findViewById(R.id.textview_list1);
        view_list1.setOnClickListener(this);
        view_list2 = (TextView) findViewById(R.id.textview_list2);
        view_list2.setOnClickListener(this);
        view_list3 = (TextView) findViewById(R.id.textview_list3);
        view_list3.setOnClickListener(this);
        view_list4 = (TextView) findViewById(R.id.textview_list4);
        view_list4.setOnClickListener(this);

        //获取下方导航栏的icon的控件属性，并且设置点击事件
        View frame_homepage = findViewById(R.id.frame_homepage);
        frame_homepage.setOnClickListener(this);
        View frame_service = findViewById(R.id.frame_service);
        frame_service.setOnClickListener(this);
        View frame_political = findViewById(R.id.frame_political);
        frame_political.setOnClickListener(this);
        View frame_new = findViewById(R.id.frame_new);
        frame_new.setOnClickListener(this);
        View frame_user = findViewById(R.id.frame_user);
        frame_user.setOnClickListener(this);

        //创建五个fragment布局
        Fragment fragment0 = new FragmentHome();
        Fragment fragment1 = new FragmentSelect();
        Fragment fragment2 = new FragmentService();
        Fragment fragment3 = new FragmentcNews();
        Fragment fragment4 = new FragmentUser();

        //创建ArrayList,并把五个fragment加载到list中
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(fragment0);
        list.add(fragment1);
        list.add(fragment2);
        list.add(fragment3);
        list.add(fragment4);

        //设置适配器，同时把list加到适配器FragmentPager的适配器里
        viewpager1.setAdapter(new FragmentPager(getSupportFragmentManager(), list));
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        /*
         * 如果需要同时实现两个及两个以上的功能时候可以写成：
         * case xxxx：
         * case xxxx:
         *   break;
         * （类似 “a” 与 “b”）
         * */

        switch (view.getId()) {
            //设置导航栏点击时，显示当前页面
            case R.id.textview_list0:           //  文字
            case R.id.frame_homepage:       //  icon
                viewpager1.setCurrentItem(PAGE_ZERO);
                break;
            case R.id.textview_list1:
            case R.id.frame_service:
                viewpager1.setCurrentItem(PAGE_ONE);
                break;
            case R.id.textview_list2:
            case R.id.frame_political:
                viewpager1.setCurrentItem(PAGE_Two);
                break;
            case R.id.textview_list3:
            case R.id.frame_new:
                viewpager1.setCurrentItem(PAGE_Three);
                break;
            case R.id.textview_list4:
            case R.id.frame_user:
                viewpager1.setCurrentItem(PAGE_Four);
                break;
        }

    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        //设置当前页面下方导航栏的定位，并初始化
        switch (position) {
            case PAGE_ZERO:
                //设置当前页面文字颜色
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