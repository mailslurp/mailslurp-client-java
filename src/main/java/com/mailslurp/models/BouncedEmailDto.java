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
 * Bounced email
 */
@ApiModel(description = "Bounced email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-28T01:38:09.722Z[GMT]")
public class BouncedEmailDto {
  public static final String SERIALIZED_NAME_BOUNCE_MTA = "bounceMta";
  @SerializedName(SERIALIZED_NAME_BOUNCE_MTA)
  private String bounceMta;

  public static final String SERIALIZED_NAME_BOUNCE_RECIPIENTS = "bounceRecipients";
  @SerializedName(SERIALIZED_NAME_BOUNCE_RECIPIENTS)
  private List<String> bounceRecipients = null;

  public static final String SERIALIZED_NAME_BOUNCE_SUB_TYPE = "bounceSubType";
  @SerializedName(SERIALIZED_NAME_BOUNCE_SUB_TYPE)
  private String bounceSubType;

  public static final String SERIALIZED_NAME_BOUNCE_TYPE = "bounceType";
  @SerializedName(SERIALIZED_NAME_BOUNCE_TYPE)
  private String bounceType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private String notificationType;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_SENT_TO_RECIPIENTS = "sentToRecipients";
  @SerializedName(SERIALIZED_NAME_SENT_TO_RECIPIENTS)
  private List<String> sentToRecipients = null;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;


  public BouncedEmailDto bounceMta(String bounceMta) {
    
    this.bounceMta = bounceMta;
    return this;
  }

   /**
   * Get bounceMta
   * @return bounceMta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBounceMta() {
    return bounceMta;
  }


  public void setBounceMta(String bounceMta) {
    this.bounceMta = bounceMta;
  }


  public BouncedEmailDto bounceRecipients(List<String> bounceRecipients) {
    
    this.bounceRecipients = bounceRecipients;
    return this;
  }

  public BouncedEmailDto addBounceRecipientsItem(String bounceRecipientsItem) {
    if (this.bounceRecipients == null) {
      this.bounceRecipients = new ArrayList<>();
    }
    this.bounceRecipients.add(bounceRecipientsItem);
    return this;
  }

   /**
   * Get bounceRecipients
   * @return bounceRecipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBounceRecipients() {
    return bounceRecipients;
  }


  public void setBounceRecipients(List<String> bounceRecipients) {
    this.bounceRecipients = bounceRecipients;
  }


  public BouncedEmailDto bounceSubType(String bounceSubType) {
    
    this.bounceSubType = bounceSubType;
    return this;
  }

   /**
   * Get bounceSubType
   * @return bounceSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBounceSubType() {
    return bounceSubType;
  }


  public void setBounceSubType(String bounceSubType) {
    this.bounceSubType = bounceSubType;
  }


  public BouncedEmailDto bounceType(String bounceType) {
    
    this.bounceType = bounceType;
    return this;
  }

   /**
   * Get bounceType
   * @return bounceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBounceType() {
    return bounceType;
  }


  public void setBounceType(String bounceType) {
    this.bounceType = bounceType;
  }


  public BouncedEmailDto createdAt(OffsetDateTime createdAt) {
    
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


  public BouncedEmailDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public BouncedEmailDto notificationType(String notificationType) {
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }


  public BouncedEmailDto sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public BouncedEmailDto sentToRecipients(List<String> sentToRecipients) {
    
    this.sentToRecipients = sentToRecipients;
    return this;
  }

  public BouncedEmailDto addSentToRecipientsItem(String sentToRecipientsItem) {
    if (this.sentToRecipients == null) {
      this.sentToRecipients = new ArrayList<>();
    }
    this.sentToRecipients.add(sentToRecipientsItem);
    return this;
  }

   /**
   * Get sentToRecipients
   * @return sentToRecipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSentToRecipients() {
    return sentToRecipients;
  }


  public void setSentToRecipients(List<String> sentToRecipients) {
    this.sentToRecipients = sentToRecipients;
  }


  public BouncedEmailDto userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BouncedEmailDto bouncedEmailDto = (BouncedEmailDto) o;
    return Objects.equals(this.bounceMta, bouncedEmailDto.bounceMta) &&
        Objects.equals(this.bounceRecipients, bouncedEmailDto.bounceRecipients) &&
        Objects.equals(this.bounceSubType, bouncedEmailDto.bounceSubType) &&
        Objects.equals(this.bounceType, bouncedEmailDto.bounceType) &&
        Objects.equals(this.createdAt, bouncedEmailDto.createdAt) &&
        Objects.equals(this.id, bouncedEmailDto.id) &&
        Objects.equals(this.notificationType, bouncedEmailDto.notificationType) &&
        Objects.equals(this.sender, bouncedEmailDto.sender) &&
        Objects.equals(this.sentToRecipients, bouncedEmailDto.sentToRecipients) &&
        Objects.equals(this.userId, bouncedEmailDto.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounceMta, bounceRecipients, bounceSubType, bounceType, createdAt, id, notificationType, sender, sentToRecipients, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BouncedEmailDto {\n");
    sb.append("    bounceMta: ").append(toIndentedString(bounceMta)).append("\n");
    sb.append("    bounceRecipients: ").append(toIndentedString(bounceRecipients)).append("\n");
    sb.append("    bounceSubType: ").append(toIndentedString(bounceSubType)).append("\n");
    sb.append("    bounceType: ").append(toIndentedString(bounceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    sentToRecipients: ").append(toIndentedString(sentToRecipients)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
