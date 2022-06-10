package bicycle
import parts._

class Bicycle(val frame: Frame) {
    var isComplete = false
    var isInspected = false

    var handle: Handle = null
    var seat: Seat = null
    var frontWheel: FrontWheel = null
    var rearWheel: RearWheel = null
    var frontSporacket: FrontSporacket = null
    var rearSporacket: RearSporacket = null
    var pedal: Pedal = null
    var brakeLever: BrakeLever = null
    var RearBrake: RearBrake = null
    var chain: Chain = null
}