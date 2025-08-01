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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * GuestPortalDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class GuestPortalDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  @javax.annotation.Nullable
  private UUID domainId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nonnull
  private UUID userId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_LINK_HELP = "linkHelp";
  @SerializedName(SERIALIZED_NAME_LINK_HELP)
  @javax.annotation.Nullable
  private String linkHelp;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LOGIN_URL = "loginUrl";
  @SerializedName(SERIALIZED_NAME_LOGIN_URL)
  @javax.annotation.Nonnull
  private String loginUrl;

  public GuestPortalDto() {
  }

  public GuestPortalDto id(@javax.annotation.Nonnull UUID id) {
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


  public GuestPortalDto domainId(@javax.annotation.Nullable UUID domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
   */
  @javax.annotation.Nullable
  public UUID getDomainId() {
    return domainId;
  }

  public void setDomainId(@javax.annotation.Nullable UUID domainId) {
    this.domainId = domainId;
  }


  public GuestPortalDto userId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
  }


  public GuestPortalDto name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GuestPortalDto description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GuestPortalDto linkHelp(@javax.annotation.Nullable String linkHelp) {
    this.linkHelp = linkHelp;
    return this;
  }

  /**
   * Get linkHelp
   * @return linkHelp
   */
  @javax.annotation.Nullable
  public String getLinkHelp() {
    return linkHelp;
  }

  public void setLinkHelp(@javax.annotation.Nullable String linkHelp) {
    this.linkHelp = linkHelp;
  }


  public GuestPortalDto createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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


  public GuestPortalDto updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GuestPortalDto loginUrl(@javax.annotation.Nonnull String loginUrl) {
    this.loginUrl = loginUrl;
    return this;
  }

  /**
   * Get loginUrl
   * @return loginUrl
   */
  @javax.annotation.Nonnull
  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(@javax.annotation.Nonnull String loginUrl) {
    this.loginUrl = loginUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestPortalDto guestPortalDto = (GuestPortalDto) o;
    return Objects.equals(this.id, guestPortalDto.id) &&
        Objects.equals(this.domainId, guestPortalDto.domainId) &&
        Objects.equals(this.userId, guestPortalDto.userId) &&
        Objects.equals(this.name, guestPortalDto.name) &&
        Objects.equals(this.description, guestPortalDto.description) &&
        Objects.equals(this.linkHelp, guestPortalDto.linkHelp) &&
        Objects.equals(this.createdAt, guestPortalDto.createdAt) &&
        Objects.equals(this.updatedAt, guestPortalDto.updatedAt) &&
        Objects.equals(this.loginUrl, guestPortalDto.loginUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domainId, userId, name, description, linkHelp, createdAt, updatedAt, loginUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestPortalDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    linkHelp: ").append(toIndentedString(linkHelp)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
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
    openapiFields.add("domainId");
    openapiFields.add("userId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("linkHelp");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("loginUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("loginUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuestPortalDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!GuestPortalDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuestPortalDto is not found in the empty JSON string", GuestPortalDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuestPortalDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuestPortalDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GuestPortalDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("domainId") != null && !jsonObj.get("domainId").isJsonNull()) && !jsonObj.get("domainId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domainId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domainId").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("linkHelp") != null && !jsonObj.get("linkHelp").isJsonNull()) && !jsonObj.get("linkHelp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkHelp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkHelp").toString()));
      }
      if (!jsonObj.get("loginUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuestPortalDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuestPortalDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuestPortalDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuestPortalDto.class));

       return (TypeAdapter<T>) new TypeAdapter<GuestPortalDto>() {
           @Override
           public void write(JsonWriter out, GuestPortalDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuestPortalDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuestPortalDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuestPortalDto
   * @throws IOException if the JSON string is invalid with respect to GuestPortalDto
   */
  public static GuestPortalDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuestPortalDto.class);
  }

  /**
   * Convert an instance of GuestPortalDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

