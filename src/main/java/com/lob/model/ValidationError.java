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
import com.lob.model.AnyOfstringinteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
/**
 * ValidationError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValidationError {
  public static final String SERIALIZED_NAME_LOC = "loc";

  @SerializedName(SERIALIZED_NAME_LOC)
  private List<AnyOfstringinteger> loc = new ArrayList<>();

  public static final String SERIALIZED_NAME_MSG = "msg";

  @SerializedName(SERIALIZED_NAME_MSG)
  

  private String msg;
  /**
  * Get msg
  * @return msg
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public String getMsg() {
      return msg;
  }
  
  

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  

  private String type;
  /**
  * Get type
  * @return type
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public String getType() {
      return type;
  }
  
  


  /*
  public ValidationError loc(List<AnyOfstringinteger> loc) {
    
    this.loc = loc;
    return this;
  }
  */

  public ValidationError addLocItem(AnyOfstringinteger locItem) {
    this.loc.add(locItem);
    return this;
  }


  public void setLoc(List<AnyOfstringinteger> loc) {
    this.loc = loc;
  }



  /*
  public ValidationError msg(String msg) {
    
    this.msg = msg;
    return this;
  }
  */


  public void setMsg(String msg) {
    this.msg = msg;
  }



  /*
  public ValidationError type(String type) {
    
    this.type = type;
    return this;
  }
  */


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.loc, validationError.loc) &&
        Objects.equals(this.msg, validationError.msg) &&
        Objects.equals(this.type, validationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loc, msg, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
