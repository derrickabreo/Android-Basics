package ml.derrickabreo.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapaterViewHolder>{

    static datasource[] data;
    Adapter(datasource[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public AdapaterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_row, parent,false);
        return new AdapaterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapaterViewHolder holder, int position) {
        holder.name.setText(data[position].name);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class AdapaterViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        public AdapaterViewHolder(View itemView) {
            super(itemView);

            name =itemView.findViewById(R.id.name);

        }
    }
}
