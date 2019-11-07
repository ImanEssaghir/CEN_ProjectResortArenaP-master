package ResortArenaPalace;

import java.util.Date;

public class Guest {

  private String email;
  private String name;
  private String lastName;
  private int noPeople;
  private int noRooms;
  private String checkIn;
  private String checkOut;
  private String roomType;
  private String password;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getNoPeople() {
    return noPeople;
  }

  public void setNoPeople(int noPeople) {
    this.noPeople = noPeople;
  }

  public int getNoRooms() {
    return noRooms;
  }

  public void setNoRooms(int noRooms) {
    this.noRooms = noRooms;
  }

  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }

  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }

  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Guest(String email, String name, String lastName, int noPeople, int noRooms,
      String checkIn, String checkOut, String roomType, String password) {
    this.email = email;
    this.name = name;
    this.lastName = lastName;
    this.noPeople = noPeople;
    this.noRooms = noRooms;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    this.roomType = roomType;
    this.password = password;
  }

}
