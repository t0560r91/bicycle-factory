import spec.PartSpecRegistry
import facility.{BicycleFactory, BicycleAssembly, BicycleInspector}
import parts.PartsContainer
import bicycle.Bicycle
import person.Cyclist

object Main {
    def main (args: Array[String]): Unit = {
        
        val factory1 = new BicycleFactory() //todo(skim) Implement AdultBicycleSpec vs KidsBicycleSpec.
        val assembly1 = new BicycleAssembly()
        val inspector1 = new BicycleInspector()
        val cyclist1 = new Cyclist("Seho Kim", 30)

        val parts: PartsContainer = factory1.produceParts(new PartSpecRegistry())


        // todo (skim) Implement assemble methods!!!
        val bicycle1: Bicycle = assembly1.assembleBicycle(parts)

        
        // if (inspector1.inspectBicycle(bicycle1)) cyclist1.rideBicycle(bicycle1) else cyclist1.complains()        
    }
}
