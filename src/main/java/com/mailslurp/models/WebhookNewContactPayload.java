/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.
 */
@ApiModel(description = "NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-21T11:12:00.410Z[GMT]")
public class WebhookNewContactPayload {
  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_CONTACT_ID = "contactId";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private UUID contactId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<String> emailAddresses = new ArrayList<>();

  /**
   * Name of the event type webhook is being triggered for.
   */
  @JsonAdapter(EventNameEnum.Adapter.class)
  public enum EventNameEnum {
    EMAIL_RECEIVED("EMAIL_RECEIVED"),
    
    NEW_EMAIL("NEW_EMAIL"),
    
    NEW_CONTACT("NEW_CONTACT"),
    
    NEW_ATTACHMENT("NEW_ATTACHMENT");

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

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private UUID groupId;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData;

  public static final String SERIALIZED_NAME_OPT_OUT = "optOut";
  @SerializedName(SERIALIZED_NAME_OPT_OUT)
  private Boolean optOut;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL_ADDRESS = "primaryEmailAddress";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL_ADDRESS)
  private String primaryEmailAddress;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private UUID webhookId;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;


  public WebhookNewContactPayload company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public WebhookNewContactPayload contactId(UUID contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getContactId() {
    return contactId;
  }


  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }


  public WebhookNewContactPayload createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookNewContactPayload emailAddresses(List<String> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public WebhookNewContactPayload addEmailAddressesItem(String emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public WebhookNewContactPayload eventName(EventNameEnum eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Name of the event type webhook is being triggered for.
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the event type webhook is being triggered for.")

  public EventNameEnum getEventName() {
    return eventName;
  }


  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }


  public WebhookNewContactPayload firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public WebhookNewContactPayload groupId(UUID groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getGroupId() {
    return groupId;
  }


  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }


  public WebhookNewContactPayload lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public WebhookNewContactPayload messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Idempotent message ID. Store this ID locally or in a database to prevent message duplication.")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public WebhookNewContactPayload metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  public WebhookNewContactPayload optOut(Boolean optOut) {
    
    this.optOut = optOut;
    return this;
  }

   /**
   * Get optOut
   * @return optOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOptOut() {
    return optOut;
  }


  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }


  public WebhookNewContactPayload primaryEmailAddress(String primaryEmailAddress) {
    
    this.primaryEmailAddress = primaryEmailAddress;
    return this;
  }

   /**
   * Get primaryEmailAddress
   * @return primaryEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryEmailAddress() {
    return primaryEmailAddress;
  }


  public void setPrimaryEmailAddress(String primaryEmailAddress) {
    this.primaryEmailAddress = primaryEmailAddress;
  }


  public WebhookNewContactPayload tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public WebhookNewContactPayload addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public WebhookNewContactPayload webhookId(UUID webhookId) {
    
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


  public WebhookNewContactPayload webhookName(String webhookName) {
    
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
    WebhookNewContactPayload webhookNewContactPayload = (WebhookNewContactPayload) o;
    return Objects.equals(this.company, webhookNewContactPayload.company) &&
        Objects.equals(this.contactId, webhookNewContactPayload.contactId) &&
        Objects.equals(this.createdAt, webhookNewContactPayload.createdAt) &&
        Objects.equals(this.emailAddresses, webhookNewContactPayload.emailAddresses) &&
        Objects.equals(this.eventName, webhookNewContactPayload.eventName) &&
        Objects.equals(this.firstName, webhookNewContactPayload.firstName) &&
        Objects.equals(this.groupId, webhookNewContactPayload.groupId) &&
        Objects.equals(this.lastName, webhookNewContactPayload.lastName) &&
        Objects.equals(this.messageId, webhookNewContactPayload.messageId) &&
        Objects.equals(this.metaData, webhookNewContactPayload.metaData) &&
        Objects.equals(this.optOut, webhookNewContactPayload.optOut) &&
        Objects.equals(this.primaryEmailAddress, webhookNewContactPayload.primaryEmailAddress) &&
        Objects.equals(this.tags, webhookNewContactPayload.tags) &&
        Objects.equals(this.webhookId, webhookNewContactPayload.webhookId) &&
        Objects.equals(this.webhookName, webhookNewContactPayload.webhookName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, contactId, createdAt, emailAddresses, eventName, firstName, groupId, lastName, messageId, metaData, optOut, primaryEmailAddress, tags, webhookId, webhookName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookNewContactPayload {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    optOut: ").append(toIndentedString(optOut)).append("\n");
    sb.append("    primaryEmailAddress: ").append(toIndentedString(primaryEmailAddress)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
