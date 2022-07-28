package com.gayo.mareu;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gayo.mareu.DI.DI;
import com.gayo.mareu.model.Meet;
import com.gayo.mareu.service.DummyMeetGenerator;
import com.gayo.mareu.service.MeetApiService;

import java.util.List;

public class MeetItemListFragment extends Fragment {

    private MeetApiService mMeetApiService;
    private List<Meet> mMeets;
    private RecyclerView mRecyclerView;


    public static MeetItemListFragment newInstance() {
        MeetItemListFragment fragment = new MeetItemListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMeetApiService = DI.getMeetApiService();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meet_item_list,container, false);
        Context context = view.getContext();
        mRecyclerView = (RecyclerView) view;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        // Inflate the layout for this fragment
        return view;
    }


    private void initList(){
        mMeets = DummyMeetGenerator.DUMMY_MEET;
        mRecyclerView.setAdapter(new MyMeetRecyclerViewAdapter(mMeets));
    }
}