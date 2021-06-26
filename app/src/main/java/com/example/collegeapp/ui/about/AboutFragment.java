package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private CourseAdapter adapter;
    private List<CourseModel> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new CourseModel(R.drawable.ic_baseline_subject_24,"CSE Department","The Department of Computer Science and Engineering offers courses leading to Bachelor of Technology in Computer Science and Engineering. The department has a very good infrastructure and faculty to provide excellent education.\n"));
        list.add(new CourseModel(R.drawable.ic_baseline_subject_24,"ECE Department","The Department of Electronics and Communication Engineering is one of the established and largest department in the institute. It was established in the year 1978 with an intake of 10 students only. The Department offers B.Tech programme in \"Electronics & Communication Engineering\" with 141 intake capacity, and M.Tech programme in \"Communication Systems, Microelectronics and VLSI System Design\"with 18 intake capacity for each specialization."));
        list.add(new CourseModel(R.drawable.ic_baseline_subject_24,"Electrical Department","The Department of Electrical Engineering was established in 1945 under Patna University with an intake of 20 students leading to Bachelor of Science(Engineering) degree of four year duration."));
        list.add(new CourseModel(R.drawable.ic_baseline_subject_24,"Mechanical Department","The Department of Mechanical Engineering was established in 1952 and the M.Tech Program was started in 1978. BCE was converted to National Institute of Technology Patna in 2004 Initially B.Tech. Program in Mechanical Engineering started with intake of 20, which has now become 125."));
        list.add(new CourseModel(R.drawable.ic_baseline_subject_24,"Civil Department","The Department of Civil Engineering is committed to provide quality teaching and research opportunities to its undergraduate, postgraduate and doctoral students. Apart from UG programme, the department also offers M. Tech and Doctoral programmes in the areas of Structural Engineering, Transportation Engineering, Water Resource Engineering, Environmental Engineering and Geotechnical Engineering. The intake strength of the Civil Engineering Department is 92 for undergraduate (B. Tech) and 113 for post graduate (M. Tech). Presently, 58 full time and 137 part time PhD scholars are pursuing their doctoral research program."));

        adapter = new CourseAdapter( getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        Glide.with(getContext())
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh0UkaLNYepBpEWzd23MypgHzsSP8co3bNnNxRV4yOZrVdhxHvBH_KwdKhcwMgijaz1f0&usqp=CAU")
                .into(imageView);



        return view;
    }
}