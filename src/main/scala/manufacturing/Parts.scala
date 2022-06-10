// Parts classes.
package parts
import spec._

abstract class Part {
    // Unidirectional
    val partsToBeConnected: List[Class[_]]
    var connectedParts: List[Part] = Nil

    def connectTo(part: Part): Unit = {
        // condition
        connectedParts = part :: Nil
    }

    def inspectConnections(): Boolean = {
        for (partClass <- partsToBeConnected) {
            var partConnected: Boolean = false
            for (part <- connectedParts) {
                if (part.getClass().equals(partClass)) partConnected = true else partConnected = false
            }
            // if (!partConnected) throw new Exception("Errosdfsdfr") // todo(skim) Validate error catching mechanism.
        }
        true
    }
}

class Frame(spec: FrameSpec) extends Part {
    val width: Float = spec.width
    val height: Float = spec.height
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List()
}

class Handle(spec: HandleSpec) extends Part {
    val width: Float = spec.width
    val height: Float = spec.height
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[Frame])
}

class BrakeLever(spec: BrakeLeverSpec) extends Part {
    val width: Float = spec.width
    val height: Float = spec.height
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[Handle])
}

class Seat(spec: SeatSpec) extends Part {
    val width: Float = spec.width
    val height: Float = spec.height
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[Frame])
}

class FrontSporacket(spec: FrontSporacketSpec) extends Part {
    val diameter: Float = spec.diameter
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[Frame])
}

class Pedal(spec: PedalSpec) extends Part {
    val width: Float = spec.width
    val height: Float = spec.height
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[FrontSporacket])
}

class FrontWheel(spec: FrontWheelSpec) extends Part {
    val diameter: Float = spec.diameter
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[Frame])
}

class RearWheel(spec: RearWheelSpec) extends Part {
    val diameter: Float = spec.diameter
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[Frame])
}

class RearSporacket(spec: RearSporacketSpec) extends Part {
    val diameter: Float = spec.diameter
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[RearWheel])
}

class RearBrake(spec: RearBrakeSpec) extends Part {
    val width: Float = spec.width
    val height: Float = spec.height
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[RearWheel])
}

class Chain(spec: ChainSpec) extends Part {
    val length: Float = spec.length
    val depth: Float = spec.depth
    val partsToBeConnected: List[Class[_]] = List(classOf[FrontSporacket], classOf[RearSporacket]) 
}