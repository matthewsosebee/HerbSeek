package demo.herbseek.api;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "datarepo")
public class HerbSighting {

  private @Id
  @GeneratedValue Long id;
  private String name;
  private String lat;
  private String lng;
  private String note;
  private String date;

  HerbSighting() {}

  HerbSighting(String name, String lat, String lng, String note, String date) {

    this.name = name;
    this.lat = lat;
    this.lng = lng;
    this.note = note;
    this.date = date;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getLat() {
    return this.lat;
  }

  public String getLng() {
    return this.lng;
  }

  public String getNote() {
    return this.note;
  }

  public String getDate() {
    return this.date;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public void setLng(String lng){
    this.lng = lng;
  }

  public void setNote(String note){
    this.note = note;
  }

  public void setDate(String date){
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof HerbSighting))
      return false;
    HerbSighting herb = (HerbSighting) o;
    return Objects.equals(this.id, herb.id) && Objects.equals(this.name, herb.name)
        && Objects.equals(this.lat, herb.lat) && Objects.equals(this.lng, herb.lng) 
        && Objects.equals(this.note, herb.note) && Objects.equals(this.date, herb.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.lat, this.lng, this.note, this.date);
  }

  @Override
  public String toString() {
    return "HerbSight{" + "id=" + this.id + ", name='" + this.name + '\'' + ", lat='" + this.lat + '\'' + 
    '\'' + ", lng='" + this.lng + '\'' + ", note='" + this.note + '\'' + ", date='" + this.date + '\'' + '}';
  }
}
