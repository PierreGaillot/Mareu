package com.gayo.mareu;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gayo.mareu.model.Meet;
import com.gayo.mareu.placeholder.PlaceholderContent.PlaceholderItem;
import com.gayo.mareu.databinding.FragmentMeetListBinding;

import java.io.Serializable;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyMeetRecyclerViewAdapter extends RecyclerView.Adapter<MyMeetRecyclerViewAdapter.ViewHolder> implements Serializable {

    private final List<Meet> mMeets;

    public MyMeetRecyclerViewAdapter(List<Meet> items) {
        mMeets = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_meet_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Meet meet = mMeets.get(position);
        holder.mMeetTopic.setText(meet.getTopic());
        holder.mMeetDate.setText(meet.getDate().toString());
        holder.mMeetMailList.setText(meet.getParticipantsList().toString());
    }

    @Override
    public int getItemCount() {
        return mMeets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.fragmentMeetItemListTextViewMeetTopic)
        public final TextView mMeetTopic;
        @BindView(R.id.fragmentMeetItemListTextViewEmail)
        public final TextView mMeetMailList;
        @BindView(R.id.fragmentMeetItemListTextViewMeetDate)
        public final TextView mMeetDate;

        public PlaceholderItem mItem;

        public ViewHolder(FragmentMeetListBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}