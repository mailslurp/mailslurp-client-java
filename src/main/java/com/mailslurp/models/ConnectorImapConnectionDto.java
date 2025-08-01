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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ConnectorImapConnectionDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ConnectorImapConnectionDto {
  public static final String SERIALIZED_NAME_CONNECTOR_ID = "connectorId";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_ID)
  @javax.annotation.Nonnull
  private UUID connectorId;

  public static final String SERIALIZED_NAME_IMAP_HOST = "imapHost";
  @SerializedName(SERIALIZED_NAME_IMAP_HOST)
  @javax.annotation.Nonnull
  private String imapHost;

  public static final String SERIALIZED_NAME_IMAP_PORT = "imapPort";
  @SerializedName(SERIALIZED_NAME_IMAP_PORT)
  @javax.annotation.Nullable
  private Integer imapPort;

  public static final String SERIALIZED_NAME_IMAP_USERNAME = "imapUsername";
  @SerializedName(SERIALIZED_NAME_IMAP_USERNAME)
  @javax.annotation.Nullable
  private String imapUsername;

  public static final String SERIALIZED_NAME_IMAP_PASSWORD = "imapPassword";
  @SerializedName(SERIALIZED_NAME_IMAP_PASSWORD)
  @javax.annotation.Nullable
  private String imapPassword;

  public static final String SERIALIZED_NAME_IMAP_SSL = "imapSsl";
  @SerializedName(SERIALIZED_NAME_IMAP_SSL)
  @javax.annotation.Nullable
  private Boolean imapSsl;

  public static final String SERIALIZED_NAME_SELECT_FOLDER = "selectFolder";
  @SerializedName(SERIALIZED_NAME_SELECT_FOLDER)
  @javax.annotation.Nullable
  private String selectFolder;

  public static final String SERIALIZED_NAME_SEARCH_TERMS = "searchTerms";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS)
  @javax.annotation.Nullable
  private String searchTerms;

  public static final String SERIALIZED_NAME_START_TLS = "startTls";
  @SerializedName(SERIALIZED_NAME_START_TLS)
  @javax.annotation.Nullable
  private Boolean startTls;

  public static final String SERIALIZED_NAME_PROXY_HOST = "proxyHost";
  @SerializedName(SERIALIZED_NAME_PROXY_HOST)
  @javax.annotation.Nullable
  private String proxyHost;

  public static final String SERIALIZED_NAME_PROXY_PORT = "proxyPort";
  @SerializedName(SERIALIZED_NAME_PROXY_PORT)
  @javax.annotation.Nullable
  private Integer proxyPort;

  public static final String SERIALIZED_NAME_PROXY_ENABLED = "proxyEnabled";
  @SerializedName(SERIALIZED_NAME_PROXY_ENABLED)
  @javax.annotation.Nullable
  private Boolean proxyEnabled;

  public static final String SERIALIZED_NAME_LOCAL_HOST_NAME = "localHostName";
  @SerializedName(SERIALIZED_NAME_LOCAL_HOST_NAME)
  @javax.annotation.Nullable
  private String localHostName;

  public static final String SERIALIZED_NAME_MECHANISMS = "mechanisms";
  @SerializedName(SERIALIZED_NAME_MECHANISMS)
  @javax.annotation.Nullable
  private List<String> mechanisms = new ArrayList<>();

  public static final String SERIALIZED_NAME_SSL_PROTOCOLS = "sslProtocols";
  @SerializedName(SERIALIZED_NAME_SSL_PROTOCOLS)
  @javax.annotation.Nullable
  private List<String> sslProtocols = new ArrayList<>();

  public static final String SERIALIZED_NAME_SSL_TRUST = "sslTrust";
  @SerializedName(SERIALIZED_NAME_SSL_TRUST)
  @javax.annotation.Nullable
  private String sslTrust;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public ConnectorImapConnectionDto() {
  }

  public ConnectorImapConnectionDto connectorId(@javax.annotation.Nonnull UUID connectorId) {
    this.connectorId = connectorId;
    return this;
  }

  /**
   * Get connectorId
   * @return connectorId
   */
  @javax.annotation.Nonnull
  public UUID getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(@javax.annotation.Nonnull UUID connectorId) {
    this.connectorId = connectorId;
  }


  public ConnectorImapConnectionDto imapHost(@javax.annotation.Nonnull String imapHost) {
    this.imapHost = imapHost;
    return this;
  }

  /**
   * Get imapHost
   * @return imapHost
   */
  @javax.annotation.Nonnull
  public String getImapHost() {
    return imapHost;
  }

  public void setImapHost(@javax.annotation.Nonnull String imapHost) {
    this.imapHost = imapHost;
  }


  public ConnectorImapConnectionDto imapPort(@javax.annotation.Nullable Integer imapPort) {
    this.imapPort = imapPort;
    return this;
  }

  /**
   * Get imapPort
   * @return imapPort
   */
  @javax.annotation.Nullable
  public Integer getImapPort() {
    return imapPort;
  }

  public void setImapPort(@javax.annotation.Nullable Integer imapPort) {
    this.imapPort = imapPort;
  }


  public ConnectorImapConnectionDto imapUsername(@javax.annotation.Nullable String imapUsername) {
    this.imapUsername = imapUsername;
    return this;
  }

  /**
   * Get imapUsername
   * @return imapUsername
   */
  @javax.annotation.Nullable
  public String getImapUsername() {
    return imapUsername;
  }

  public void setImapUsername(@javax.annotation.Nullable String imapUsername) {
    this.imapUsername = imapUsername;
  }


  public ConnectorImapConnectionDto imapPassword(@javax.annotation.Nullable String imapPassword) {
    this.imapPassword = imapPassword;
    return this;
  }

  /**
   * Get imapPassword
   * @return imapPassword
   */
  @javax.annotation.Nullable
  public String getImapPassword() {
    return imapPassword;
  }

  public void setImapPassword(@javax.annotation.Nullable String imapPassword) {
    this.imapPassword = imapPassword;
  }


  public ConnectorImapConnectionDto imapSsl(@javax.annotation.Nullable Boolean imapSsl) {
    this.imapSsl = imapSsl;
    return this;
  }

  /**
   * Get imapSsl
   * @return imapSsl
   */
  @javax.annotation.Nullable
  public Boolean getImapSsl() {
    return imapSsl;
  }

  public void setImapSsl(@javax.annotation.Nullable Boolean imapSsl) {
    this.imapSsl = imapSsl;
  }


  public ConnectorImapConnectionDto selectFolder(@javax.annotation.Nullable String selectFolder) {
    this.selectFolder = selectFolder;
    return this;
  }

  /**
   * Get selectFolder
   * @return selectFolder
   */
  @javax.annotation.Nullable
  public String getSelectFolder() {
    return selectFolder;
  }

  public void setSelectFolder(@javax.annotation.Nullable String selectFolder) {
    this.selectFolder = selectFolder;
  }


  public ConnectorImapConnectionDto searchTerms(@javax.annotation.Nullable String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * Get searchTerms
   * @return searchTerms
   */
  @javax.annotation.Nullable
  public String getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(@javax.annotation.Nullable String searchTerms) {
    this.searchTerms = searchTerms;
  }


  public ConnectorImapConnectionDto startTls(@javax.annotation.Nullable Boolean startTls) {
    this.startTls = startTls;
    return this;
  }

  /**
   * Get startTls
   * @return startTls
   */
  @javax.annotation.Nullable
  public Boolean getStartTls() {
    return startTls;
  }

  public void setStartTls(@javax.annotation.Nullable Boolean startTls) {
    this.startTls = startTls;
  }


  public ConnectorImapConnectionDto proxyHost(@javax.annotation.Nullable String proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

  /**
   * Get proxyHost
   * @return proxyHost
   */
  @javax.annotation.Nullable
  public String getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(@javax.annotation.Nullable String proxyHost) {
    this.proxyHost = proxyHost;
  }


  public ConnectorImapConnectionDto proxyPort(@javax.annotation.Nullable Integer proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

  /**
   * Get proxyPort
   * @return proxyPort
   */
  @javax.annotation.Nullable
  public Integer getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(@javax.annotation.Nullable Integer proxyPort) {
    this.proxyPort = proxyPort;
  }


  public ConnectorImapConnectionDto proxyEnabled(@javax.annotation.Nullable Boolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

  /**
   * Get proxyEnabled
   * @return proxyEnabled
   */
  @javax.annotation.Nullable
  public Boolean getProxyEnabled() {
    return proxyEnabled;
  }

  public void setProxyEnabled(@javax.annotation.Nullable Boolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }


  public ConnectorImapConnectionDto localHostName(@javax.annotation.Nullable String localHostName) {
    this.localHostName = localHostName;
    return this;
  }

  /**
   * Get localHostName
   * @return localHostName
   */
  @javax.annotation.Nullable
  public String getLocalHostName() {
    return localHostName;
  }

  public void setLocalHostName(@javax.annotation.Nullable String localHostName) {
    this.localHostName = localHostName;
  }


  public ConnectorImapConnectionDto mechanisms(@javax.annotation.Nullable List<String> mechanisms) {
    this.mechanisms = mechanisms;
    return this;
  }

  public ConnectorImapConnectionDto addMechanismsItem(String mechanismsItem) {
    if (this.mechanisms == null) {
      this.mechanisms = new ArrayList<>();
    }
    this.mechanisms.add(mechanismsItem);
    return this;
  }

  /**
   * Get mechanisms
   * @return mechanisms
   */
  @javax.annotation.Nullable
  public List<String> getMechanisms() {
    return mechanisms;
  }

  public void setMechanisms(@javax.annotation.Nullable List<String> mechanisms) {
    this.mechanisms = mechanisms;
  }


  public ConnectorImapConnectionDto sslProtocols(@javax.annotation.Nullable List<String> sslProtocols) {
    this.sslProtocols = sslProtocols;
    return this;
  }

  public ConnectorImapConnectionDto addSslProtocolsItem(String sslProtocolsItem) {
    if (this.sslProtocols == null) {
      this.sslProtocols = new ArrayList<>();
    }
    this.sslProtocols.add(sslProtocolsItem);
    return this;
  }

  /**
   * Get sslProtocols
   * @return sslProtocols
   */
  @javax.annotation.Nullable
  public List<String> getSslProtocols() {
    return sslProtocols;
  }

  public void setSslProtocols(@javax.annotation.Nullable List<String> sslProtocols) {
    this.sslProtocols = sslProtocols;
  }


  public ConnectorImapConnectionDto sslTrust(@javax.annotation.Nullable String sslTrust) {
    this.sslTrust = sslTrust;
    return this;
  }

  /**
   * Get sslTrust
   * @return sslTrust
   */
  @javax.annotation.Nullable
  public String getSslTrust() {
    return sslTrust;
  }

  public void setSslTrust(@javax.annotation.Nullable String sslTrust) {
    this.sslTrust = sslTrust;
  }


  public ConnectorImapConnectionDto enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public ConnectorImapConnectionDto createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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


  public ConnectorImapConnectionDto id(@javax.annotation.Nonnull UUID id) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorImapConnectionDto connectorImapConnectionDto = (ConnectorImapConnectionDto) o;
    return Objects.equals(this.connectorId, connectorImapConnectionDto.connectorId) &&
        Objects.equals(this.imapHost, connectorImapConnectionDto.imapHost) &&
        Objects.equals(this.imapPort, connectorImapConnectionDto.imapPort) &&
        Objects.equals(this.imapUsername, connectorImapConnectionDto.imapUsername) &&
        Objects.equals(this.imapPassword, connectorImapConnectionDto.imapPassword) &&
        Objects.equals(this.imapSsl, connectorImapConnectionDto.imapSsl) &&
        Objects.equals(this.selectFolder, connectorImapConnectionDto.selectFolder) &&
        Objects.equals(this.searchTerms, connectorImapConnectionDto.searchTerms) &&
        Objects.equals(this.startTls, connectorImapConnectionDto.startTls) &&
        Objects.equals(this.proxyHost, connectorImapConnectionDto.proxyHost) &&
        Objects.equals(this.proxyPort, connectorImapConnectionDto.proxyPort) &&
        Objects.equals(this.proxyEnabled, connectorImapConnectionDto.proxyEnabled) &&
        Objects.equals(this.localHostName, connectorImapConnectionDto.localHostName) &&
        Objects.equals(this.mechanisms, connectorImapConnectionDto.mechanisms) &&
        Objects.equals(this.sslProtocols, connectorImapConnectionDto.sslProtocols) &&
        Objects.equals(this.sslTrust, connectorImapConnectionDto.sslTrust) &&
        Objects.equals(this.enabled, connectorImapConnectionDto.enabled) &&
        Objects.equals(this.createdAt, connectorImapConnectionDto.createdAt) &&
        Objects.equals(this.id, connectorImapConnectionDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorId, imapHost, imapPort, imapUsername, imapPassword, imapSsl, selectFolder, searchTerms, startTls, proxyHost, proxyPort, proxyEnabled, localHostName, mechanisms, sslProtocols, sslTrust, enabled, createdAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorImapConnectionDto {\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    imapHost: ").append(toIndentedString(imapHost)).append("\n");
    sb.append("    imapPort: ").append(toIndentedString(imapPort)).append("\n");
    sb.append("    imapUsername: ").append(toIndentedString(imapUsername)).append("\n");
    sb.append("    imapPassword: ").append(toIndentedString(imapPassword)).append("\n");
    sb.append("    imapSsl: ").append(toIndentedString(imapSsl)).append("\n");
    sb.append("    selectFolder: ").append(toIndentedString(selectFolder)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    startTls: ").append(toIndentedString(startTls)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
    sb.append("    localHostName: ").append(toIndentedString(localHostName)).append("\n");
    sb.append("    mechanisms: ").append(toIndentedString(mechanisms)).append("\n");
    sb.append("    sslProtocols: ").append(toIndentedString(sslProtocols)).append("\n");
    sb.append("    sslTrust: ").append(toIndentedString(sslTrust)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("connectorId");
    openapiFields.add("imapHost");
    openapiFields.add("imapPort");
    openapiFields.add("imapUsername");
    openapiFields.add("imapPassword");
    openapiFields.add("imapSsl");
    openapiFields.add("selectFolder");
    openapiFields.add("searchTerms");
    openapiFields.add("startTls");
    openapiFields.add("proxyHost");
    openapiFields.add("proxyPort");
    openapiFields.add("proxyEnabled");
    openapiFields.add("localHostName");
    openapiFields.add("mechanisms");
    openapiFields.add("sslProtocols");
    openapiFields.add("sslTrust");
    openapiFields.add("enabled");
    openapiFields.add("createdAt");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connectorId");
    openapiRequiredFields.add("imapHost");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConnectorImapConnectionDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!ConnectorImapConnectionDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectorImapConnectionDto is not found in the empty JSON string", ConnectorImapConnectionDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConnectorImapConnectionDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectorImapConnectionDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectorImapConnectionDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("connectorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectorId").toString()));
      }
      if (!jsonObj.get("imapHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imapHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imapHost").toString()));
      }
      if ((jsonObj.get("imapUsername") != null && !jsonObj.get("imapUsername").isJsonNull()) && !jsonObj.get("imapUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imapUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imapUsername").toString()));
      }
      if ((jsonObj.get("imapPassword") != null && !jsonObj.get("imapPassword").isJsonNull()) && !jsonObj.get("imapPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imapPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imapPassword").toString()));
      }
      if ((jsonObj.get("selectFolder") != null && !jsonObj.get("selectFolder").isJsonNull()) && !jsonObj.get("selectFolder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectFolder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectFolder").toString()));
      }
      if ((jsonObj.get("searchTerms") != null && !jsonObj.get("searchTerms").isJsonNull()) && !jsonObj.get("searchTerms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchTerms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchTerms").toString()));
      }
      if ((jsonObj.get("proxyHost") != null && !jsonObj.get("proxyHost").isJsonNull()) && !jsonObj.get("proxyHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxyHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxyHost").toString()));
      }
      if ((jsonObj.get("localHostName") != null && !jsonObj.get("localHostName").isJsonNull()) && !jsonObj.get("localHostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localHostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localHostName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mechanisms") != null && !jsonObj.get("mechanisms").isJsonNull() && !jsonObj.get("mechanisms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mechanisms` to be an array in the JSON string but got `%s`", jsonObj.get("mechanisms").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sslProtocols") != null && !jsonObj.get("sslProtocols").isJsonNull() && !jsonObj.get("sslProtocols").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslProtocols` to be an array in the JSON string but got `%s`", jsonObj.get("sslProtocols").toString()));
      }
      if ((jsonObj.get("sslTrust") != null && !jsonObj.get("sslTrust").isJsonNull()) && !jsonObj.get("sslTrust").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslTrust` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslTrust").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectorImapConnectionDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectorImapConnectionDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectorImapConnectionDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectorImapConnectionDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectorImapConnectionDto>() {
           @Override
           public void write(JsonWriter out, ConnectorImapConnectionDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectorImapConnectionDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConnectorImapConnectionDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConnectorImapConnectionDto
   * @throws IOException if the JSON string is invalid with respect to ConnectorImapConnectionDto
   */
  public static ConnectorImapConnectionDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectorImapConnectionDto.class);
  }

  /**
   * Convert an instance of ConnectorImapConnectionDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

