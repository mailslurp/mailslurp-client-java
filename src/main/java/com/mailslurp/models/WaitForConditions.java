/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
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
import com.mailslurp.models.MatchOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Conditions that a &#x60;waitForXEmails&#x60; endpoint operates on. The methods wait until given conditions are met or a timeout is reached. If the conditions are met without needing to wait the results will be returned immediately.
 */
@ApiModel(description = "Conditions that a `waitForXEmails` endpoint operates on. The methods wait until given conditions are met or a timeout is reached. If the conditions are met without needing to wait the results will be returned immediately.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-10T16:54:54.535Z[GMT]")
public class WaitForConditions {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  /**
   * How should the found count be compared to the expected count.
   */
  @JsonAdapter(CountTypeEnum.Adapter.class)
  public enum CountTypeEnum {
    EXACTLY("EXACTLY"),
    
    ATLEAST("ATLEAST");

    private String value;

    CountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountTypeEnum fromValue(String value) {
      for (CountTypeEnum b : CountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNT_TYPE = "countType";
  @SerializedName(SERIALIZED_NAME_COUNT_TYPE)
  private CountTypeEnum countType;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_MATCHES = "matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private List<MatchOption> matches = null;

  /**
   * Direction to sort matching emails by created time
   */
  @JsonAdapter(SortDirectionEnum.Adapter.class)
  public enum SortDirectionEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    SortDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortDirectionEnum fromValue(String value) {
      for (SortDirectionEnum b : SortDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortDirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_DIRECTION = "sortDirection";
  @SerializedName(SERIALIZED_NAME_SORT_DIRECTION)
  private SortDirectionEnum sortDirection;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout;

  public static final String SERIALIZED_NAME_UNREAD_ONLY = "unreadOnly";
  @SerializedName(SERIALIZED_NAME_UNREAD_ONLY)
  private Boolean unreadOnly;


  public WaitForConditions count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of results that should match conditions. Either exactly or at least this amount based on the &#x60;countType&#x60;. If count condition is not met and the timeout has not been reached the &#x60;waitFor&#x60; method will retry the operation.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of results that should match conditions. Either exactly or at least this amount based on the `countType`. If count condition is not met and the timeout has not been reached the `waitFor` method will retry the operation.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public WaitForConditions countType(CountTypeEnum countType) {
    
    this.countType = countType;
    return this;
  }

   /**
   * How should the found count be compared to the expected count.
   * @return countType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How should the found count be compared to the expected count.")

  public CountTypeEnum getCountType() {
    return countType;
  }


  public void setCountType(CountTypeEnum countType) {
    this.countType = countType;
  }


  public WaitForConditions inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * ID of inbox to search within and apply conditions to. Essentially filtering the emails found to give a count.
   * @return inboxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of inbox to search within and apply conditions to. Essentially filtering the emails found to give a count.")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public WaitForConditions matches(List<MatchOption> matches) {
    
    this.matches = matches;
    return this;
  }

  public WaitForConditions addMatchesItem(MatchOption matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<MatchOption>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Conditions that should be matched for an email to qualify for results. Each condition will be applied in order to each email within an inbox to filter a result list of matching emails you are waiting for.
   * @return matches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions that should be matched for an email to qualify for results. Each condition will be applied in order to each email within an inbox to filter a result list of matching emails you are waiting for.")

  public List<MatchOption> getMatches() {
    return matches;
  }


  public void setMatches(List<MatchOption> matches) {
    this.matches = matches;
  }


  public WaitForConditions sortDirection(SortDirectionEnum sortDirection) {
    
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * Direction to sort matching emails by created time
   * @return sortDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Direction to sort matching emails by created time")

  public SortDirectionEnum getSortDirection() {
    return sortDirection;
  }


  public void setSortDirection(SortDirectionEnum sortDirection) {
    this.sortDirection = sortDirection;
  }


  public WaitForConditions timeout(Long timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Max time in milliseconds to retry the &#x60;waitFor&#x60; operation until conditions are met.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max time in milliseconds to retry the `waitFor` operation until conditions are met.")

  public Long getTimeout() {
    return timeout;
  }


  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public WaitForConditions unreadOnly(Boolean unreadOnly) {
    
    this.unreadOnly = unreadOnly;
    return this;
  }

   /**
   * Apply conditions only to **unread** emails. All emails begin with &#x60;read&#x3D;false&#x60;. An email is marked &#x60;read&#x3D;true&#x60; when an &#x60;EmailDto&#x60; representation of it has been returned to the user at least once. For example you have called &#x60;getEmail&#x60; or &#x60;waitForLatestEmail&#x60; etc., or you have viewed the email in the dashboard. 
   * @return unreadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply conditions only to **unread** emails. All emails begin with `read=false`. An email is marked `read=true` when an `EmailDto` representation of it has been returned to the user at least once. For example you have called `getEmail` or `waitForLatestEmail` etc., or you have viewed the email in the dashboard. ")

  public Boolean getUnreadOnly() {
    return unreadOnly;
  }


  public void setUnreadOnly(Boolean unreadOnly) {
    this.unreadOnly = unreadOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitForConditions waitForConditions = (WaitForConditions) o;
    return Objects.equals(this.count, waitForConditions.count) &&
        Objects.equals(this.countType, waitForConditions.countType) &&
        Objects.equals(this.inboxId, waitForConditions.inboxId) &&
        Objects.equals(this.matches, waitForConditions.matches) &&
        Objects.equals(this.sortDirection, waitForConditions.sortDirection) &&
        Objects.equals(this.timeout, waitForConditions.timeout) &&
        Objects.equals(this.unreadOnly, waitForConditions.unreadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, countType, inboxId, matches, sortDirection, timeout, unreadOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitForConditions {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    countType: ").append(toIndentedString(countType)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    unreadOnly: ").append(toIndentedString(unreadOnly)).append("\n");
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
