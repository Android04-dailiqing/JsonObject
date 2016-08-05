package com.example.recyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by admin on 2016/8/5.
 */
public class MyRecyclerView extends RecyclerView.Adapter<MyRecyclerView.MyViewHodler> {
    private Context                mContext;
    private ArrayList<ImageBean.ResultsBean> mList;

    public MyRecyclerView(Context context, ArrayList<ImageBean.ResultsBean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item, parent,false);
        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {
        ImageBean.ResultsBean resultsBean = mList.get(position);
        holder.mTextView.setText(resultsBean.getWho());
        Picasso.with(mContext).load(resultsBean.getUrl()).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        if(mList != null){
            return mList.size();
        }
        return 0;
    }

    public class MyViewHodler extends RecyclerView.ViewHolder{
        public CardView mCardView;
        public ImageView mImageView;
        public TextView mTextView;
        public MyViewHodler(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.cv_card);
            mImageView= (ImageView) itemView.findViewById(R.id.iv_item);
            mTextView= (TextView) itemView.findViewById(R.id.tv_item);
        }
    }
}
