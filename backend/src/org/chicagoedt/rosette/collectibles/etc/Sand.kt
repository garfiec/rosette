package org.chicagoedt.rosette.collectibles.etc

import org.chicagoedt.rosette.collectibles.Collectible
import org.chicagoedt.rosette.levels.Level
import org.chicagoedt.rosette.robots.RobotPlayer

object Sand: Collectible {
    override val id = 1000
    override val type = Collectible.ItemType.ETC
    override val name = "Sand"
    override val graphic = ""
    override val useQuantity = 5

    override fun use(level: Level, robot: RobotPlayer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}