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

/**
 * PhonePlanDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-02T07:51:12.286Z[GMT]")
public class PhonePlanDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  /**
   * Gets or Sets phoneCountry
   */
  @JsonAdapter(PhoneCountryEnum.Adapter.class)
  public enum PhoneCountryEnum {
    US("US"),
    
    GB("GB");

    private String value;

    PhoneCountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneCountryEnum fromValue(String value) {
      for (PhoneCountryEnum b : PhoneCountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneCountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneCountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneCountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneCountryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_COUNTRY = "phoneCountry";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY)
  private PhoneCountryEnum phoneCountry;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;


  public PhonePlanDto id(UUID id) {
    
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


  public PhonePlanDto userId(UUID userId) {
    
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


  public PhonePlanDto phoneCountry(PhoneCountryEnum phoneCountry) {
    
    this.phoneCountry = phoneCountry;
    return this;
  }

   /**
   * Get phoneCountry
   * @return phoneCountry
  **/
  @ApiModelProperty(required = true, value = "")

  public PhoneCountryEnum getPhoneCountry() {
    return phoneCountry;
  }


  public void setPhoneCountry(PhoneCountryEnum phoneCountry) {
    this.phoneCountry = phoneCountry;
  }


  public PhonePlanDto createdAt(OffsetDateTime createdAt) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhonePlanDto phonePlanDto = (PhonePlanDto) o;
    return Objects.equals(this.id, phonePlanDto.id) &&
        Objects.equals(this.userId, phonePlanDto.userId) &&
        Objects.equals(this.phoneCountry, phonePlanDto.phoneCountry) &&
        Objects.equals(this.createdAt, phonePlanDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, phoneCountry, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonePlanDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    phoneCountry: ").append(toIndentedString(phoneCountry)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
