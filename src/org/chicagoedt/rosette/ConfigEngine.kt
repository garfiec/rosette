package org.chicagoedt.rosette


fun getRobots() : HashMap<String, Robot>{
    val robots = HashMap<String, Robot>()

    val surus = Robot("Surus", "", 1, 1)
    val hushpuppy = Robot("Hushpuppy", "", 1, 1)

    robots[surus.name] = surus
    robots[hushpuppy.name] = hushpuppy

    return robots
}

fun getLevels() : HashMap<String, Level>{
    val levels = HashMap<String, Level>()

    val robotPlayer1 = RobotPlayer("Surus",5,5, RobotOrientation.DIRECTION_UP)
    val robotPlayer2 = RobotPlayer("Hushpuppy", 3, 3, RobotOrientation.DIRECTION_UP)

    val list1 = HashMap<String, RobotPlayer>()
    val list2 = HashMap<String, RobotPlayer>()
    list1[robotPlayer1.name] = robotPlayer1
    list1[robotPlayer2.name] = robotPlayer2
    list2[robotPlayer2.name] = robotPlayer2

    val level1 = Level(LevelProperties("Level 1", 0, 10, 15), list1, arrayListOf("Surus", "Hushpuppy"))
    val level2 = Level(LevelProperties("Level 2", 0, 14, 19), list2, arrayListOf("Hushpuppy"))

    levels[level1.properties.name] = level1
    levels[level2.properties.name] = level2

    return levels
}

fun getLevelOrder() : ArrayList<String>{
    return arrayListOf("Level 1","Level 2")
}
