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
 * TrackingEventDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrackingEventDetails {
  /**
   * Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event: * &#x60;package_accepted&#x60; - Package has been accepted into the carrier network for delivery. * &#x60;package_arrived&#x60; - Package has arrived at an intermediate location in the carrier network. * &#x60;package_departed&#x60; - Package has departed from an intermediate location in the carrier network. * &#x60;package_processing&#x60; - Package is processing at an intermediate location in the carrier network. * &#x60;package_processed&#x60; - Package has been processed at an intermediate location. * &#x60;package_in_local_area&#x60; - Package is at a location near the end destination. * &#x60;delivery_scheduled&#x60; - Package is scheduled for delivery. * &#x60;out_for_delivery&#x60; - Package is out for delivery. * &#x60;pickup_available&#x60; - Package is available for pickup at carrier location. * &#x60;delivered&#x60; - Package has been delivered. * &#x60;package_forwarded&#x60; - Package has been forwarded. * &#x60;returned_to_sender&#x60; - Package is to be returned to sender. * &#x60;address_issue&#x60; - Address information is incorrect. Contact carrier to ensure delivery. * &#x60;contact_carrier&#x60; - Contact the carrier for more information. * &#x60;delayed&#x60; - Delivery of package is delayed. * &#x60;delivery_attempted&#x60; - Delivery of package has been attempted. Contact carrier to ensure delivery. * &#x60;delivery_rescheduled&#x60; - Delivery of package has been rescheduled. * &#x60;location_inaccessible&#x60; - Delivery location inaccessible to carrier. Contact carrier to ensure delivery. * &#x60;notice_left&#x60; - Carrier left notice during attempted delivery. Follow carrier instructions on notice. * &#x60;package_damaged&#x60; - Package has been damaged. Contact carrier for more details. * &#x60;package_disposed&#x60; - Package has been disposed. * &#x60;package_held&#x60; - Package held at carrier location. Contact carrier for more details. * &#x60;package_lost&#x60; - Package has been lost. Contact carrier for more details. * &#x60;package_unclaimed&#x60; - Package is unclaimed. * &#x60;package_undeliverable&#x60; - Package is not able to be delivered. * &#x60;reschedule_delivery&#x60; - Contact carrier to reschedule delivery. * &#x60;other&#x60; - Unrecognized carrier status. 
   */
  @JsonAdapter(EventEnum.Adapter.class)
  public enum EventEnum {
    PACKAGE_ACCEPTED("package_accepted"),
    
    PACKAGE_ARRIVED("package_arrived"),
    
    PACKAGE_DEPARTED("package_departed"),
    
    PACKAGE_PROCESSING("package_processing"),
    
    PACKAGE_PROCESSED("package_processed"),
    
    PACKAGE_IN_LOCAL_AREA("package_in_local_area"),
    
    DELIVERY_SCHEDULED("delivery_scheduled"),
    
    OUT_FOR_DELIVERY("out_for_delivery"),
    
    PICKUP_AVAILABLE("pickup_available"),
    
    DELIVERED("delivered"),
    
    PACKAGE_FORWARDED("package_forwarded"),
    
    RETURNED_TO_SENDER("returned_to_sender"),
    
    ADDRESS_ISSUE("address_issue"),
    
    CONTACT_CARRIER("contact_carrier"),
    
    DELAYED("delayed"),
    
    DELIVERY_ATTEMPTED("delivery_attempted"),
    
    DELIVERY_RESCHEDULED("delivery_rescheduled"),
    
    LOCATION_INACCESSIBLE("location_inaccessible"),
    
    NOTICE_LEFT("notice_left"),
    
    PACKAGE_DAMAGED("package_damaged"),
    
    PACKAGE_DISPOSED("package_disposed"),
    
    PACKAGE_HELD("package_held"),
    
    PACKAGE_LOST("package_lost"),
    
    PACKAGE_UNCLAIMED("package_unclaimed"),
    
    PACKAGE_UNDELIVERABLE("package_undeliverable"),
    
    RESCHEDULE_DELIVERY("reschedule_delivery"),
    
    OTHER("other");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT = "event";

  @SerializedName(SERIALIZED_NAME_EVENT)
  

  private EventEnum event;
  /**
  * Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event: * `package_accepted` - Package has been accepted into the carrier network for delivery. * `package_arrived` - Package has arrived at an intermediate location in the carrier network. * `package_departed` - Package has departed from an intermediate location in the carrier network. * `package_processing` - Package is processing at an intermediate location in the carrier network. * `package_processed` - Package has been processed at an intermediate location. * `package_in_local_area` - Package is at a location near the end destination. * `delivery_scheduled` - Package is scheduled for delivery. * `out_for_delivery` - Package is out for delivery. * `pickup_available` - Package is available for pickup at carrier location. * `delivered` - Package has been delivered. * `package_forwarded` - Package has been forwarded. * `returned_to_sender` - Package is to be returned to sender. * `address_issue` - Address information is incorrect. Contact carrier to ensure delivery. * `contact_carrier` - Contact the carrier for more information. * `delayed` - Delivery of package is delayed. * `delivery_attempted` - Delivery of package has been attempted. Contact carrier to ensure delivery. * `delivery_rescheduled` - Delivery of package has been rescheduled. * `location_inaccessible` - Delivery location inaccessible to carrier. Contact carrier to ensure delivery. * `notice_left` - Carrier left notice during attempted delivery. Follow carrier instructions on notice. * `package_damaged` - Package has been damaged. Contact carrier for more details. * `package_disposed` - Package has been disposed. * `package_held` - Package held at carrier location. Contact carrier for more details. * `package_lost` - Package has been lost. Contact carrier for more details. * `package_unclaimed` - Package is unclaimed. * `package_undeliverable` - Package is not able to be delivered. * `reschedule_delivery` - Contact carrier to reschedule delivery. * `other` - Unrecognized carrier status. 
  * @return event
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event: * `package_accepted` - Package has been accepted into the carrier network for delivery. * `package_arrived` - Package has arrived at an intermediate location in the carrier network. * `package_departed` - Package has departed from an intermediate location in the carrier network. * `package_processing` - Package is processing at an intermediate location in the carrier network. * `package_processed` - Package has been processed at an intermediate location. * `package_in_local_area` - Package is at a location near the end destination. * `delivery_scheduled` - Package is scheduled for delivery. * `out_for_delivery` - Package is out for delivery. * `pickup_available` - Package is available for pickup at carrier location. * `delivered` - Package has been delivered. * `package_forwarded` - Package has been forwarded. * `returned_to_sender` - Package is to be returned to sender. * `address_issue` - Address information is incorrect. Contact carrier to ensure delivery. * `contact_carrier` - Contact the carrier for more information. * `delayed` - Delivery of package is delayed. * `delivery_attempted` - Delivery of package has been attempted. Contact carrier to ensure delivery. * `delivery_rescheduled` - Delivery of package has been rescheduled. * `location_inaccessible` - Delivery location inaccessible to carrier. Contact carrier to ensure delivery. * `notice_left` - Carrier left notice during attempted delivery. Follow carrier instructions on notice. * `package_damaged` - Package has been damaged. Contact carrier for more details. * `package_disposed` - Package has been disposed. * `package_held` - Package held at carrier location. Contact carrier for more details. * `package_lost` - Package has been lost. Contact carrier for more details. * `package_unclaimed` - Package is unclaimed. * `package_undeliverable` - Package is not able to be delivered. * `reschedule_delivery` - Contact carrier to reschedule delivery. * `other` - Unrecognized carrier status. ")
  
  public EventEnum getEvent() {
      return event;
  }
  
  

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  

  private String description;
  /**
  * The description as listed in the description for event.
  * @return description
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The description as listed in the description for event.")
  
  public String getDescription() {
      return description;
  }
  
  

  public static final String SERIALIZED_NAME_NOTES = "notes";

  @SerializedName(SERIALIZED_NAME_NOTES)
  

  private String notes;
  /**
  * Event-specific notes from USPS about the tracking event.
  * @return notes
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Event-specific notes from USPS about the tracking event.")
  
  public String getNotes() {
      return notes;
  }
  
  

  public static final String SERIALIZED_NAME_ACTION_REQUIRED = "action_required";

  @SerializedName(SERIALIZED_NAME_ACTION_REQUIRED)
  

  private Boolean actionRequired;
  /**
  * `true` if action is required by the end recipient, `false` otherwise. 
  * @return actionRequired
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "`true` if action is required by the end recipient, `false` otherwise. ")
  
  public Boolean getActionRequired() {
      return actionRequired;
  }
  
  


  /*
  public TrackingEventDetails event(EventEnum event) {
    
    this.event = event;
    return this;
  }
  */


  public void setEvent(EventEnum event) {
    this.event = event;
  }



  /*
  public TrackingEventDetails description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }



  /*
  public TrackingEventDetails notes(String notes) {
    
    this.notes = notes;
    return this;
  }
  */


  public void setNotes(String notes) {
    this.notes = notes;
  }



  /*
  public TrackingEventDetails actionRequired(Boolean actionRequired) {
    
    this.actionRequired = actionRequired;
    return this;
  }
  */


  public void setActionRequired(Boolean actionRequired) {
    this.actionRequired = actionRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingEventDetails trackingEventDetails = (TrackingEventDetails) o;
    return Objects.equals(this.event, trackingEventDetails.event) &&
        Objects.equals(this.description, trackingEventDetails.description) &&
        Objects.equals(this.notes, trackingEventDetails.notes) &&
        Objects.equals(this.actionRequired, trackingEventDetails.actionRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, description, notes, actionRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
    sb.append("}");
    return sb.toString();
  }

    public Map<String, Object> toMap() {
      Map<String, Object> localMap = new HashMap<String, Object>();
      localMap.put("event", event);
      localMap.put("description", description);
      localMap.put("notes", notes);
      localMap.put("action_required", actionRequired);
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

