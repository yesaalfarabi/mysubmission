package com.example.mysubmission;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClickListener
{   private final RecyclerView recyclerview;
    private OnItemClickListener clicklistener;
    private OnItemLongClickListener longclicklistener;
    private View.OnClickListener Clicklistener = new View.OnClickListener()
    {   @Override
    public void onClick(View v)
    {
        if (clicklistener != null)
        {
            RecyclerView.ViewHolder holder = recyclerview.getChildViewHolder(v);
            clicklistener.onItemClicked(recyclerview, holder.getAdapterPosition(), v);
        }
    }
    };

    private View.OnLongClickListener mOnLongClickListener = new View.OnLongClickListener()
    {
        @Override
        public boolean onLongClick(View v)
        {
            if (longclicklistener != null)
            {
                RecyclerView.ViewHolder holder = recyclerview.getChildViewHolder(v);
                return longclicklistener.onItemLongClicked(recyclerview, holder.getAdapterPosition(), v);
            }
            return false;
        }
    };

    private RecyclerView.OnChildAttachStateChangeListener mAttachListener = new RecyclerView.OnChildAttachStateChangeListener()
    {
        @Override
        public void onChildViewAttachedToWindow(@NonNull View view)
        {
            if (clicklistener != null)
            { view.setOnClickListener(Clicklistener);}
            if (longclicklistener != null)
            { view.setOnLongClickListener(mOnLongClickListener);}
        }

        @Override
        public void onChildViewDetachedFromWindow(@NonNull View view){}
    };

    private ClickListener(RecyclerView recyclerView)
    {   recyclerview = recyclerView;
        recyclerview.setTag(R.id.click_listener, this);
        recyclerview.addOnChildAttachStateChangeListener(mAttachListener);
    }

    public static ClickListener addTo(RecyclerView view)
    {  ClickListener support = (ClickListener) view.getTag(R.id.click_listener);
        if (support == null) {
            support = new ClickListener(view);
        }
        return support;
    }

    public static ClickListener removeFrom(RecyclerView view)
    {   ClickListener support = (ClickListener) view.getTag(R.id.click_listener);
        if (support != null)
        {    support.detach(view);}
        return support;
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    { clicklistener = (OnItemClickListener) listener;}

    public void setOnItemLongClickListener(OnItemLongClickListener listener)
    {longclicklistener = listener;}

    private void detach(RecyclerView view)
    {	view.removeOnChildAttachStateChangeListener(mAttachListener);
        view.setTag(R.id.click_listener, null);
    }

    public interface OnItemClickListener
    { void onItemClicked(RecyclerView recyclerView, int position, View v);}

    public interface OnItemLongClickListener
    { boolean onItemLongClicked(RecyclerView recyclerView, int position, View v);}
}