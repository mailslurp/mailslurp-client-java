/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
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
import com.mailslurp.models.AttachmentMetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * MailSlurp webhook payload schema. This schema describes the JSON object that is sent via HTTP POST to webhook urls when an email is received by an inbox that a webhook is attached to. Payloads may be delivered multiple times so use the ID as a key for event uniqueness. The payload contains IDs for the email and inbox affected. Use these to fetch more data related to the event using appropriate inbox and email endpoints. See https://www.mailslurp.com/guides/email-webhooks/ for more information. Your webhook endpoint should accept POST HTTP request and return a 200 in under 30 seconds. Process the webhook asynchronously if you need to.
 */
@ApiModel(description = "MailSlurp webhook payload schema. This schema describes the JSON object that is sent via HTTP POST to webhook urls when an email is received by an inbox that a webhook is attached to. Payloads may be delivered multiple times so use the ID as a key for event uniqueness. The payload contains IDs for the email and inbox affected. Use these to fetch more data related to the event using appropriate inbox and email endpoints. See https://www.mailslurp.com/guides/email-webhooks/ for more information. Your webhook endpoint should accept POST HTTP request and return a 200 in under 30 seconds. Process the webhook asynchronously if you need to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-29T08:03:43.579Z[GMT]")
public class WebhookPayload {
  public static final String SERIALIZED_NAME_ATTACHMENT_META_DATAS = "attachmentMetaDatas";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_META_DATAS)
  private List<AttachmentMetaData> attachmentMetaDatas = null;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EMAIL_ID = "emailId";
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private UUID emailId;

  /**
   * Name of the event type webhook is being triggered for
   */
  @JsonAdapter(EventNameEnum.Adapter.class)
  public enum EventNameEnum {
    EMAIL_RECEIVED("EMAIL_RECEIVED");

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

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = null;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private UUID webhookId;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;


  public WebhookPayload attachmentMetaDatas(List<AttachmentMetaData> attachmentMetaDatas) {
    
    this.attachmentMetaDatas = attachmentMetaDatas;
    return this;
  }

  public WebhookPayload addAttachmentMetaDatasItem(AttachmentMetaData attachmentMetaDatasItem) {
    if (this.attachmentMetaDatas == null) {
      this.attachmentMetaDatas = new ArrayList<>();
    }
    this.attachmentMetaDatas.add(attachmentMetaDatasItem);
    return this;
  }

   /**
   * List of attachment meta data objects if attachments present
   * @return attachmentMetaDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attachment meta data objects if attachments present")

  public List<AttachmentMetaData> getAttachmentMetaDatas() {
    return attachmentMetaDatas;
  }


  public void setAttachmentMetaDatas(List<AttachmentMetaData> attachmentMetaDatas) {
    this.attachmentMetaDatas = attachmentMetaDatas;
  }


  public WebhookPayload bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public WebhookPayload addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * List of &#x60;BCC&#x60; recipients email was addressed to
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `BCC` recipients email was addressed to")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public WebhookPayload cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public WebhookPayload addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * List of &#x60;CC&#x60; recipients email was addressed to
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `CC` recipients email was addressed to")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public WebhookPayload createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date time of event creation
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date time of event creation")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookPayload emailId(UUID emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * ID of the email that was received. Use this ID for fetching the email
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the email that was received. Use this ID for fetching the email")

  public UUID getEmailId() {
    return emailId;
  }


  public void setEmailId(UUID emailId) {
    this.emailId = emailId;
  }


  public WebhookPayload eventName(EventNameEnum eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Name of the event type webhook is being triggered for
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the event type webhook is being triggered for")

  public EventNameEnum getEventName() {
    return eventName;
  }


  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }


  public WebhookPayload from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Who the email was sent from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who the email was sent from")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public WebhookPayload id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Idempotent message ID. Store this ID locally or in a database to prevent message duplication.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WebhookPayload inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Id of the inbox that receive an email
   * @return inboxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the inbox that receive an email")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public WebhookPayload subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject line of the email message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject line of the email message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public WebhookPayload to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public WebhookPayload addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of &#x60;To&#x60; recipients email was addressed to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `To` recipients email was addressed to")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public WebhookPayload webhookId(UUID webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * ID of webhook entity being triggered
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of webhook entity being triggered")

  public UUID getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(UUID webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookPayload webhookName(String webhookName) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPayload webhookPayload = (WebhookPayload) o;
    return Objects.equals(this.attachmentMetaDatas, webhookPayload.attachmentMetaDatas) &&
        Objects.equals(this.bcc, webhookPayload.bcc) &&
        Objects.equals(this.cc, webhookPayload.cc) &&
        Objects.equals(this.createdAt, webhookPayload.createdAt) &&
        Objects.equals(this.emailId, webhookPayload.emailId) &&
        Objects.equals(this.eventName, webhookPayload.eventName) &&
        Objects.equals(this.from, webhookPayload.from) &&
        Objects.equals(this.id, webhookPayload.id) &&
        Objects.equals(this.inboxId, webhookPayload.inboxId) &&
        Objects.equals(this.subject, webhookPayload.subject) &&
        Objects.equals(this.to, webhookPayload.to) &&
        Objects.equals(this.webhookId, webhookPayload.webhookId) &&
        Objects.equals(this.webhookName, webhookPayload.webhookName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentMetaDatas, bcc, cc, createdAt, emailId, eventName, from, id, inboxId, subject, to, webhookId, webhookName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayload {\n");
    sb.append("    attachmentMetaDatas: ").append(toIndentedString(attachmentMetaDatas)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
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
