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
 * UploadFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadFile {
  /**
   * Gets or Sets message
   */
  @JsonAdapter(MessageEnum.Adapter.class)
  public enum MessageEnum {
    FILE_UPLOADED_SUCCESSFULLY("File uploaded successfully");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageEnum fromValue(String value) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)


  private MessageEnum message = MessageEnum.FILE_UPLOADED_SUCCESSFULLY;
  /**
  * Get message
  * @return message
  **/

  @javax.annotation.Nonnull

  @ApiModelProperty(required = true, value = "")

  public MessageEnum getMessage() {
      return message;
  }



  public static final String SERIALIZED_NAME_FILENAME = "filename";

  @SerializedName(SERIALIZED_NAME_FILENAME)


  private String filename;
  /**
  * Get filename
  * @return filename
  **/

  @javax.annotation.Nonnull

  @ApiModelProperty(required = true, value = "")

  public String getFilename() {
      return filename;
  }




  /*
  public UploadFile message(MessageEnum message) {

    this.message = message;
    return this;
  }
  */


  public void setMessage(MessageEnum message) {
    this.message = message;
  }





  /*
  public UploadFile filename(String filename) {

    this.filename = filename;
    return this;
  }
  */


  public void setFilename(String filename) {
    this.filename = filename;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFile uploadFile = (UploadFile) o;
    return Objects.equals(this.message, uploadFile.message) &&
        Objects.equals(this.filename, uploadFile.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

