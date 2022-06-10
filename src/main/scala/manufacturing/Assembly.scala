package facility

import bicycle.Bicycle
import parts.{PartsContainer, Part}

class BicycleAssembly() {

    private def _assemble(bicycle: Bicycle, main_part: Part, attachment_part: Part): Unit = {
        main_part.connectTo(attachment_part)
        bicycle.__dict__[partString] = attachment_part
    }

    def assembleBicycle(parts: PartsContainer): Bicycle = {
        val bicycle = new Bicycle(parts.frame)
        _assemble(bicycle, bicycle.frame, parts.handle)
        _assemble(bicycle, bicycle.handle, parts.brakeLever)
        _assemble(bicycle, bicycle.frame, parts.frontSporacket)
        _assemble(bicycle, bicycle.frontSporacket, parts.pedal)
        _assemble(bicycle, bicycle.frame, parts.rearWheel)
        _assemble(bicycle, bicycle.rearWheel, parts.rearSporacket)
        _assemble(bicycle, bicycle.rearWheel, parts.rearBrake)
        _assemble(bicycle, bicycle.frontSporacket, parts.chain)
        _assemble(bicycle, bicycle.rearSporacket, bicycle.chain)
        _assemble(bicycle, bicycle.frame, parts.frontWheel)
        bicycle
    }
}
        
