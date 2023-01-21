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
 * SortBy1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SortBy1 {
  /**
   * Gets or Sets dateCreated
   */
  @JsonAdapter(DateCreatedEnum.Adapter.class)
  public enum DateCreatedEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DateCreatedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DateCreatedEnum fromValue(String value) {
      for (DateCreatedEnum b : DateCreatedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DateCreatedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DateCreatedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DateCreatedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DateCreatedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";

  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  

  private DateCreatedEnum dateCreated;
  /**
  * Get dateCreated
  * @return dateCreated
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public DateCreatedEnum getDateCreated() {
      return dateCreated;
  }
  
  

  /**
   * Gets or Sets sendDate
   */
  @JsonAdapter(SendDateEnum.Adapter.class)
  public enum SendDateEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SendDateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendDateEnum fromValue(String value) {
      for (SendDateEnum b : SendDateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SendDateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendDateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendDateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendDateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";

  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  

  private SendDateEnum sendDate;
  /**
  * Get sendDate
  * @return sendDate
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public SendDateEnum getSendDate() {
      return sendDate;
  }
  
  


  /*
  public SortBy1 dateCreated(DateCreatedEnum dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }
  */


  public void setDateCreated(DateCreatedEnum dateCreated) {
    this.dateCreated = dateCreated;
  }



  /*
  public SortBy1 sendDate(SendDateEnum sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }
  */


  public void setSendDate(SendDateEnum sendDate) {
    this.sendDate = sendDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortBy1 sortBy1 = (SortBy1) o;
    return Objects.equals(this.dateCreated, sortBy1.dateCreated) &&
        Objects.equals(this.sendDate, sortBy1.sendDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, sendDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

    public Map<String, Object> toMap() {
      Map<String, Object> localMap = new HashMap<String, Object>();
      localMap.put("date_created", dateCreated);
      localMap.put("send_date", sendDate);
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

