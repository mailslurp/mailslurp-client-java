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
import java.util.Arrays;

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
 * Email body content parts for multipart mime message. Will override body.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class SendEmailBodyPart {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  @javax.annotation.Nonnull
  private String contentType;

  public static final String SERIALIZED_NAME_CONTENT_BODY = "contentBody";
  @SerializedName(SERIALIZED_NAME_CONTENT_BODY)
  @javax.annotation.Nonnull
  private String contentBody;

  public SendEmailBodyPart() {
  }

  public SendEmailBodyPart contentType(@javax.annotation.Nonnull String contentType) {
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


  public SendEmailBodyPart contentBody(@javax.annotation.Nonnull String contentBody) {
    this.contentBody = contentBody;
    return this;
  }

  /**
   * Get contentBody
   * @return contentBody
   */
  @javax.annotation.Nonnull
  public String getContentBody() {
    return contentBody;
  }

  public void setContentBody(@javax.annotation.Nonnull String contentBody) {
    this.contentBody = contentBody;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEmailBodyPart sendEmailBodyPart = (SendEmailBodyPart) o;
    return Objects.equals(this.contentType, sendEmailBodyPart.contentType) &&
        Objects.equals(this.contentBody, sendEmailBodyPart.contentBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, contentBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailBodyPart {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentBody: ").append(toIndentedString(contentBody)).append("\n");
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
    openapiFields.add("contentType");
    openapiFields.add("contentBody");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contentType");
    openapiRequiredFields.add("contentBody");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SendEmailBodyPart
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!SendEmailBodyPart.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendEmailBodyPart is not found in the empty JSON string", SendEmailBodyPart.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SendEmailBodyPart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendEmailBodyPart` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendEmailBodyPart.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if (!jsonObj.get("contentBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentBody").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendEmailBodyPart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendEmailBodyPart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendEmailBodyPart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendEmailBodyPart.class));

       return (TypeAdapter<T>) new TypeAdapter<SendEmailBodyPart>() {
           @Override
           public void write(JsonWriter out, SendEmailBodyPart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendEmailBodyPart read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SendEmailBodyPart given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SendEmailBodyPart
   * @throws IOException if the JSON string is invalid with respect to SendEmailBodyPart
   */
  public static SendEmailBodyPart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendEmailBodyPart.class);
  }

  /**
   * Convert an instance of SendEmailBodyPart to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

