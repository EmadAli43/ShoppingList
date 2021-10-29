package emad.android.shoppinglist.ui.shoppinglist

import emad.android.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}
