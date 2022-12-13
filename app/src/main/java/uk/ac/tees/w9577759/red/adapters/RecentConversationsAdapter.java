package uk.ac.tees.w9577759.red.adapters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import androidx.recyclerview.widget.RecyclerView;

import uk.ac.tees.w9577759.red.databinding.ItemContainerRecentConversationsBinding;

public class RecentConversationsAdapter {

//    class ConversionViewHolder extends RecyclerView.ViewHolder {
        ItemContainerRecentConversationsBinding binding;

//        ConversionViewHolder(ItemContainerRecentConversationsBinding itemContainerRecentConversationsBinding)
//    }

    private Bitmap getConversionImage(String encodedImage) {
        byte[] bytes = Base64.decode(encodedImage, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }
}
