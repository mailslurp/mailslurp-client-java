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
 * SpellingIssue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class SpellingIssue {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @javax.annotation.Nonnull
  private String group;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  @javax.annotation.Nonnull
  private String suggestion;

  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    WARNING("Warning"),
    
    ERROR("Error");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      SeverityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  @javax.annotation.Nonnull
  private SeverityEnum severity;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nonnull
  private String message;

  public SpellingIssue() {
  }

  public SpellingIssue group(@javax.annotation.Nonnull String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @javax.annotation.Nonnull
  public String getGroup() {
    return group;
  }

  public void setGroup(@javax.annotation.Nonnull String group) {
    this.group = group;
  }


  public SpellingIssue suggestion(@javax.annotation.Nonnull String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * Get suggestion
   * @return suggestion
   */
  @javax.annotation.Nonnull
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(@javax.annotation.Nonnull String suggestion) {
    this.suggestion = suggestion;
  }


  public SpellingIssue severity(@javax.annotation.Nonnull SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
   */
  @javax.annotation.Nonnull
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(@javax.annotation.Nonnull SeverityEnum severity) {
    this.severity = severity;
  }


  public SpellingIssue message(@javax.annotation.Nonnull String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpellingIssue spellingIssue = (SpellingIssue) o;
    return Objects.equals(this.group, spellingIssue.group) &&
        Objects.equals(this.suggestion, spellingIssue.suggestion) &&
        Objects.equals(this.severity, spellingIssue.severity) &&
        Objects.equals(this.message, spellingIssue.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, suggestion, severity, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpellingIssue {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("suggestion");
    openapiFields.add("severity");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("group");
    openapiRequiredFields.add("suggestion");
    openapiRequiredFields.add("severity");
    openapiRequiredFields.add("message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SpellingIssue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!SpellingIssue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpellingIssue is not found in the empty JSON string", SpellingIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpellingIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpellingIssue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpellingIssue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (!jsonObj.get("suggestion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestion").toString()));
      }
      if (!jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      // validate the required field `severity`
      SeverityEnum.validateJsonElement(jsonObj.get("severity"));
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpellingIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpellingIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpellingIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpellingIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<SpellingIssue>() {
           @Override
           public void write(JsonWriter out, SpellingIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpellingIssue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SpellingIssue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SpellingIssue
   * @throws IOException if the JSON string is invalid with respect to SpellingIssue
   */
  public static SpellingIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpellingIssue.class);
  }

  /**
   * Convert an instance of SpellingIssue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

