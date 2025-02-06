package ex19;

import java.time.LocalDateTime;

public class Emergency {
   private String callerName;            // Nome do chamador
   private String callerPhoneNumber;     // Número de telefone do chamador
   private String callerLocation;        // Localização do chamador (endereço ou coordenadas)
   private LocalDateTime reportDateTime; // Data e hora da emergência
   private String emergencyType;         // Tipo de emergência
   private String emergencyDescription;  // Descrição da emergência
   private String responseStatus;        // Status da resposta (ex: em andamento, concluído)
   private String[] respondingUnits;     // Unidades respondendo à emergência (ambulância, polícia, bombeiros)
   private String priorityLevel;         // Nível de prioridade (ex: alta, média, baixa)
   private int incidentID;               // ID único do incidente
   private String responseTime;          // Tempo de resposta
   private String incidentStatus;        // Status final da emergência (ex: resolvido, não resolvido)

   // Construtor da classe Emergency
   public Emergency(String callerName, String callerPhoneNumber, String callerLocation,
                    LocalDateTime reportDateTime, String emergencyType, String emergencyDescription,
                    String[] respondingUnits, String priorityLevel, int incidentID) {
      this.callerName = callerName;
      this.callerPhoneNumber = callerPhoneNumber;
      this.callerLocation = callerLocation;
      this.reportDateTime = reportDateTime;
      this.emergencyType = emergencyType;
      this.emergencyDescription = emergencyDescription;
      this.respondingUnits = respondingUnits;
      this.priorityLevel = priorityLevel;
      this.incidentID = incidentID;
      this.responseStatus = "Pending";  // Inicialmente o status da resposta é "Pendência"
      this.incidentStatus = "Ongoing"; // Inicialmente o incidente está em andamento
   }

   // Métodos getters e setters
   public String getCallerName() {
      return callerName;
   }

   public void setCallerName(String callerName) {
      this.callerName = callerName;
   }

   public String getCallerPhoneNumber() {
      return callerPhoneNumber;
   }

   public void setCallerPhoneNumber(String callerPhoneNumber) {
      this.callerPhoneNumber = callerPhoneNumber;
   }

   public String getCallerLocation() {
      return callerLocation;
   }

   public void setCallerLocation(String callerLocation) {
      this.callerLocation = callerLocation;
   }

   public LocalDateTime getReportDateTime() {
      return reportDateTime;
   }

   public void setReportDateTime(LocalDateTime reportDateTime) {
      this.reportDateTime = reportDateTime;
   }

   public String getEmergencyType() {
      return emergencyType;
   }

   public void setEmergencyType(String emergencyType) {
      this.emergencyType = emergencyType;
   }

   public String getEmergencyDescription() {
      return emergencyDescription;
   }

   public void setEmergencyDescription(String emergencyDescription) {
      this.emergencyDescription = emergencyDescription;
   }

   public String getResponseStatus() {
      return responseStatus;
   }

   public void setResponseStatus(String responseStatus) {
      this.responseStatus = responseStatus;
   }

   public String[] getRespondingUnits() {
      return respondingUnits;
   }

   public void setRespondingUnits(String[] respondingUnits) {
      this.respondingUnits = respondingUnits;
   }

   public String getPriorityLevel() {
      return priorityLevel;
   }

   public void setPriorityLevel(String priorityLevel) {
      this.priorityLevel = priorityLevel;
   }

   public int getIncidentID() {
      return incidentID;
   }

   public void setIncidentID(int incidentID) {
      this.incidentID = incidentID;
   }

   public String getResponseTime() {
      return responseTime;
   }

   public void setResponseTime(String responseTime) {
      this.responseTime = responseTime;
   }

   public String getIncidentStatus() {
      return incidentStatus;
   }

   public void setIncidentStatus(String incidentStatus) {
      this.incidentStatus = incidentStatus;
   }

   // Método para exibir informações do incidente
   public void displayEmergencyDetails() {
      System.out.println("Emergency ID: " + incidentID);
      System.out.println("Caller Name: " + callerName);
      System.out.println("Caller Phone: " + callerPhoneNumber);
      System.out.println("Location: " + callerLocation);
      System.out.println("Report Time: " + reportDateTime);
      System.out.println("Emergency Type: " + emergencyType);
      System.out.println("Description: " + emergencyDescription);
      System.out.println("Response Units: " + String.join(", ", respondingUnits));
      System.out.println("Priority Level: " + priorityLevel);
      System.out.println("Response Status: " + responseStatus);
      System.out.println("Incident Status: " + incidentStatus);
      System.out.println("Response Time: " + responseTime);
   }
}