package com.punto_rojo.nosavvy.ubereats.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.punto_rojo.nosavvy.ubereats.R;
import com.punto_rojo.nosavvy.ubereats.models.Food;

import java.util.List;

/**
 * Created by nosavvy on 3/27/18.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    private List<Food> foods;

    public void setFood(List<Food> food) {
        this.foods = food;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView pictureImage;
        TextView name;
        TextView time;

        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Food food = foods.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(food.getPicture(), "drawable", holder.itemView.getContext().getPackageName());
        holder.pictureImage.setImageResource(resId);

        holder.name.setText(food.getName());
        holder.time.setText(food.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(holder.itemView.getContext(), "Detalles de Desayuno: " + food.getName(), Toast.LENGTH_SHORT).show();
                // Llamar a otra pantalla y mostrar sus detalles de esta persona ...

            }
        });

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }
}
