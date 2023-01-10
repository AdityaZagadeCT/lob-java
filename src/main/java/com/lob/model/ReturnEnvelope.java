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
 * ReturnEnvelope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReturnEnvelope {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * The unique ID of the Return Envelope
  * @return id
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The unique ID of the Return Envelope")
  
  public String getId() {
      return id;
  }
  
  

  public static final String SERIALIZED_NAME_ALIAS = "alias";

  @SerializedName(SERIALIZED_NAME_ALIAS)
  

  private String alias;
  /**
  * A quick reference name for the Return Envelope
  * @return alias
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A quick reference name for the Return Envelope")
  
  public String getAlias() {
      return alias;
  }
  
  

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  

  private String url;
  /**
  * The url of the  return envelope
  * @return url
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The url of the  return envelope")
  
  public String getUrl() {
      return url;
  }
  
  

  public static final String SERIALIZED_NAME_OBJECT = "object";

  @SerializedName(SERIALIZED_NAME_OBJECT)
  

  private String _object;
  /**
  * Get _object
  * @return _object
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public String getObject() {
      return _object;
  }
  
  


  /*
  public ReturnEnvelope id(String id) {
    
    this.id = id;
    return this;
  }
  */


  public void setId(String id) {
    this.id = id;
  }





  /*
  public ReturnEnvelope alias(String alias) {
    
    this.alias = alias;
    return this;
  }
  */


  public void setAlias(String alias) {
    this.alias = alias;
  }





  /*
  public ReturnEnvelope url(String url) {
    
    this.url = url;
    return this;
  }
  */


  public void setUrl(String url) {
    this.url = url;
  }





  /*
  public ReturnEnvelope _object(String _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(String _object) {
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
    ReturnEnvelope returnEnvelope = (ReturnEnvelope) o;
    return Objects.equals(this.id, returnEnvelope.id) &&
        Objects.equals(this.alias, returnEnvelope.alias) &&
        Objects.equals(this.url, returnEnvelope.url) &&
        Objects.equals(this._object, returnEnvelope._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alias, url, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

