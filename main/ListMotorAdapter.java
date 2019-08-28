package com.example.mysubmission;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class ListMotorAdapter extends Adapter <ListMotorAdapter.CategoryViewHolder>
{   private Context context;
    private ArrayList<Motor> listMotor;
    public ListMotorAdapter(Context context) { this.context = context; }
    public ArrayList<Motor> getListMotor () { return listMotor;  }
    public void setListMotor(ArrayList<Motor> listMotor){ this.listMotor = listMotor;}

    @NonNull
    @Override
    public ListMotorAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {	View itemList = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_list, viewGroup, false);
        return new CategoryViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMotorAdapter.CategoryViewHolder categoryViewHolder, int i)
    {	categoryViewHolder.tvName.setText(getListMotor().get(i).getName());
        Glide.with(context)
                .load(getListMotor().get(i).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgMotor);
    }

    @Override
    public int getItemCount()
    {	return getListMotor().size();}

    public class CategoryViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvName;
        ImageView imgMotor;
        CategoryViewHolder(@NonNull View itemView)
        {   super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            imgMotor = itemView.findViewById(R.id.img_motor);
        }
    }
}
