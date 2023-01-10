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
import com.lob.model.QrCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * PostcardEditable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostcardEditable {
  private boolean isMultipart = false;

  public boolean getIsMultipart() {
    return isMultipart;
  }
  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  
  private String to;
  
  public  String getTo() {
    return to;
  }


  public void setTo(String to) {
    

    this.to = to;
  }
  
  
  
  public void setTo(AddressEditable to) {
    Gson gson = new Gson();

    this.to = gson.toJson(to);
  }
  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  
  private String from;
  
  public  String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    

    this.from = from;
  }
  
  
  
  public void setFrom(AddressEditable from) {
    Gson gson = new Gson();

    this.from = gson.toJson(from);
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
  
  

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  

  private String description;
  /**
  * An internal description that identifies this resource. Must be no longer than 255 characters. 
  * @return description
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "An internal description that identifies this resource. Must be no longer than 255 characters. ")
  
  public String getDescription() {
      return description;
  }
  
  

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;
  public Map<String, String> getMetadata() {
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    return this.metadata;
  }

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
  
  

  public static final String SERIALIZED_NAME_MERGE_VARIABLES = "merge_variables";

  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLES)
  

  private Object mergeVariables;
  /**
  * You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\"variable_name\": \"Harry\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
  * @return mergeVariables
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\"variable_name\": \"Harry\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.")
  
  public Object getMergeVariables() {
      return mergeVariables;
  }
  
  

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";

  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  

  private OffsetDateTime sendDate;
  /**
  * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC.
  * @return sendDate
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC.")
  
  public OffsetDateTime getSendDate() {
      return sendDate;
  }
  
  

  public static final String SERIALIZED_NAME_FRONT = "front";

  @SerializedName(SERIALIZED_NAME_FRONT)
  

  private String front;
  /**
  * The artwork to use as the front of your postcard. 
  * @return front
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The artwork to use as the front of your postcard. ")
  
  public String getFront() {
      return front;
  }
  
  

  public static final String SERIALIZED_NAME_BACK = "back";

  @SerializedName(SERIALIZED_NAME_BACK)
  

  private String back;
  /**
  * The artwork to use as the back of your postcard. 
  * @return back
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The artwork to use as the back of your postcard. ")
  
  public String getBack() {
      return back;
  }
  
  

  public static final String SERIALIZED_NAME_BILLING_GROUP_ID = "billing_group_id";

  @SerializedName(SERIALIZED_NAME_BILLING_GROUP_ID)
  

  private String billingGroupId;
  /**
  * An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information.
  * @return billingGroupId
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information.")
  
  public String getBillingGroupId() {
      return billingGroupId;
  }
  
  

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";

  @SerializedName(SERIALIZED_NAME_QR_CODE)
  

  private QrCode qrCode;
  /**
  * Get qrCode
  * @return qrCode
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public QrCode getQrCode() {
      return qrCode;
  }
  
  


  /*
  public PostcardEditable to(Object to) {
    
    this.to = to;
    return this;
  }
  */





  /*
  public PostcardEditable from(Object from) {
    
    this.from = from;
    return this;
  }
  */





  /*
  public PostcardEditable size(PostcardSize size) {
    
    this.size = size;
    return this;
  }
  */


  public void setSize(PostcardSize size) {
    this.size = size;
  }





  /*
  public PostcardEditable description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }





  /*
  public PostcardEditable metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }
  */

  public PostcardEditable putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }





  /*
  public PostcardEditable mailType(MailType mailType) {
    
    this.mailType = mailType;
    return this;
  }
  */


  public void setMailType(MailType mailType) {
    this.mailType = mailType;
  }





  /*
  public PostcardEditable mergeVariables(Object mergeVariables) {
    
    this.mergeVariables = mergeVariables;
    return this;
  }
  */


  public void setMergeVariables(Object mergeVariables) {
    this.mergeVariables = mergeVariables;
  }





  /*
  public PostcardEditable sendDate(OffsetDateTime sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }
  */


  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }





  /*
  public PostcardEditable front(String front) {
    
    this.front = front;
    return this;
  }
  */


  public void setFront(String front) {
    this.front = front;
  }

  public void setFront (File front) {
    isMultipart = true;
    this.front = front.getPath();
  }




  /*
  public PostcardEditable back(String back) {
    
    this.back = back;
    return this;
  }
  */


  public void setBack(String back) {
    this.back = back;
  }

  public void setBack (File back) {
    isMultipart = true;
    this.back = back.getPath();
  }




  /*
  public PostcardEditable billingGroupId(String billingGroupId) {
    
    this.billingGroupId = billingGroupId;
    return this;
  }
  */


  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }





  /*
  public PostcardEditable qrCode(QrCode qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }
  */


  public void setQrCode(QrCode qrCode) {
    this.qrCode = qrCode;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostcardEditable postcardEditable = (PostcardEditable) o;
    return Objects.equals(this.to, postcardEditable.to) &&
        Objects.equals(this.from, postcardEditable.from) &&
        Objects.equals(this.size, postcardEditable.size) &&
        Objects.equals(this.description, postcardEditable.description) &&
        Objects.equals(this.metadata, postcardEditable.metadata) &&
        Objects.equals(this.mailType, postcardEditable.mailType) &&
        Objects.equals(this.mergeVariables, postcardEditable.mergeVariables) &&
        Objects.equals(this.sendDate, postcardEditable.sendDate) &&
        Objects.equals(this.front, postcardEditable.front) &&
        Objects.equals(this.back, postcardEditable.back) &&
        Objects.equals(this.billingGroupId, postcardEditable.billingGroupId) &&
        Objects.equals(this.qrCode, postcardEditable.qrCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, size, description, metadata, mailType, mergeVariables, sendDate, front, back, billingGroupId, qrCode);
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
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    back: ").append(toIndentedString(back)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
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

