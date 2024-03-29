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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mailslurp.clients.JSON;

/**
 * DELIVERY_STATUS webhook payload. Sent to your webhook url endpoint via HTTP POST when an email delivery status is created. This could be a successful delivery or a delivery failure.
 */
@ApiModel(description = "DELIVERY_STATUS webhook payload. Sent to your webhook url endpoint via HTTP POST when an email delivery status is created. This could be a successful delivery or a delivery failure.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class WebhookDeliveryStatusPayload {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private UUID webhookId;

  /**
   * Name of the event type webhook is being triggered for.
   */
  @JsonAdapter(EventNameEnum.Adapter.class)
  public enum EventNameEnum {
    EMAIL_RECEIVED("EMAIL_RECEIVED"),
    
    NEW_EMAIL("NEW_EMAIL"),
    
    NEW_CONTACT("NEW_CONTACT"),
    
    NEW_ATTACHMENT("NEW_ATTACHMENT"),
    
    EMAIL_OPENED("EMAIL_OPENED"),
    
    EMAIL_READ("EMAIL_READ"),
    
    DELIVERY_STATUS("DELIVERY_STATUS"),
    
    BOUNCE("BOUNCE"),
    
    BOUNCE_RECIPIENT("BOUNCE_RECIPIENT"),
    
    NEW_SMS("NEW_SMS");

    private String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventNameEnum fromValue(String value) {
      for (EventNameEnum b : EventNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private EventNameEnum eventName;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_SENT_ID = "sentId";
  @SerializedName(SERIALIZED_NAME_SENT_ID)
  private UUID sentId;

  public static final String SERIALIZED_NAME_REMOTE_MTA_IP = "remoteMtaIp";
  @SerializedName(SERIALIZED_NAME_REMOTE_MTA_IP)
  private String remoteMtaIp;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_REPORTING_MTA = "reportingMta";
  @SerializedName(SERIALIZED_NAME_REPORTING_MTA)
  private String reportingMta;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<String> recipients = null;

  public static final String SERIALIZED_NAME_SMTP_RESPONSE = "smtpResponse";
  @SerializedName(SERIALIZED_NAME_SMTP_RESPONSE)
  private String smtpResponse;

  public static final String SERIALIZED_NAME_SMTP_STATUS_CODE = "smtpStatusCode";
  @SerializedName(SERIALIZED_NAME_SMTP_STATUS_CODE)
  private Integer smtpStatusCode;

  public static final String SERIALIZED_NAME_PROCESSING_TIME_MILLIS = "processingTimeMillis";
  @SerializedName(SERIALIZED_NAME_PROCESSING_TIME_MILLIS)
  private Long processingTimeMillis;

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private OffsetDateTime received;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public WebhookDeliveryStatusPayload() {
  }

  public WebhookDeliveryStatusPayload messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Idempotent message ID. Store this ID locally or in a database to prevent message duplication.")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public WebhookDeliveryStatusPayload webhookId(UUID webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * ID of webhook entity being triggered
   * @return webhookId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of webhook entity being triggered")

  public UUID getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(UUID webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookDeliveryStatusPayload eventName(EventNameEnum eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Name of the event type webhook is being triggered for.
   * @return eventName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the event type webhook is being triggered for.")

  public EventNameEnum getEventName() {
    return eventName;
  }


  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }


  public WebhookDeliveryStatusPayload webhookName(String webhookName) {
    
    this.webhookName = webhookName;
    return this;
  }

   /**
   * Name of the webhook being triggered
   * @return webhookName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the webhook being triggered")

  public String getWebhookName() {
    return webhookName;
  }


  public void setWebhookName(String webhookName) {
    this.webhookName = webhookName;
  }


  public WebhookDeliveryStatusPayload id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of delivery status
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of delivery status")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public WebhookDeliveryStatusPayload userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User ID of event
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "User ID of event")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public WebhookDeliveryStatusPayload sentId(UUID sentId) {
    
    this.sentId = sentId;
    return this;
  }

   /**
   * ID of sent email
   * @return sentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of sent email")

  public UUID getSentId() {
    return sentId;
  }


  public void setSentId(UUID sentId) {
    this.sentId = sentId;
  }


  public WebhookDeliveryStatusPayload remoteMtaIp(String remoteMtaIp) {
    
    this.remoteMtaIp = remoteMtaIp;
    return this;
  }

   /**
   * IP address of the remote Mail Transfer Agent
   * @return remoteMtaIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the remote Mail Transfer Agent")

  public String getRemoteMtaIp() {
    return remoteMtaIp;
  }


  public void setRemoteMtaIp(String remoteMtaIp) {
    this.remoteMtaIp = remoteMtaIp;
  }


  public WebhookDeliveryStatusPayload inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Id of the inbox
   * @return inboxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the inbox")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public WebhookDeliveryStatusPayload reportingMta(String reportingMta) {
    
    this.reportingMta = reportingMta;
    return this;
  }

   /**
   * Mail Transfer Agent reporting delivery status
   * @return reportingMta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mail Transfer Agent reporting delivery status")

  public String getReportingMta() {
    return reportingMta;
  }


  public void setReportingMta(String reportingMta) {
    this.reportingMta = reportingMta;
  }


  public WebhookDeliveryStatusPayload recipients(List<String> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public WebhookDeliveryStatusPayload addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Recipients for delivery
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recipients for delivery")

  public List<String> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }


  public WebhookDeliveryStatusPayload smtpResponse(String smtpResponse) {
    
    this.smtpResponse = smtpResponse;
    return this;
  }

   /**
   * SMTP server response message
   * @return smtpResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SMTP server response message")

  public String getSmtpResponse() {
    return smtpResponse;
  }


  public void setSmtpResponse(String smtpResponse) {
    this.smtpResponse = smtpResponse;
  }


  public WebhookDeliveryStatusPayload smtpStatusCode(Integer smtpStatusCode) {
    
    this.smtpStatusCode = smtpStatusCode;
    return this;
  }

   /**
   * SMTP server status
   * @return smtpStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SMTP server status")

  public Integer getSmtpStatusCode() {
    return smtpStatusCode;
  }


  public void setSmtpStatusCode(Integer smtpStatusCode) {
    this.smtpStatusCode = smtpStatusCode;
  }


  public WebhookDeliveryStatusPayload processingTimeMillis(Long processingTimeMillis) {
    
    this.processingTimeMillis = processingTimeMillis;
    return this;
  }

   /**
   * Time in milliseconds for delivery processing
   * @return processingTimeMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time in milliseconds for delivery processing")

  public Long getProcessingTimeMillis() {
    return processingTimeMillis;
  }


  public void setProcessingTimeMillis(Long processingTimeMillis) {
    this.processingTimeMillis = processingTimeMillis;
  }


  public WebhookDeliveryStatusPayload received(OffsetDateTime received) {
    
    this.received = received;
    return this;
  }

   /**
   * Time event was received
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time event was received")

  public OffsetDateTime getReceived() {
    return received;
  }


  public void setReceived(OffsetDateTime received) {
    this.received = received;
  }


  public WebhookDeliveryStatusPayload subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Email subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email subject")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDeliveryStatusPayload webhookDeliveryStatusPayload = (WebhookDeliveryStatusPayload) o;
    return Objects.equals(this.messageId, webhookDeliveryStatusPayload.messageId) &&
        Objects.equals(this.webhookId, webhookDeliveryStatusPayload.webhookId) &&
        Objects.equals(this.eventName, webhookDeliveryStatusPayload.eventName) &&
        Objects.equals(this.webhookName, webhookDeliveryStatusPayload.webhookName) &&
        Objects.equals(this.id, webhookDeliveryStatusPayload.id) &&
        Objects.equals(this.userId, webhookDeliveryStatusPayload.userId) &&
        Objects.equals(this.sentId, webhookDeliveryStatusPayload.sentId) &&
        Objects.equals(this.remoteMtaIp, webhookDeliveryStatusPayload.remoteMtaIp) &&
        Objects.equals(this.inboxId, webhookDeliveryStatusPayload.inboxId) &&
        Objects.equals(this.reportingMta, webhookDeliveryStatusPayload.reportingMta) &&
        Objects.equals(this.recipients, webhookDeliveryStatusPayload.recipients) &&
        Objects.equals(this.smtpResponse, webhookDeliveryStatusPayload.smtpResponse) &&
        Objects.equals(this.smtpStatusCode, webhookDeliveryStatusPayload.smtpStatusCode) &&
        Objects.equals(this.processingTimeMillis, webhookDeliveryStatusPayload.processingTimeMillis) &&
        Objects.equals(this.received, webhookDeliveryStatusPayload.received) &&
        Objects.equals(this.subject, webhookDeliveryStatusPayload.subject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, webhookId, eventName, webhookName, id, userId, sentId, remoteMtaIp, inboxId, reportingMta, recipients, smtpResponse, smtpStatusCode, processingTimeMillis, received, subject);
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
    sb.append("class WebhookDeliveryStatusPayload {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sentId: ").append(toIndentedString(sentId)).append("\n");
    sb.append("    remoteMtaIp: ").append(toIndentedString(remoteMtaIp)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    reportingMta: ").append(toIndentedString(reportingMta)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    smtpResponse: ").append(toIndentedString(smtpResponse)).append("\n");
    sb.append("    smtpStatusCode: ").append(toIndentedString(smtpStatusCode)).append("\n");
    sb.append("    processingTimeMillis: ").append(toIndentedString(processingTimeMillis)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("messageId");
    openapiFields.add("webhookId");
    openapiFields.add("eventName");
    openapiFields.add("webhookName");
    openapiFields.add("id");
    openapiFields.add("userId");
    openapiFields.add("sentId");
    openapiFields.add("remoteMtaIp");
    openapiFields.add("inboxId");
    openapiFields.add("reportingMta");
    openapiFields.add("recipients");
    openapiFields.add("smtpResponse");
    openapiFields.add("smtpStatusCode");
    openapiFields.add("processingTimeMillis");
    openapiFields.add("received");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageId");
    openapiRequiredFields.add("webhookId");
    openapiRequiredFields.add("eventName");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("userId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookDeliveryStatusPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookDeliveryStatusPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookDeliveryStatusPayload is not found in the empty JSON string", WebhookDeliveryStatusPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookDeliveryStatusPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookDeliveryStatusPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookDeliveryStatusPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("messageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageId").toString()));
      }
      if (!jsonObj.get("webhookId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookId").toString()));
      }
      if (!jsonObj.get("eventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventName").toString()));
      }
      if ((jsonObj.get("webhookName") != null && !jsonObj.get("webhookName").isJsonNull()) && !jsonObj.get("webhookName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookName").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("sentId") != null && !jsonObj.get("sentId").isJsonNull()) && !jsonObj.get("sentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sentId").toString()));
      }
      if ((jsonObj.get("remoteMtaIp") != null && !jsonObj.get("remoteMtaIp").isJsonNull()) && !jsonObj.get("remoteMtaIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteMtaIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteMtaIp").toString()));
      }
      if ((jsonObj.get("inboxId") != null && !jsonObj.get("inboxId").isJsonNull()) && !jsonObj.get("inboxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inboxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inboxId").toString()));
      }
      if ((jsonObj.get("reportingMta") != null && !jsonObj.get("reportingMta").isJsonNull()) && !jsonObj.get("reportingMta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportingMta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportingMta").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
      }
      if ((jsonObj.get("smtpResponse") != null && !jsonObj.get("smtpResponse").isJsonNull()) && !jsonObj.get("smtpResponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smtpResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smtpResponse").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookDeliveryStatusPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookDeliveryStatusPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookDeliveryStatusPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookDeliveryStatusPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookDeliveryStatusPayload>() {
           @Override
           public void write(JsonWriter out, WebhookDeliveryStatusPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookDeliveryStatusPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookDeliveryStatusPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookDeliveryStatusPayload
  * @throws IOException if the JSON string is invalid with respect to WebhookDeliveryStatusPayload
  */
  public static WebhookDeliveryStatusPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookDeliveryStatusPayload.class);
  }

 /**
  * Convert an instance of WebhookDeliveryStatusPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

