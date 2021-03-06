package org.chicagoedt.rosette.collectibles

/**
 * A single inventory of collectible items
 */
class ItemInventory {
    private val inventory = HashMap<Int, Int>() // <ItemID, Count>

    /**
     * Adds an item to inventory
     * @param itemID The item to add by its itemID
     */
    fun addItem(itemID: Int) {
        // See if item exists, if exists, increment item counter. Otherwise, add it to the list
        if (inventory.containsKey(itemID)) {
            val oldCount = inventory[itemID]!!
            inventory[itemID] = oldCount + 1
        }
        else
            inventory[itemID] = 1
    }

    /**
     * Adds a list of items to inventory
     * @param items An array of itemID to add to inventory
     */
    fun addItems(items: IntArray) {
        for (item in items) {
            addItem(item)
        }
    }

    /**
     * Removes an item from inventory
     * @param itemID The item to remove by its itemID
     * @return True if remove successful. False if not.
     */
    fun removeItem(itemID: Int): Boolean {
        if (!hasItem(itemID)) return false

        val oldCount = inventory[itemID]!!
        when {
            oldCount == 1 -> inventory.remove(itemID)
            oldCount > 1 -> inventory[itemID] = oldCount - 1
            else -> return false
        }
        return true
    }

    /**
     * Removes a number of a certain item from inventory
     * @param itemID The item to remove by its itemID
     * @param quantity The quantity of the specified item to remove
     * @return True if remove successful. False if not.
     */
    fun removeItem(itemID: Int, quantity: Int): Boolean {
        // Item exists?
        if (!hasItem(itemID)) return false

        // Has enough items to remove?
        if (itemQuantity(itemID) < quantity) return false

        // Remove that much of the item
        val oldCount = inventory[itemID]!!
        inventory[itemID] = oldCount - quantity

        if (inventory[itemID] == 0) inventory.remove(itemID)

        return true
    }

    /**
     * Checks if an item exists in inventory
     * @param itemID The item to check by its itemID
     * @return True if item exists. False if not.
     */
    fun hasItem(itemId: Int): Boolean = inventory.containsKey(itemId)

    /**
     * Gets the number of the specified item found in inventory
     * @param itemID The item to check by its itemID
     * @return Quantity of itemID
     */
    fun itemQuantity(itemID: Int): Int = if (hasItem(itemID)) inventory[itemID]!! else 0
}