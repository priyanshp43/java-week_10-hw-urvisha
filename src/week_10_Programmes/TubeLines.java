package week_10_Programmes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class TubeLines {
    public static void main(String[] args) {

        //  Create a HashMap to store station names and their corresponding tube lines
        HashMap<String, HashSet<String>> stationsMap = new HashMap<>();

        //Add Zone 1 stations and their respective lines addStation
        addStation(stationsMap, "Baker Street", "Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan");
        addStation(stationsMap, "Oxford Circus", "Bakerloo", "Central", "Victoria");
        addStation(stationsMap, "King's Cross St Pancras", "Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria");
        addStation(stationsMap, "Liverpool Street", "Central", "Circle", "Hammersmith & City", "Metropolitan");
        addStation(stationsMap, "Green Park", "Jubilee", "Piccadilly", "Victoria");
        addStation(stationsMap, "Victoria", "Circle", "District", "Victoria");
        addStation(stationsMap, "Piccadilly Circus", "Bakerloo", "Piccadilly");
        addStation(stationsMap, "Leicester Square", "Northern", "Piccadilly");
        addStation(stationsMap, "Charing Cross", "Bakerloo", "Northern");
        addStation(stationsMap, "Bank", "Central", "Northern", "Waterloo & City");
        addStation(stationsMap, "Waterloo", "Bakerloo", "Jubilee", "Northern", "Waterloo & City");

        // Get user input for station name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Zone 1 station name: ");
        String stationName = scanner.nextLine();

        // Print the lines that pass through the given station
        if (stationsMap.containsKey(stationName)) {
            Set<String> lines = stationsMap.get(stationName);
            System.out.println("Lines that pass through " + stationName + ": " + lines);
        } else {
            System.out.println("Station not found in Zone 1.");
        }
        scanner.close();
    }

    private static void addStation(HashMap<String, HashSet<String>> stationsMap, String stationName, String... lines) {
        HashSet<String> linesSet = new HashSet<>();
        for (String line : lines) {
            linesSet.add(line);
        }
        stationsMap.put(stationName, linesSet);
    }

}

