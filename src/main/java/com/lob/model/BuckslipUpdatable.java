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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * BuckslipUpdatable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BuckslipUpdatable {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  

  private String description;
  /**
  * Description of the buckslip.
  * @return description
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Description of the buckslip.")
  
  public String getDescription() {
      return description;
  }
  
  

  public static final String SERIALIZED_NAME_AUTO_REORDER = "auto_reorder";

  @SerializedName(SERIALIZED_NAME_AUTO_REORDER)
  

  private Boolean autoReorder;
  /**
  * Allows for auto reordering
  * @return autoReorder
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Allows for auto reordering")
  
  public Boolean getAutoReorder() {
      return autoReorder;
  }
  
  

  public static final String SERIALIZED_NAME_REORDER_QUANTITY = "reorder_quantity";

  @SerializedName(SERIALIZED_NAME_REORDER_QUANTITY)
  

  private BigDecimal reorderQuantity;
  /**
  * The quantity of items to be reordered (only required when auto_reorder is true).
  * minimum: 5000
  * maximum: 10000000
  * @return reorderQuantity
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The quantity of items to be reordered (only required when auto_reorder is true).")
  
  public BigDecimal getReorderQuantity() {
      return reorderQuantity;
  }
  
  


  /*
  public BuckslipUpdatable description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }





  /*
  public BuckslipUpdatable autoReorder(Boolean autoReorder) {
    
    this.autoReorder = autoReorder;
    return this;
  }
  */


  public void setAutoReorder(Boolean autoReorder) {
    this.autoReorder = autoReorder;
  }





  /*
  public BuckslipUpdatable reorderQuantity(BigDecimal reorderQuantity) {
    
    this.reorderQuantity = reorderQuantity;
    return this;
  }
  */


  public void setReorderQuantity(BigDecimal reorderQuantity) {
    this.reorderQuantity = reorderQuantity;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuckslipUpdatable buckslipUpdatable = (BuckslipUpdatable) o;
    return Objects.equals(this.description, buckslipUpdatable.description) &&
        Objects.equals(this.autoReorder, buckslipUpdatable.autoReorder) &&
        Objects.equals(this.reorderQuantity, buckslipUpdatable.reorderQuantity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, autoReorder, reorderQuantity);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    autoReorder: ").append(toIndentedString(autoReorder)).append("\n");
    sb.append("    reorderQuantity: ").append(toIndentedString(reorderQuantity)).append("\n");
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

