package ac.id.ubaya.satu_jiwa_160420076.view

import ac.id.ubaya.satu_jiwa_160420076.R
import ac.id.ubaya.satu_jiwa_160420076.model.Donation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.donasi_item.view.txtDonation

//import kotlinx.android.synthetic.main.donasi_item.view.*

class DonationAdapter (val donationList:ArrayList<Donation>) : RecyclerView.Adapter<DonationAdapter.DonationViewHolder>() {
    class DonationViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DonationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.donasi_item, parent, false)
        return DonationViewHolder(view)
    }

    override fun getItemCount() = donationList.size

    override fun onBindViewHolder(holder: DonationViewHolder, position: Int) {
//        val donation = findViewById<TextView>(R.id.txtDonation)

        with(holder.view) {
            txtDonation.text
        }
        //holder.view.txtDonation.text = donationList[position].name
    }
}