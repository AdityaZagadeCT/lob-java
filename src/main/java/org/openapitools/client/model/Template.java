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


package org.openapitools.client.model;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.TemplateVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Template {
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
  
  

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).
  * @return id
  **/
  
  @javax.annotation.Nullable
  
  public String getId() { return id; }

  public void setId (String id) throws IllegalArgumentException {
    if(!id.matches("^tmpl_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid id provided");
    }

    this.id = id;
  }
  
  

  public static final String SERIALIZED_NAME_VERSIONS = "versions";

  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<TemplateVersion> versions = null;
  public List<TemplateVersion> getVersions() {     
    if (this.versions == null) {
      this.versions = new ArrayList<TemplateVersion>();
    }
    return this.versions; 
  }

  public static final String SERIALIZED_NAME_PUBLISHED_VERSION = "published_version";

  @SerializedName(SERIALIZED_NAME_PUBLISHED_VERSION)
  

  private TemplateVersion publishedVersion;
  /**
  * Get publishedVersion
  * @return publishedVersion
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public TemplateVersion getPublishedVersion() {
      return publishedVersion;
  }
  
  

  /**
   * Value is resource type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    TEMPLATE("template");

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
  

  private ObjectEnum _object = ObjectEnum.TEMPLATE;
  /**
  * Value is resource type.
  * @return _object
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Value is resource type.")
  
  public ObjectEnum getObject() {
      return _object;
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

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";

  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  

  private OffsetDateTime dateCreated;
  /**
  * A timestamp in ISO 8601 format of the date the resource was created.
  * @return dateCreated
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A timestamp in ISO 8601 format of the date the resource was created.")
  
  public OffsetDateTime getDateCreated() {
      return dateCreated;
  }
  
  

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";

  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  

  private OffsetDateTime dateModified;
  /**
  * A timestamp in ISO 8601 format of the date the resource was last modified.
  * @return dateModified
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A timestamp in ISO 8601 format of the date the resource was last modified.")
  
  public OffsetDateTime getDateModified() {
      return dateModified;
  }
  
  

  public static final String SERIALIZED_NAME_DELETED = "deleted";

  @SerializedName(SERIALIZED_NAME_DELETED)
  

  private Boolean deleted;
  /**
  * Only returned if the resource has been successfully deleted.
  * @return deleted
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Only returned if the resource has been successfully deleted.")
  
  public Boolean getDeleted() {
      return deleted;
  }
  
  


  /*
  public Template description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }



  /*
  public Template id(String id) {
    
    this.id = id;
    return this;
  }
  */





  /*
  public Template versions(List<TemplateVersion> versions) {
    
    this.versions = versions;
    return this;
  }
  */

  public Template addVersionsItem(TemplateVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<TemplateVersion>();
    }
    this.versions.add(versionsItem);
    return this;
  }


  public void setVersions(List<TemplateVersion> versions) {
    this.versions = versions;
  }



  /*
  public Template publishedVersion(TemplateVersion publishedVersion) {
    
    this.publishedVersion = publishedVersion;
    return this;
  }
  */


  public void setPublishedVersion(TemplateVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
  }



  /*
  public Template _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  /*
  public Template metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }
  */

  public Template putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }



  /*
  public Template dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }
  */


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }



  /*
  public Template dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }
  */


  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }



  /*
  public Template deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }
  */


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.description, template.description) &&
        Objects.equals(this.id, template.id) &&
        Objects.equals(this.versions, template.versions) &&
        Objects.equals(this.publishedVersion, template.publishedVersion) &&
        Objects.equals(this._object, template._object) &&
        Objects.equals(this.metadata, template.metadata) &&
        Objects.equals(this.dateCreated, template.dateCreated) &&
        Objects.equals(this.dateModified, template.dateModified) &&
        Objects.equals(this.deleted, template.deleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, versions, publishedVersion, _object, metadata, dateCreated, dateModified, deleted);
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
