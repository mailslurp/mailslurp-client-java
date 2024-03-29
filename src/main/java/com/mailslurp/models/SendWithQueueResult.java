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
import java.util.UUID;

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
 * Collection of items
 */
@ApiModel(description = "Collection of items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class SendWithQueueResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_HEADER_ID = "headerId";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_DELIVERED = "delivered";
  @SerializedName(SERIALIZED_NAME_DELIVERED)
  private Boolean delivered;

  public static final String SERIALIZED_NAME_EXCEPTION_NAME = "exceptionName";
  @SerializedName(SERIALIZED_NAME_EXCEPTION_NAME)
  private String exceptionName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public SendWithQueueResult() {
  }

  public SendWithQueueResult id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public SendWithQueueResult userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public SendWithQueueResult subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public SendWithQueueResult inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Get inboxId
   * @return inboxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public SendWithQueueResult headerId(String headerId) {
    
    this.headerId = headerId;
    return this;
  }

   /**
   * Get headerId
   * @return headerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHeaderId() {
    return headerId;
  }


  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public SendWithQueueResult delivered(Boolean delivered) {
    
    this.delivered = delivered;
    return this;
  }

   /**
   * Get delivered
   * @return delivered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDelivered() {
    return delivered;
  }


  public void setDelivered(Boolean delivered) {
    this.delivered = delivered;
  }


  public SendWithQueueResult exceptionName(String exceptionName) {
    
    this.exceptionName = exceptionName;
    return this;
  }

   /**
   * Get exceptionName
   * @return exceptionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExceptionName() {
    return exceptionName;
  }


  public void setExceptionName(String exceptionName) {
    this.exceptionName = exceptionName;
  }


  public SendWithQueueResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SendWithQueueResult createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SendWithQueueResult updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendWithQueueResult sendWithQueueResult = (SendWithQueueResult) o;
    return Objects.equals(this.id, sendWithQueueResult.id) &&
        Objects.equals(this.userId, sendWithQueueResult.userId) &&
        Objects.equals(this.subject, sendWithQueueResult.subject) &&
        Objects.equals(this.inboxId, sendWithQueueResult.inboxId) &&
        Objects.equals(this.headerId, sendWithQueueResult.headerId) &&
        Objects.equals(this.delivered, sendWithQueueResult.delivered) &&
        Objects.equals(this.exceptionName, sendWithQueueResult.exceptionName) &&
        Objects.equals(this.message, sendWithQueueResult.message) &&
        Objects.equals(this.createdAt, sendWithQueueResult.createdAt) &&
        Objects.equals(this.updatedAt, sendWithQueueResult.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, subject, inboxId, headerId, delivered, exceptionName, message, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendWithQueueResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    exceptionName: ").append(toIndentedString(exceptionName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("userId");
    openapiFields.add("subject");
    openapiFields.add("inboxId");
    openapiFields.add("headerId");
    openapiFields.add("delivered");
    openapiFields.add("exceptionName");
    openapiFields.add("message");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("headerId");
    openapiRequiredFields.add("delivered");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendWithQueueResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SendWithQueueResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendWithQueueResult is not found in the empty JSON string", SendWithQueueResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendWithQueueResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendWithQueueResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendWithQueueResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("inboxId") != null && !jsonObj.get("inboxId").isJsonNull()) && !jsonObj.get("inboxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inboxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inboxId").toString()));
      }
      if (!jsonObj.get("headerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headerId").toString()));
      }
      if ((jsonObj.get("exceptionName") != null && !jsonObj.get("exceptionName").isJsonNull()) && !jsonObj.get("exceptionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exceptionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exceptionName").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendWithQueueResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendWithQueueResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendWithQueueResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendWithQueueResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SendWithQueueResult>() {
           @Override
           public void write(JsonWriter out, SendWithQueueResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendWithQueueResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendWithQueueResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendWithQueueResult
  * @throws IOException if the JSON string is invalid with respect to SendWithQueueResult
  */
  public static SendWithQueueResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendWithQueueResult.class);
  }

 /**
  * Convert an instance of SendWithQueueResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

