package demo_java;

import java.util.ArrayList;
import java.util.List;

public class CheapestHotelFinder {
    private List<Hotel> hotels;

    public CheapestHotelFinder() {
        hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
// Will compare the cheapest of all hotels and if equal will compare on basis of ratings
    public Hotel findCheapestHotel() {
        Hotel cheapestHotel = null;
        int lowestCost = Integer.MAX_VALUE;

        for (Hotel hotel : hotels) {
            int cost = hotel.calculateCost();
            if (cost < lowestCost) {
                lowestCost = cost;
                cheapestHotel = hotel;
            } else if (cost == lowestCost && hotel.getRating() > (cheapestHotel != null ? cheapestHotel.getRating() : 0)) {
                cheapestHotel = hotel;
            }
        }

        return cheapestHotel;
    }

    public static void main(String[] args) {
        CheapestHotelFinder finder = new CheapestHotelFinder();
// Storing data to the list
        finder.addHotel(new Hotel("Miami Beach", 4, 80, 110, 50, 90));
        finder.addHotel(new Hotel("Miami Downtown", 3, 120, 90, 100, 80));
        finder.addHotel(new Hotel("Miami Midtown", 5, 100, 150, 70, 130));
//Made program scalable to find cheapest hotel or return other condition

        Hotel cheapestHotel = finder.findCheapestHotel();
        if (cheapestHotel != null) {
            System.out.println("Cheapest hotel: " + cheapestHotel.getName());
        } else {
            System.out.println("No suitable hotel found.");
        }
    }
}

