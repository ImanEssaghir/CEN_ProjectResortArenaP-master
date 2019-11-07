package ResortArenaPalace;

import java.util.Date;

public class EventReservation {

  private String fName;
  private String lName;
  private String email;
  private String password;
  private Date eventDate;
  private int noPeople;
  private String venue; //apply enum?
  private boolean catering;
  private boolean dj;
  private boolean partyPlanner;

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getEventDate() {
    return eventDate;
  }

  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }

  public int getNoPeople() {
    return noPeople;
  }

  public void setNoPeople(int noPeople) {
    this.noPeople = noPeople;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public boolean isCatering() {
    return catering;
  }

  public void setCatering(boolean catering) {
    this.catering = catering;
  }

  public boolean isDj() {
    return dj;
  }

  public void setDj(boolean dj) {
    this.dj = dj;
  }

  public boolean isPartyPlanner() {
    return partyPlanner;
  }

  public void setPartyPlanner(boolean partyPlanner) {
    this.partyPlanner = partyPlanner;
  }

}
