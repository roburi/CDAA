package burgos.com.rodrigram.adapter;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;
import java.util.ArrayList;
import burgos.com.rodrigram.R;
import burgos.com.rodrigram.model.Picture;
import burgos.com.rodrigram.view.PictureDetailActivity;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>
{
    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;


    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity)
    {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }


    public void onBindViewHolder(PictureViewHolder holder, int position)
    {
        Picture picture = pictures.get(position);
        holder.usernameCard.setText(picture.getUserName());
        holder.timeCard.setText(picture.getTime());
        holder.likeNumberCard.setText(picture.getLike_number());

        //Picasso.with(picture).load("http://i.imgur.com/DvpvklR.png").into(holder.pictureCard);
        Picasso.get().load(picture.getPicture()).into(holder.pictureCard);

        holder.pictureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, PictureDetailActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    public int getItemCount()
    {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likeNumberCard;

        public PictureViewHolder(View itemView)
        {
            super(itemView);

            pictureCard = (ImageView) itemView.findViewById(R.id.pictureCard);
            usernameCard = (TextView) itemView.findViewById(R.id.userNameCard);
            timeCard = (TextView) itemView.findViewById(R.id.timeCard);
            likeNumberCard = (TextView) itemView.findViewById(R.id.likeNumberCard);
        }
    }
}
