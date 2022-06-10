package facility

import spec.PartSpecRegistry
import parts._


class BicycleFactory() {
    def produceParts(partSpecs: PartSpecRegistry): PartsContainer = {
        val parts = new PartsContainer()
        parts.frame = new Frame(partSpecs.frameSpec)
        parts.handle = new Handle(partSpecs.handleSpec)
        parts.seat = new Seat(partSpecs.seatSpec)
        parts.frontWheel = new FrontWheel(partSpecs.frontWheelSpec)
        parts.rearWheel = new RearWheel(partSpecs.rearWheelSpec)
        parts.frontSporacket = new FrontSporacket(partSpecs.frontSporacketSpec)
        parts.rearSporacket = new RearSporacket(partSpecs.rearSporacketSpec)
        parts.pedal = new Pedal(partSpecs.pedalSpec)
        parts.brakeLever = new BrakeLever(partSpecs.brakeLeverSpec)
        parts.rearBrake = new RearBrake(partSpecs.rearBrakeSpec)
        parts.chain = new Chain(partSpecs.chainSpec)
        parts
    }
}


