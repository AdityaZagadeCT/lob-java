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
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * A nested object containing a breakdown of each component of a reverse geocoded response.
 */
@ApiModel(description = "A nested object containing a breakdown of each component of a reverse geocoded response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeocodeComponents {
  public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";

  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  

  private String zipCode;
  /**
  * The 5-digit ZIP code
  * @return zipCode
  **/
  
  @javax.annotation.Nonnull
  
  public String getZipCode() { return zipCode; }

  public void setZipCode (String zipCode) throws IllegalArgumentException {
    if(!zipCode.matches("^\\d{5}$")) {
      throw new IllegalArgumentException("Invalid zip_code provided");
    }

    this.zipCode = zipCode;
  }
  
  

  public static final String SERIALIZED_NAME_ZIP_CODE_PLUS4 = "zip_code_plus_4";

  @SerializedName(SERIALIZED_NAME_ZIP_CODE_PLUS4)
  

  private String zipCodePlus4;
  /**
  * Get zipCodePlus4
  * @return zipCodePlus4
  **/
  
  @javax.annotation.Nonnull
  
  public String getZipCodePlus4() { return zipCodePlus4; }

  public void setZipCodePlus4 (String zipCodePlus4) throws IllegalArgumentException {
    if(!zipCodePlus4.matches("^(\\d{4})?$")) {
      throw new IllegalArgumentException("Invalid zip_code_plus_4 provided");
    }

    this.zipCodePlus4 = zipCodePlus4;
  }
  
  


  /*
  public GeocodeComponents zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }
  */





  /*
  public GeocodeComponents zipCodePlus4(String zipCodePlus4) {
    
    this.zipCodePlus4 = zipCodePlus4;
    return this;
  }
  */





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeComponents geocodeComponents = (GeocodeComponents) o;
    return Objects.equals(this.zipCode, geocodeComponents.zipCode) &&
        Objects.equals(this.zipCodePlus4, geocodeComponents.zipCodePlus4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, zipCodePlus4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipCodePlus4: ").append(toIndentedString(zipCodePlus4)).append("\n");
    sb.append("}");
    return sb.toString();
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

