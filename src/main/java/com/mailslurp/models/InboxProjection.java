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
 * InboxProjection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-11T22:05:12.115Z[GMT]")
public class InboxProjection {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_FAVOURITE = "favourite";
  @SerializedName(SERIALIZED_NAME_FAVOURITE)
  private Boolean favourite;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  /**
   * Gets or Sets inboxType
   */
  @JsonAdapter(InboxTypeEnum.Adapter.class)
  public enum InboxTypeEnum {
    HTTP_INBOX("HTTP_INBOX"),
    
    SMTP_INBOX("SMTP_INBOX");

    private String value;

    InboxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InboxTypeEnum fromValue(String value) {
      for (InboxTypeEnum b : InboxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InboxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InboxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InboxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InboxTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INBOX_TYPE = "inboxType";
  @SerializedName(SERIALIZED_NAME_INBOX_TYPE)
  private InboxTypeEnum inboxType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TEAM_ACCESS = "teamAccess";
  @SerializedName(SERIALIZED_NAME_TEAM_ACCESS)
  private Boolean teamAccess;


  public InboxProjection createdAt(OffsetDateTime createdAt) {
    
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


  public InboxProjection emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public InboxProjection favourite(Boolean favourite) {
    
    this.favourite = favourite;
    return this;
  }

   /**
   * Get favourite
   * @return favourite
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getFavourite() {
    return favourite;
  }


  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }


  public InboxProjection id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public InboxProjection inboxType(InboxTypeEnum inboxType) {
    
    this.inboxType = inboxType;
    return this;
  }

   /**
   * Get inboxType
   * @return inboxType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InboxTypeEnum getInboxType() {
    return inboxType;
  }


  public void setInboxType(InboxTypeEnum inboxType) {
    this.inboxType = inboxType;
  }


  public InboxProjection name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InboxProjection tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public InboxProjection addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public InboxProjection teamAccess(Boolean teamAccess) {
    
    this.teamAccess = teamAccess;
    return this;
  }

   /**
   * Get teamAccess
   * @return teamAccess
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getTeamAccess() {
    return teamAccess;
  }


  public void setTeamAccess(Boolean teamAccess) {
    this.teamAccess = teamAccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboxProjection inboxProjection = (InboxProjection) o;
    return Objects.equals(this.createdAt, inboxProjection.createdAt) &&
        Objects.equals(this.emailAddress, inboxProjection.emailAddress) &&
        Objects.equals(this.favourite, inboxProjection.favourite) &&
        Objects.equals(this.id, inboxProjection.id) &&
        Objects.equals(this.inboxType, inboxProjection.inboxType) &&
        Objects.equals(this.name, inboxProjection.name) &&
        Objects.equals(this.tags, inboxProjection.tags) &&
        Objects.equals(this.teamAccess, inboxProjection.teamAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, emailAddress, favourite, id, inboxType, name, tags, teamAccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboxProjection {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxType: ").append(toIndentedString(inboxType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamAccess: ").append(toIndentedString(teamAccess)).append("\n");
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

