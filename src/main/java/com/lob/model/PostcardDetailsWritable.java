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
import com.lob.model.MailType;
import com.lob.model.PostcardSize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * Properties that the postcards in your Creative should have.
 */
@ApiModel(description = "Properties that the postcards in your Creative should have.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostcardDetailsWritable {
  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";

  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  

  private MailType mailType = MailType.FIRST_CLASS;
  /**
  * Get mailType
  * @return mailType
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public MailType getMailType() {
      return mailType;
  }
  
  

  public static final String SERIALIZED_NAME_SIZE = "size";

  @SerializedName(SERIALIZED_NAME_SIZE)
  

  private PostcardSize size = PostcardSize._4X6;
  /**
  * Get size
  * @return size
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public PostcardSize getSize() {
      return size;
  }
  
  


  /*
  public PostcardDetailsWritable mailType(MailType mailType) {
    
    this.mailType = mailType;
    return this;
  }
  */


  public void setMailType(MailType mailType) {
    this.mailType = mailType;
  }





  /*
  public PostcardDetailsWritable size(PostcardSize size) {
    
    this.size = size;
    return this;
  }
  */


  public void setSize(PostcardSize size) {
    this.size = size;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostcardDetailsWritable postcardDetailsWritable = (PostcardDetailsWritable) o;
    return Objects.equals(this.mailType, postcardDetailsWritable.mailType) &&
        Objects.equals(this.size, postcardDetailsWritable.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailType, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

