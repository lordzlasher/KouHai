package com.example.kouhai;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CoursesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CoursesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView; //new
    ArrayList<Courses> list; //new
//    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
//    ArrayList<Karakter> data;

    public CoursesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CoursesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CoursesFragment newInstance(String param1, String param2) {
        CoursesFragment fragment = new CoursesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_courses, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);



        list = new ArrayList<>();
        for (int i = 0; i < ItemCourses.Headline.length; i++) {
            list.add(new Courses(
                    ItemCourses.Headline[i],
                    ItemCourses.Subhead[i],
                    ItemCourses.iconList[i]
            ));
        }

        showList();
        return v;
    }
    private void showList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        AdapterCourses adapter= new AdapterCourses(list);
        recyclerView.setAdapter(adapter);

        adapter.OnRecyclerViewClickListener(new AdapterCourses.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent;
                intent = new Intent(getActivity(), Lesson5.class);
                startActivity(intent);
//                switch (position) {
//                    case 0: //first item in Recycler view
//                        intent = new Intent(getActivity(), SenpaiNote.class);
//                        startActivity(intent);
//                        break;
//                    case 1: //second item in Recycler view
//                        intent = new Intent(getActivity(), Lesson1.class);
//                        startActivity(intent);
//                        break;
//                }
            }
        });

    }
}