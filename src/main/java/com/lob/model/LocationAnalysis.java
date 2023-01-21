/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> Looking for our [previous documentation](https://lob.github.io/legacy-docs/)? 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lob.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
/**
 * A nested object containing a breakdown of the analysis of a reverse geocoded location.
 */
@ApiModel(description = "A nested object containing a breakdown of the analysis of a reverse geocoded location.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LocationAnalysis {
  public static final String SERIALIZED_NAME_LATITUDE = "latitude";

  @SerializedName(SERIALIZED_NAME_LATITUDE)
  

  private Float latitude;
  /**
  * A positive or negative decimal indicating the geographic latitude of the address.
  * minimum: -90
  * maximum: 90
  * @return latitude
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(required = true, value = "A positive or negative decimal indicating the geographic latitude of the address.")
  
  public Float getLatitude() {
      return latitude;
  }
  
  

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";

  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  

  private Float longitude;
  /**
  * A positive or negative decimal indicating the geographic longitude of the address.
  * minimum: -180
  * maximum: 180
  * @return longitude
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(required = true, value = "A positive or negative decimal indicating the geographic longitude of the address.")
  
  public Float getLongitude() {
      return longitude;
  }
  
  

  public static final String SERIALIZED_NAME_DISTANCE = "distance";

  @SerializedName(SERIALIZED_NAME_DISTANCE)
  

  private Float distance;
  /**
  * The distance from the input location to this exact zip code in miles.
  * @return distance
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The distance from the input location to this exact zip code in miles.")
  
  public Float getDistance() {
      return distance;
  }
  
  


  /*
  public LocationAnalysis latitude(Float latitude) {
    
    this.latitude = latitude;
    return this;
  }
  */


  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }



  /*
  public LocationAnalysis longitude(Float longitude) {
    
    this.longitude = longitude;
    return this;
  }
  */


  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }



  /*
  public LocationAnalysis distance(Float distance) {
    
    this.distance = distance;
    return this;
  }
  */


  public void setDistance(Float distance) {
    this.distance = distance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAnalysis locationAnalysis = (LocationAnalysis) o;
    return Objects.equals(this.latitude, locationAnalysis.latitude) &&
        Objects.equals(this.longitude, locationAnalysis.longitude) &&
        Objects.equals(this.distance, locationAnalysis.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

    public Map<String, Object> toMap() {
      Map<String, Object> localMap = new HashMap<String, Object>();
      localMap.put("latitude", latitude);
      localMap.put("longitude", longitude);
      localMap.put("distance", distance);
      return localMap;
    }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

