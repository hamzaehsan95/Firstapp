package co.thedevden.firstapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder>
{
    private String [] data;
    public myAdapter(String[] data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.myview,viewGroup,false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        String txt= data[i];
        myViewHolder.tv.setText(txt);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView im;
        TextView tv;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            im = (ImageView) itemView.findViewById(R.id.myimageview);
            tv = (TextView) itemView.findViewById(R.id.myTextView);
        }
    }
}
