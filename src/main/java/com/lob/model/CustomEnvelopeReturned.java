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
 * A nested custom envelope object containing more information about the custom envelope used or &#x60;null&#x60; if a custom envelope was not used.
 */
@ApiModel(description = "A nested custom envelope object containing more information about the custom envelope used or `null` if a custom envelope was not used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomEnvelopeReturned {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * The unique identifier of the custom envelope used.
  * @return id
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The unique identifier of the custom envelope used.")
  
  public String getId() {
      return id;
  }
  
  

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  

  private String url;
  /**
  * The url of the envelope asset used.
  * @return url
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The url of the envelope asset used.")
  
  public String getUrl() {
      return url;
  }
  
  

  /**
   * Gets or Sets _object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ENVELOPE("envelope");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";

  @SerializedName(SERIALIZED_NAME_OBJECT)
  

  private ObjectEnum _object = ObjectEnum.ENVELOPE;
  /**
  * Get _object
  * @return _object
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public ObjectEnum getObject() {
      return _object;
  }
  
  


  /*
  public CustomEnvelopeReturned id(String id) {
    
    this.id = id;
    return this;
  }
  */


  public void setId(String id) {
    this.id = id;
  }



  /*
  public CustomEnvelopeReturned url(String url) {
    
    this.url = url;
    return this;
  }
  */


  public void setUrl(String url) {
    this.url = url;
  }



  /*
  public CustomEnvelopeReturned _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEnvelopeReturned customEnvelopeReturned = (CustomEnvelopeReturned) o;
    return Objects.equals(this.id, customEnvelopeReturned.id) &&
        Objects.equals(this.url, customEnvelopeReturned.url) &&
        Objects.equals(this._object, customEnvelopeReturned._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("}");
    return sb.toString();
  }

    public Map<String, Object> toMap() {
      Map<String, Object> localMap = new HashMap<String, Object>();
      localMap.put("id", id);
      localMap.put("url", url);
      localMap.put("object", _object);
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

