/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mailslurp.models.EmailRecipients;
import com.mailslurp.models.Sender;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mailslurp.clients.JSON;

/**
 * FakeEmailDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class FakeEmailDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  @javax.annotation.Nonnull
  private String emailAddress;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  @javax.annotation.Nullable
  private Sender sender;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  @javax.annotation.Nullable
  private EmailRecipients recipients;

  public static final String SERIALIZED_NAME_ATTACHMENT_NAMES = "attachmentNames";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_NAMES)
  @javax.annotation.Nonnull
  private List<String> attachmentNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_PREVIEW = "preview";
  @SerializedName(SERIALIZED_NAME_PREVIEW)
  @javax.annotation.Nullable
  private String preview;

  public static final String SERIALIZED_NAME_BODY = "body";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_BODY)
  @javax.annotation.Nonnull
  private String body;

  public static final String SERIALIZED_NAME_SEEN = "seen";
  @SerializedName(SERIALIZED_NAME_SEEN)
  @javax.annotation.Nonnull
  private Boolean seen;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  @javax.annotation.Nonnull
  private String contentType;

  public static final String SERIALIZED_NAME_BODY_URL = "bodyUrl";
  @SerializedName(SERIALIZED_NAME_BODY_URL)
  @javax.annotation.Nonnull
  private String bodyUrl;

  public FakeEmailDto() {
  }

  public FakeEmailDto id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public FakeEmailDto emailAddress(@javax.annotation.Nonnull String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  @javax.annotation.Nonnull
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@javax.annotation.Nonnull String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public FakeEmailDto sender(@javax.annotation.Nullable Sender sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @javax.annotation.Nullable
  public Sender getSender() {
    return sender;
  }

  public void setSender(@javax.annotation.Nullable Sender sender) {
    this.sender = sender;
  }


  public FakeEmailDto recipients(@javax.annotation.Nullable EmailRecipients recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * Get recipients
   * @return recipients
   */
  @javax.annotation.Nullable
  public EmailRecipients getRecipients() {
    return recipients;
  }

  public void setRecipients(@javax.annotation.Nullable EmailRecipients recipients) {
    this.recipients = recipients;
  }


  public FakeEmailDto attachmentNames(@javax.annotation.Nonnull List<String> attachmentNames) {
    this.attachmentNames = attachmentNames;
    return this;
  }

  public FakeEmailDto addAttachmentNamesItem(String attachmentNamesItem) {
    if (this.attachmentNames == null) {
      this.attachmentNames = new ArrayList<>();
    }
    this.attachmentNames.add(attachmentNamesItem);
    return this;
  }

  /**
   * Get attachmentNames
   * @return attachmentNames
   */
  @javax.annotation.Nonnull
  public List<String> getAttachmentNames() {
    return attachmentNames;
  }

  public void setAttachmentNames(@javax.annotation.Nonnull List<String> attachmentNames) {
    this.attachmentNames = attachmentNames;
  }


  public FakeEmailDto subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public FakeEmailDto preview(@javax.annotation.Nullable String preview) {
    this.preview = preview;
    return this;
  }

  /**
   * Get preview
   * @return preview
   */
  @javax.annotation.Nullable
  public String getPreview() {
    return preview;
  }

  public void setPreview(@javax.annotation.Nullable String preview) {
    this.preview = preview;
  }


  @Deprecated
  public FakeEmailDto body(@javax.annotation.Nonnull String body) {
    this.body = body;
    return this;
  }

  /**
   * use read content endpoints instead
   * @return body
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nonnull
  public String getBody() {
    return body;
  }

  @Deprecated
  public void setBody(@javax.annotation.Nonnull String body) {
    this.body = body;
  }


  public FakeEmailDto seen(@javax.annotation.Nonnull Boolean seen) {
    this.seen = seen;
    return this;
  }

  /**
   * Get seen
   * @return seen
   */
  @javax.annotation.Nonnull
  public Boolean getSeen() {
    return seen;
  }

  public void setSeen(@javax.annotation.Nonnull Boolean seen) {
    this.seen = seen;
  }


  public FakeEmailDto createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public FakeEmailDto contentType(@javax.annotation.Nonnull String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @javax.annotation.Nonnull
  public String getContentType() {
    return contentType;
  }

  public void setContentType(@javax.annotation.Nonnull String contentType) {
    this.contentType = contentType;
  }


  public FakeEmailDto bodyUrl(@javax.annotation.Nonnull String bodyUrl) {
    this.bodyUrl = bodyUrl;
    return this;
  }

  /**
   * Get bodyUrl
   * @return bodyUrl
   */
  @javax.annotation.Nonnull
  public String getBodyUrl() {
    return bodyUrl;
  }

  public void setBodyUrl(@javax.annotation.Nonnull String bodyUrl) {
    this.bodyUrl = bodyUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FakeEmailDto fakeEmailDto = (FakeEmailDto) o;
    return Objects.equals(this.id, fakeEmailDto.id) &&
        Objects.equals(this.emailAddress, fakeEmailDto.emailAddress) &&
        Objects.equals(this.sender, fakeEmailDto.sender) &&
        Objects.equals(this.recipients, fakeEmailDto.recipients) &&
        Objects.equals(this.attachmentNames, fakeEmailDto.attachmentNames) &&
        Objects.equals(this.subject, fakeEmailDto.subject) &&
        Objects.equals(this.preview, fakeEmailDto.preview) &&
        Objects.equals(this.body, fakeEmailDto.body) &&
        Objects.equals(this.seen, fakeEmailDto.seen) &&
        Objects.equals(this.createdAt, fakeEmailDto.createdAt) &&
        Objects.equals(this.contentType, fakeEmailDto.contentType) &&
        Objects.equals(this.bodyUrl, fakeEmailDto.bodyUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, sender, recipients, attachmentNames, subject, preview, body, seen, createdAt, contentType, bodyUrl);
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
    sb.append("class FakeEmailDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    attachmentNames: ").append(toIndentedString(attachmentNames)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    seen: ").append(toIndentedString(seen)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    bodyUrl: ").append(toIndentedString(bodyUrl)).append("\n");
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
    openapiFields.add("emailAddress");
    openapiFields.add("sender");
    openapiFields.add("recipients");
    openapiFields.add("attachmentNames");
    openapiFields.add("subject");
    openapiFields.add("preview");
    openapiFields.add("body");
    openapiFields.add("seen");
    openapiFields.add("createdAt");
    openapiFields.add("contentType");
    openapiFields.add("bodyUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("emailAddress");
    openapiRequiredFields.add("attachmentNames");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("seen");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("contentType");
    openapiRequiredFields.add("bodyUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FakeEmailDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!FakeEmailDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FakeEmailDto is not found in the empty JSON string", FakeEmailDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FakeEmailDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FakeEmailDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FakeEmailDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      // validate the optional field `sender`
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) {
        Sender.validateJsonElement(jsonObj.get("sender"));
      }
      // validate the optional field `recipients`
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull()) {
        EmailRecipients.validateJsonElement(jsonObj.get("recipients"));
      }
      // ensure the required json array is present
      if (jsonObj.get("attachmentNames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("attachmentNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachmentNames` to be an array in the JSON string but got `%s`", jsonObj.get("attachmentNames").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("preview") != null && !jsonObj.get("preview").isJsonNull()) && !jsonObj.get("preview").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if (!jsonObj.get("bodyUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bodyUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bodyUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FakeEmailDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FakeEmailDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FakeEmailDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FakeEmailDto.class));

       return (TypeAdapter<T>) new TypeAdapter<FakeEmailDto>() {
           @Override
           public void write(JsonWriter out, FakeEmailDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FakeEmailDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FakeEmailDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FakeEmailDto
   * @throws IOException if the JSON string is invalid with respect to FakeEmailDto
   */
  public static FakeEmailDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FakeEmailDto.class);
  }

  /**
   * Convert an instance of FakeEmailDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

