package com.example.guest.stormy.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guest.stormy.R;
import com.example.guest.stormy.weather.Hour;


/**
 * Created by admin on 12/11/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {


    //setting a constructor to allows us to create it in the activity and set the data
    private Hour[] mHours;
    public HourAdapter(Hour[] hours){
        mHours = hours;
    }


    @Override
    //called whenever a new viewholder is needed
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //root view for item layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_list_item, parent, false);
        HourViewHolder viewHolder = new HourViewHolder(view);
        return viewHolder;
    }

    @Override
    //Bridge between adapter and the bind method in viewHolder class
    public void onBindViewHolder(HourViewHolder holder, int position) {
        holder.bindHour(mHours[position]);
    }

    @Override
    public int getItemCount() {
        return mHours.length;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder {

        public TextView mTimeLabel;
        public TextView mSummaryLabel;
        public TextView mTemperatureLabel;
        public ImageView mIconImageView;

        public HourViewHolder(View itemView) {
            super(itemView);

            mTimeLabel = (TextView) itemView.findViewById(R.id.timeLabel);
            mSummaryLabel = (TextView) itemView.findViewById(R.id.summaryLabel);
            mTemperatureLabel = (TextView) itemView.findViewById(R.id.temperatureLabel);
            mIconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);
        }

        public void bindHour(Hour hour) {
            mTimeLabel.setText(hour.getHour());
            mSummaryLabel.setText(hour.getSummary());
            mTemperatureLabel.setText(hour.getTemperature() + "");
            mIconImageView.setImageResource(hour.getIconId());
        }
    }
}
