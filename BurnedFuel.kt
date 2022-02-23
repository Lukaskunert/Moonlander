package src.cz.educanet.praha;

class BurnedFuel : ILanderControls {
    override fun getSecondsOfFuelBurn(altitude: Int, velocity: Int): Int {
        return altitude / velocity
    }
}
