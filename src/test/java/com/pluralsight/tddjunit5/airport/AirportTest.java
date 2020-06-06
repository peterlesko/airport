package com.pluralsight.tddjunit5.airport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @Test
    public void testAirport() {

        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger mike = new Passenger("Mike", false);
        Passenger john = new Passenger("John", true);

        assertEquals(true, economyFlight.addPassenger(john));
        assertEquals(false, economyFlight.removePassenger(john));
        assertEquals(true, businessFlight.addPassenger(john));
        assertEquals(false, businessFlight.removePassenger(john));

        assertEquals(true, economyFlight.addPassenger(mike));
        assertEquals(true, economyFlight.removePassenger(mike));
        assertEquals(false, businessFlight.addPassenger(mike));
        assertEquals(false, businessFlight.removePassenger(mike));

    }
}
