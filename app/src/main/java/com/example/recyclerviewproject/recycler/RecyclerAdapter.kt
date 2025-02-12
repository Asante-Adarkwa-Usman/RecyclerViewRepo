package com.example.recyclerviewproject.recycler


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewproject.R
import com.bumptech.glide.Glide

class RecyclerAdapter(private val productList: List<ProductItems>) :
    RecyclerView.Adapter<RecyclerAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_card, parent, false)
        return ProductViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.productName.text = product.name
        holder.productPrice.text = product.price.toString()
        holder.productDescription.text = product.description
        Glide.with(holder.itemView).load(product.imageUrl).into(holder.productImage)

        // Set content description for image accessibility
        holder.productImage.contentDescription = "Image of ${product.name}"

        // Set click listener for the entire CardView
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Price: ${product.price}, Rating: ${product.rating}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    // ViewHolder class
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName: TextView = itemView.findViewById(R.id.productName)
        val productDescription: TextView = itemView.findViewById(R.id.productDescription)
        val productImage: ImageView = itemView.findViewById(R.id.productImage)
        val productPrice: TextView = itemView.findViewById(R.id.productPrice)
    }
}
