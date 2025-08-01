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
import com.mailslurp.models.ServerEndpoints;
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
 * IMAP and SMTP server endpoints for MailSlurp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ImapSmtpAccessServers {
  public static final String SERIALIZED_NAME_IMAP_SERVER = "imapServer";
  @SerializedName(SERIALIZED_NAME_IMAP_SERVER)
  @javax.annotation.Nonnull
  private ServerEndpoints imapServer;

  public static final String SERIALIZED_NAME_SECURE_IMAP_SERVER = "secureImapServer";
  @SerializedName(SERIALIZED_NAME_SECURE_IMAP_SERVER)
  @javax.annotation.Nonnull
  private ServerEndpoints secureImapServer;

  public static final String SERIALIZED_NAME_SMTP_SERVER = "smtpServer";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER)
  @javax.annotation.Nonnull
  private ServerEndpoints smtpServer;

  public static final String SERIALIZED_NAME_SECURE_SMTP_SERVER = "secureSmtpServer";
  @SerializedName(SERIALIZED_NAME_SECURE_SMTP_SERVER)
  @javax.annotation.Nonnull
  private ServerEndpoints secureSmtpServer;

  public ImapSmtpAccessServers() {
  }

  public ImapSmtpAccessServers imapServer(@javax.annotation.Nonnull ServerEndpoints imapServer) {
    this.imapServer = imapServer;
    return this;
  }

  /**
   * Get imapServer
   * @return imapServer
   */
  @javax.annotation.Nonnull
  public ServerEndpoints getImapServer() {
    return imapServer;
  }

  public void setImapServer(@javax.annotation.Nonnull ServerEndpoints imapServer) {
    this.imapServer = imapServer;
  }


  public ImapSmtpAccessServers secureImapServer(@javax.annotation.Nonnull ServerEndpoints secureImapServer) {
    this.secureImapServer = secureImapServer;
    return this;
  }

  /**
   * Get secureImapServer
   * @return secureImapServer
   */
  @javax.annotation.Nonnull
  public ServerEndpoints getSecureImapServer() {
    return secureImapServer;
  }

  public void setSecureImapServer(@javax.annotation.Nonnull ServerEndpoints secureImapServer) {
    this.secureImapServer = secureImapServer;
  }


  public ImapSmtpAccessServers smtpServer(@javax.annotation.Nonnull ServerEndpoints smtpServer) {
    this.smtpServer = smtpServer;
    return this;
  }

  /**
   * Get smtpServer
   * @return smtpServer
   */
  @javax.annotation.Nonnull
  public ServerEndpoints getSmtpServer() {
    return smtpServer;
  }

  public void setSmtpServer(@javax.annotation.Nonnull ServerEndpoints smtpServer) {
    this.smtpServer = smtpServer;
  }


  public ImapSmtpAccessServers secureSmtpServer(@javax.annotation.Nonnull ServerEndpoints secureSmtpServer) {
    this.secureSmtpServer = secureSmtpServer;
    return this;
  }

  /**
   * Get secureSmtpServer
   * @return secureSmtpServer
   */
  @javax.annotation.Nonnull
  public ServerEndpoints getSecureSmtpServer() {
    return secureSmtpServer;
  }

  public void setSecureSmtpServer(@javax.annotation.Nonnull ServerEndpoints secureSmtpServer) {
    this.secureSmtpServer = secureSmtpServer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImapSmtpAccessServers imapSmtpAccessServers = (ImapSmtpAccessServers) o;
    return Objects.equals(this.imapServer, imapSmtpAccessServers.imapServer) &&
        Objects.equals(this.secureImapServer, imapSmtpAccessServers.secureImapServer) &&
        Objects.equals(this.smtpServer, imapSmtpAccessServers.smtpServer) &&
        Objects.equals(this.secureSmtpServer, imapSmtpAccessServers.secureSmtpServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imapServer, secureImapServer, smtpServer, secureSmtpServer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImapSmtpAccessServers {\n");
    sb.append("    imapServer: ").append(toIndentedString(imapServer)).append("\n");
    sb.append("    secureImapServer: ").append(toIndentedString(secureImapServer)).append("\n");
    sb.append("    smtpServer: ").append(toIndentedString(smtpServer)).append("\n");
    sb.append("    secureSmtpServer: ").append(toIndentedString(secureSmtpServer)).append("\n");
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
    openapiFields.add("imapServer");
    openapiFields.add("secureImapServer");
    openapiFields.add("smtpServer");
    openapiFields.add("secureSmtpServer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("imapServer");
    openapiRequiredFields.add("secureImapServer");
    openapiRequiredFields.add("smtpServer");
    openapiRequiredFields.add("secureSmtpServer");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImapSmtpAccessServers
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!ImapSmtpAccessServers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImapSmtpAccessServers is not found in the empty JSON string", ImapSmtpAccessServers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImapSmtpAccessServers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImapSmtpAccessServers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImapSmtpAccessServers.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `imapServer`
      ServerEndpoints.validateJsonElement(jsonObj.get("imapServer"));
      // validate the required field `secureImapServer`
      ServerEndpoints.validateJsonElement(jsonObj.get("secureImapServer"));
      // validate the required field `smtpServer`
      ServerEndpoints.validateJsonElement(jsonObj.get("smtpServer"));
      // validate the required field `secureSmtpServer`
      ServerEndpoints.validateJsonElement(jsonObj.get("secureSmtpServer"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImapSmtpAccessServers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImapSmtpAccessServers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImapSmtpAccessServers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImapSmtpAccessServers.class));

       return (TypeAdapter<T>) new TypeAdapter<ImapSmtpAccessServers>() {
           @Override
           public void write(JsonWriter out, ImapSmtpAccessServers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImapSmtpAccessServers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImapSmtpAccessServers given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImapSmtpAccessServers
   * @throws IOException if the JSON string is invalid with respect to ImapSmtpAccessServers
   */
  public static ImapSmtpAccessServers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImapSmtpAccessServers.class);
  }

  /**
   * Convert an instance of ImapSmtpAccessServers to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

