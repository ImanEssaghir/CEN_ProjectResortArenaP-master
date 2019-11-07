package ResortArenaPalace;

import java.util.Date;

public class Guest {

  private String name;
  private String lastName;
  private int noPeople;
  private int noRooms;
  private Date checkIn;
  private Date checkOut;
  private String roomType;
  private String password;
  private String email;

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

  public Date getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(Date checkIn) {
    this.checkIn = checkIn;
  }

  public Date getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(Date checkOut) {
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

}
