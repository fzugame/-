package com.example.pinpin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    private List<Message> messagelist;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView headpt;
        TextView name;
        TextView msg;
        TextView time;
        public ViewHolder(View view){
            super(view);
            headpt=(ImageView)view.findViewById(R.id.image1);
            name=(TextView)view.findViewById(R.id.text_name);
            msg=(TextView)view.findViewById(R.id.text_msg);
            time=(TextView)view.findViewById(R.id.text_time);
        }
    }
    public MessageAdapter(List<Message> msglist){
        messagelist=msglist;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list_view,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    public void onBindViewHolder(ViewHolder holder,int position){
        Message message=messagelist.get(position);
        holder.headpt.setImageResource(message.getImage_id());
        holder.name.setText(message.getName());
        holder.msg.setText(message.getMsg());
        holder.time.setText(message.getDate());

    }

    @Override
    public int getItemCount() {
        return messagelist.size();
    }
}
