public class Flight {
    private String flightNumber;
    private DateTime departureDateTime;
    private DateTime arrivalDateTime;
    private Airline airline;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Pilot firstPilot;
    private Pilot secondPilot;
    private Airplane airplane;
    private Seat[] seats;

    public Flight(
        String flightNumber, 
        DateTime departureDateTime,
        DateTime arrivalDateTime, 
        Airline airline, 
        Airport departureAirport, 
        Airport arrivalAirport, 
        Pilot firstPilot, 
        Pilot secondPilot, 
        Airplane airplane, 
        Seat[] seats
    ){
        this.flightNumber = flightNumber;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.firstPilot = firstPilot;
        this.secondPilot = secondPilot;
        this.airplane = airplane;
        this.seats = seats;

    }

    public String getFlightNumber() {...}

    public void setFlightNumber(String flightNumber) {...}

    public DateTime getDepartureDateTime() {...}

    public void setDepartureDateTime(DateTime departureDateTime) {...}

    public DateTime getArrivalDateTime() {...}

    public void setArrivalDateTime(DateTime arrivalDateTime) {...}
    
    public Airline getAirline() {...}

    public void setAirline(Airline airline) {...}

    public Airport getDepartureAirport() {...}

    public void setDepartureAirport(Airport departureAirport) {...}

    public Airport getArrivalAirport() {...}

    public void setArrivalAirport(Airport arrivalAirport){...}

    public Pilot getFirstPilot() {...}

    public void setFirstPilot(Pilot firstPilot) {...}

    public Pilot getSecondPilot() {...}

    public void setSecondPilot(Pilot secondPilot) {...}

    public Airplane getAirplane() {...}

    public void setAirplane(Airplane airplane) {...}

    public Seat[] getSeats() {...}

    public void setSeats(List<Seat> seats) {...}

    public void addSeat(Seat seat) {...}

    public void removeSeat(Seat seat) {...}
}

public class Airline {
    private String airlineName;
    private List<Flight> flights;
    private List<Pilot> pilots;

    public Airline(String airlineName, List<Flight> flights, List<Pilot> pilots){
        this.airlineName = airlineName;
        this.flights = flights;
        this.pilots = pilots;
    }

    public List<Flight> getFlights(){...}

    public void setFlights(List<Flight> flights){...}

    public List<Pilot> getPilots(){...}

    public void setPilots(List<Pilot> pilots){...}

    public String getAirlineName() {...}

    public void setAirlineName(){...}
}

public class Airport {
    private String airportCode;
    private String city;

    public Airport(String airportCode, String city){
        this.airportCode = airportCode;
        this.city = city
    }

    public String getAirportCode() {...}

    public void setAirportCode(String airportCode){...}

    public String getCity() {...}

    public void setCity(String city) {...}
}

public class Pilot {
    private String name;
    private String employeeID;
    private Airline airline;

    public Pilot(String name, String employeeID, Airline airline){
        this.name = name;
        this.employeeID = employeeID;
        this.airline = airline
    }

    public String getName() {...}

    public void setName(String name) {...}

    public String getEmployeeID() {...}

    public void setEmployeeID(String employeeID) {...}

    public Airline getAirline() {...}

    public void setAirline(Airline airline) {...}

}

public class Airplane {
    private String airplaneNumber;
    private int numberOfSeats;
    
    public Airplane(String airplaneNumber, int numberOfSeats){
        this.airplaneNumber = airplaneNumber;
        this.numberOfSeats = numberOfSeats;    
    }

    public String getAirplaneNumber() {...}

    public void setAirplaneNumber(String airplaneNumber) {...}

    public int getNumberOfSeats() {...}

    public void setNumberOfSeats(int numberOfSeats) {...}
}

public class Seat {
    private String rowNumber;
    private String position;
    private Airplane airplane;

    public Seat(String rowNumber, String position, Airplane airplane){
        this.rowNumber = rowNumber;
        this.position = position;
        this.airplane = airplane;
    }

    public String getRowNumber() {...}

    public void setRowNumber(String rowNumber) {...}

    public String getPosition() {...}

    public void setPosition(String position) {...}

    public Airplane getAirplane() {...}

    public void setAirplane(Airplane airplane) {...}

}

public class Passenger {
    private char name;
    private char phone;
    private char email;
    private Flight flight;
    private Seat seat;
    
    public Passenger(char name, char phone, char email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    } 
}