/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mailslurp.models.ConnectorSyncRequestResultException;
import com.mailslurp.models.ConnectorSyncResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * ConnectorSyncRequestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T11:53:50.137Z[GMT]")
public class ConnectorSyncRequestResult {
  public static final String SERIALIZED_NAME_SYNC_RESULT = "syncResult";
  @SerializedName(SERIALIZED_NAME_SYNC_RESULT)
  private ConnectorSyncResult syncResult;

  public static final String SERIALIZED_NAME_EXCEPTION = "exception";
  @SerializedName(SERIALIZED_NAME_EXCEPTION)
  private ConnectorSyncRequestResultException exception;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private UUID eventId;


  public ConnectorSyncRequestResult syncResult(ConnectorSyncResult syncResult) {
    
    this.syncResult = syncResult;
    return this;
  }

   /**
   * Get syncResult
   * @return syncResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectorSyncResult getSyncResult() {
    return syncResult;
  }


  public void setSyncResult(ConnectorSyncResult syncResult) {
    this.syncResult = syncResult;
  }


  public ConnectorSyncRequestResult exception(ConnectorSyncRequestResultException exception) {
    
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectorSyncRequestResultException getException() {
    return exception;
  }


  public void setException(ConnectorSyncRequestResultException exception) {
    this.exception = exception;
  }


  public ConnectorSyncRequestResult eventId(UUID eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getEventId() {
    return eventId;
  }


  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorSyncRequestResult connectorSyncRequestResult = (ConnectorSyncRequestResult) o;
    return Objects.equals(this.syncResult, connectorSyncRequestResult.syncResult) &&
        Objects.equals(this.exception, connectorSyncRequestResult.exception) &&
        Objects.equals(this.eventId, connectorSyncRequestResult.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncResult, exception, eventId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorSyncRequestResult {\n");
    sb.append("    syncResult: ").append(toIndentedString(syncResult)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
