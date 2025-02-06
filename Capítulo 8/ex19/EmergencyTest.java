package ex19;

import java.time.LocalDateTime;

public class EmergencyTest {
    public static void main(String[] args) {
       String[] respondingUnits = {"Police", "Ambulance"};
       Emergency emergency = new Emergency("Jane Doe", "123-456-7890", "123 Main St, City, State",
                                           LocalDateTime.now(), "Medical", "Heart Attack", respondingUnits,
                                           "High", 101);
       emergency.displayEmergencyDetails();
    }
 }
 