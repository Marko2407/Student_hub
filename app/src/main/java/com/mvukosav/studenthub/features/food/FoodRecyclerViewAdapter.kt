import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mvukosav.studenthub.databinding.LayoutFoodByCategoriesBinding
import com.mvukosav.studenthub.domain.models.Food
import com.mvukosav.studenthub.domain.models.FoodCategory
import com.mvukosav.studenthub.features.food.FoodRowRecyclerViewAdapter
import com.mvukosav.studenthub.features.food.OnMealClickListener
import com.mvukosav.studenthub.utils.SimpleHorizontalItemDecoration

class FoodRecyclerViewAdapter(
    val context: Context,
    private val mealClickListener: OnMealClickListener
) :
    RecyclerView.Adapter<FoodViewHolder>() {

    private var dailyMenu: List<Food> = listOf()
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflatedBinding: LayoutFoodByCategoriesBinding =
            LayoutFoodByCategoriesBinding.inflate(layoutInflater, parent, false)
        return FoodViewHolder(inflatedBinding, mealClickListener)
    }

    override fun getItemCount(): Int = dailyMenu.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(dailyMenu[position])
    }

    fun swapList(newDaily: List<Food>) {
        val diffCallback = FoodDiffCallback(this.dailyMenu, newDaily)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        this.dailyMenu = newDaily
        notifyDataSetChanged()
//        diffResult.dispatchUpdatesTo(this)
    }

}

class FoodViewHolder(
    private val binding: LayoutFoodByCategoriesBinding,
    private val onMealClickListener: OnMealClickListener
) :
    RecyclerView.ViewHolder(binding.root) {
    private val simpleHorizontalItemDecoration =
        SimpleHorizontalItemDecoration(binding.root.context, SPACE, START)
    val context: Context = itemView.context

    init {
        binding.recyclerViewRowFood.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            addItemDecoration(simpleHorizontalItemDecoration)

        }
    }

    fun bind(model: Food) {
        binding.foodCategory.text = model.foodCategory.title

        val isMenuItems = model.foodCategory == FoodCategory.MENUS

        binding.recyclerViewRowFood.adapter =
            FoodRowRecyclerViewAdapter(
                context,
                model.MealList,
                isMenuItems,
                mealClickListener = onMealClickListener
            )
    }

    companion object {
        private const val SPACE = 10
        private const val START = 20
    }

}

class FoodDiffCallback(private val oldItem: List<Food>, private val newItem: List<Food>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldItem[oldItemPosition] ?: return false
        val newItem = newItem[newItemPosition] ?: return false

        return oldItem.foodCategory == newItem.foodCategory
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldItem[oldItemPosition] ?: return false
        val newItem = newItem[newItemPosition] ?: return false

        return oldItem == newItem

    }
}
