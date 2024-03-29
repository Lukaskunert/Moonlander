package src.cz.educanet.praha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter altitude: ");
        int altitude = sc.nextInt();
        System.out.println("Enter velocity: ");
        int velocity = sc.nextInt();
        ILanderControls controls = new BurnedFuel();
        try {
            final LunarLanding lander;
            lander = new LunarLanding(controls, altitude, velocity);
            System.out.println("Fuel filled amount: " + lander.land());
            System.out.println("Fuel amount (sec): " + controls.getSecondsOfFuelBurn(altitude, velocity));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
