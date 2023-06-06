package com.example.view.fragment;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.model.DataBean;
import com.example.smartcity.R;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;

public class FragmentHome extends Fragment implements View.OnClickListener {

    private Banner banner_homePage;
    private TextView homeTextView_list0;
    private TextView homeTextView_list1;
    private TextView homeTextView_list2;
    private TextView homeTextView_list3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initView(view);//显示视图

        return view;

    }

    private void initView(View view) {
        //获取控件，并设置点击监听器
        banner_homePage = view.findViewById(R.id.banner_homePage);
        banner_homePage.setOnClickListener(this);//点击事件
        homeTextView_list0 = view.findViewById(R.id.homeTextView_list0);
        homeTextView_list0.setOnClickListener(this);
        homeTextView_list1 = view.findViewById(R.id.homeTextView_list1);
        homeTextView_list1.setOnClickListener(this);
        homeTextView_list2 = view.findViewById(R.id.homeTextView_list2);
        homeTextView_list2.setOnClickListener(this);
        homeTextView_list3 = view.findViewById(R.id.homeTextView_list3);
        homeTextView_list3.setOnClickListener(this);

        banner_homePage.setAdapter(new BannerImageAdapter<DataBean>(DataBean.getTestData3()) {
            @Override
            public void onBindView(BannerImageHolder holder, DataBean data, int position, int size) {
                Glide.with(holder.imageView).load(data.imageUrl).into(holder.imageView);
            }
        });

    }

    //设置点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case  R.id.homeTextView_list0 :


                break;

            case  R.id.homeTextView_list1 :

                break;

            case  R.id.homeTextView_list2 :

                break;

            case  R.id.homeTextView_list3 :

                break;

            case  R.id.homeTextView_list4 :

                break;

        }

    }
}
