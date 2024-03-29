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
import com.mailslurp.models.CreateInboxForwarderOptions;
import com.mailslurp.models.InboxForwarderTestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Options for testing new inbox forwarder rules
 */
@ApiModel(description = "Options for testing new inbox forwarder rules")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class TestNewInboxForwarderOptions {
  public static final String SERIALIZED_NAME_INBOX_FORWARDER_TEST_OPTIONS = "inboxForwarderTestOptions";
  @SerializedName(SERIALIZED_NAME_INBOX_FORWARDER_TEST_OPTIONS)
  private InboxForwarderTestOptions inboxForwarderTestOptions;

  public static final String SERIALIZED_NAME_CREATE_INBOX_FORWARDER_OPTIONS = "createInboxForwarderOptions";
  @SerializedName(SERIALIZED_NAME_CREATE_INBOX_FORWARDER_OPTIONS)
  private CreateInboxForwarderOptions createInboxForwarderOptions;

  public TestNewInboxForwarderOptions() {
  }

  public TestNewInboxForwarderOptions inboxForwarderTestOptions(InboxForwarderTestOptions inboxForwarderTestOptions) {
    
    this.inboxForwarderTestOptions = inboxForwarderTestOptions;
    return this;
  }

   /**
   * Get inboxForwarderTestOptions
   * @return inboxForwarderTestOptions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InboxForwarderTestOptions getInboxForwarderTestOptions() {
    return inboxForwarderTestOptions;
  }


  public void setInboxForwarderTestOptions(InboxForwarderTestOptions inboxForwarderTestOptions) {
    this.inboxForwarderTestOptions = inboxForwarderTestOptions;
  }


  public TestNewInboxForwarderOptions createInboxForwarderOptions(CreateInboxForwarderOptions createInboxForwarderOptions) {
    
    this.createInboxForwarderOptions = createInboxForwarderOptions;
    return this;
  }

   /**
   * Get createInboxForwarderOptions
   * @return createInboxForwarderOptions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateInboxForwarderOptions getCreateInboxForwarderOptions() {
    return createInboxForwarderOptions;
  }


  public void setCreateInboxForwarderOptions(CreateInboxForwarderOptions createInboxForwarderOptions) {
    this.createInboxForwarderOptions = createInboxForwarderOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestNewInboxForwarderOptions testNewInboxForwarderOptions = (TestNewInboxForwarderOptions) o;
    return Objects.equals(this.inboxForwarderTestOptions, testNewInboxForwarderOptions.inboxForwarderTestOptions) &&
        Objects.equals(this.createInboxForwarderOptions, testNewInboxForwarderOptions.createInboxForwarderOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboxForwarderTestOptions, createInboxForwarderOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestNewInboxForwarderOptions {\n");
    sb.append("    inboxForwarderTestOptions: ").append(toIndentedString(inboxForwarderTestOptions)).append("\n");
    sb.append("    createInboxForwarderOptions: ").append(toIndentedString(createInboxForwarderOptions)).append("\n");
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
    openapiFields.add("inboxForwarderTestOptions");
    openapiFields.add("createInboxForwarderOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inboxForwarderTestOptions");
    openapiRequiredFields.add("createInboxForwarderOptions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestNewInboxForwarderOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestNewInboxForwarderOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestNewInboxForwarderOptions is not found in the empty JSON string", TestNewInboxForwarderOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestNewInboxForwarderOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestNewInboxForwarderOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestNewInboxForwarderOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `inboxForwarderTestOptions`
      InboxForwarderTestOptions.validateJsonObject(jsonObj.getAsJsonObject("inboxForwarderTestOptions"));
      // validate the required field `createInboxForwarderOptions`
      CreateInboxForwarderOptions.validateJsonObject(jsonObj.getAsJsonObject("createInboxForwarderOptions"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestNewInboxForwarderOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestNewInboxForwarderOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestNewInboxForwarderOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestNewInboxForwarderOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<TestNewInboxForwarderOptions>() {
           @Override
           public void write(JsonWriter out, TestNewInboxForwarderOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestNewInboxForwarderOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestNewInboxForwarderOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestNewInboxForwarderOptions
  * @throws IOException if the JSON string is invalid with respect to TestNewInboxForwarderOptions
  */
  public static TestNewInboxForwarderOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestNewInboxForwarderOptions.class);
  }

 /**
  * Convert an instance of TestNewInboxForwarderOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

