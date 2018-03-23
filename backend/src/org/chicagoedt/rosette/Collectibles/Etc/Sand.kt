package org.chicagoedt.rosette.Collectibles.Etc

import org.chicagoedt.rosette.Collectibles.Collectible
import org.chicagoedt.rosette.Levels.Level
import org.chicagoedt.rosette.Robots.RobotPlayer

class Sand: Collectible {
    override val id = 1000
    override val type = Collectible.ItemType.ETC
    override val name = "Sand"
    override val graphic = ""
    override val minUseQuantity = 5

    override fun use(level: Level, robot: RobotPlayer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}