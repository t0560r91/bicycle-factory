package spec


class PartSpecRegistry {
    var frameSpec = new FrameSpec()
    var handleSpec = new HandleSpec()
    var seatSpec = new SeatSpec()
    var frontWheelSpec = new FrontWheelSpec()
    var rearWheelSpec = new RearWheelSpec()
    var frontSporacketSpec = new FrontSporacketSpec()
    var rearSporacketSpec = new RearSporacketSpec()
    var pedalSpec = new PedalSpec()
    var brakeLeverSpec = new BrakeLeverSpec()
    var rearBrakeSpec = new RearBrakeSpec()
    var chainSpec = new ChainSpec()
}

trait PartSpec {
    val depth: Float
}

trait WheelSpec extends PartSpec {
    val diameter: Float
    val depth: Float
}

trait SporacketSpec extends PartSpec {
    val diameter: Float
    val depth: Float
}

// case class BicycleModel(val name: String = "Adult") 


class FrameSpec extends PartSpec {
    val width: Float = 5
    val height: Float = 5
    val depth: Float = 5
}

class HandleSpec extends PartSpec {
    val width: Float = 5
    val height: Float = 5
    val depth: Float = 5
}

class SeatSpec extends PartSpec {
    val width: Float = 5
    val height: Float = 5
    val depth: Float = 5
}

class FrontWheelSpec extends WheelSpec {
    val diameter: Float = 5
    val depth: Float = 5
}

class RearWheelSpec extends WheelSpec {
    val diameter: Float = 5
    val depth: Float = 5
}


class FrontSporacketSpec extends SporacketSpec {
    val diameter: Float = 3
    val depth: Float = 3
}

class RearSporacketSpec extends SporacketSpec {
    val diameter: Float = 4
    val depth: Float = 4
}

class ChainSpec extends PartSpec {
    val length: Float = 5
    val depth: Float = 5
}

class PedalSpec extends PartSpec {
    val width: Float = 5
    val height: Float = 5
    val depth: Float = 5
}

class BrakeLeverSpec extends PartSpec {
    val width: Float = 5
    val height: Float = 5
    val depth: Float = 5
}

class RearBrakeSpec extends PartSpec {
    val width: Float = 5
    val height: Float = 5
    val depth: Float = 5
}

