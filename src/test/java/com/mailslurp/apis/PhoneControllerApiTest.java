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


package com.mailslurp.apis;

import com.mailslurp.clients.ApiException;
import com.mailslurp.models.ConsentStatusDto;
import com.mailslurp.models.CreateEmergencyAddressOptions;
import com.mailslurp.models.CreatePhoneNumberOptions;
import com.mailslurp.models.EmergencyAddress;
import com.mailslurp.models.EmergencyAddressDto;
import com.mailslurp.models.EmptyResponseDto;
import java.time.OffsetDateTime;
import com.mailslurp.models.PagePhoneMessageThreadItemProjection;
import com.mailslurp.models.PagePhoneMessageThreadProjection;
import com.mailslurp.models.PagePhoneNumberProjection;
import com.mailslurp.models.PageSentSmsProjection;
import com.mailslurp.models.PageSmsProjection;
import com.mailslurp.models.PhoneNumberDto;
import com.mailslurp.models.PhoneNumberValidationDto;
import com.mailslurp.models.PhonePlanAvailability;
import com.mailslurp.models.PhonePlanDto;
import com.mailslurp.models.SentSmsDto;
import com.mailslurp.models.SetPhoneFavouritedOptions;
import com.mailslurp.models.SmsSendOptions;
import com.mailslurp.models.TestPhoneNumberOptions;
import java.util.UUID;
import com.mailslurp.models.UpdatePhoneNumberOptions;
import com.mailslurp.models.ValidatePhoneNumberOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneControllerApi
 */
@Disabled
public class PhoneControllerApiTest {

    private final PhoneControllerApi api = new PhoneControllerApi();

    /**
     * Create an emergency address
     *
     * Add an emergency address to a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmergencyAddressTest() throws ApiException {
        CreateEmergencyAddressOptions createEmergencyAddressOptions = null;
        EmergencyAddress response = api.createEmergencyAddress(createEmergencyAddressOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Add phone number to your account. Only works if you have already added a plan and an initial phone number in your account and acknowledged the pricing and terms of service by enabling API phone creation.
     *
     * Create new phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPhoneNumberTest() throws ApiException {
        CreatePhoneNumberOptions createPhoneNumberOptions = null;
        PhoneNumberDto response = api.createPhoneNumber(createPhoneNumberOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an emergency address
     *
     * Delete an emergency address
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmergencyAddressTest() throws ApiException {
        UUID addressId = null;
        EmptyResponseDto response = api.deleteEmergencyAddress(addressId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a phone number
     *
     * Remove phone number from account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePhoneNumberTest() throws ApiException {
        UUID phoneNumberId = null;
        api.deletePhoneNumber(phoneNumberId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the latest messages for all phones
     *
     * List all message threads for all phones
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllPhoneMessageThreadsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        PagePhoneMessageThreadProjection response = api.getAllPhoneMessageThreads()
                .page(page)
                .size(size)
                .execute();
        // TODO: test validations
    }

    /**
     * Get consent status
     *
     * Get the status of phone usage consent
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConsentStatusTest() throws ApiException {
        ConsentStatusDto response = api.getConsentStatus()
                .execute();
        // TODO: test validations
    }

    /**
     * Get an emergency address
     *
     * Fetch an emergency address by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmergencyAddressTest() throws ApiException {
        UUID addressId = null;
        EmergencyAddress response = api.getEmergencyAddress(addressId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get emergency addresses
     *
     * List emergency addresses
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmergencyAddressesTest() throws ApiException {
        List<EmergencyAddressDto> response = api.getEmergencyAddresses()
                .execute();
        // TODO: test validations
    }

    /**
     * Get messages in a phone thread
     *
     * List message thread messages for a phone message thread
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneMessageThreadItemsTest() throws ApiException {
        UUID phoneNumberId = null;
        String otherNumber = null;
        Integer page = null;
        Integer size = null;
        PagePhoneMessageThreadItemProjection response = api.getPhoneMessageThreadItems(phoneNumberId, otherNumber)
                .page(page)
                .size(size)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the latest message preview for a thread
     *
     * List message threads for a phone
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneMessageThreadsTest() throws ApiException {
        UUID phoneNumberId = null;
        Integer page = null;
        Integer size = null;
        PagePhoneMessageThreadProjection response = api.getPhoneMessageThreads(phoneNumberId)
                .page(page)
                .size(size)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a phone number by ID
     *
     * Get a phone number by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneNumberTest() throws ApiException {
        UUID phoneNumberId = null;
        PhoneNumberDto response = api.getPhoneNumber(phoneNumberId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a phone number by name
     *
     * Get a phone number by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneNumberByNameTest() throws ApiException {
        String name = null;
        PhoneNumberDto response = api.getPhoneNumberByName(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a phone number by phone number
     *
     * Get a phone number by phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneNumberByPhoneNumberTest() throws ApiException {
        String phoneNumber = null;
        PhoneNumberDto response = api.getPhoneNumberByPhoneNumber(phoneNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * Get phone numbers
     *
     * List phone numbers for account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhoneNumbersTest() throws ApiException {
        String phoneCountry = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        String search = null;
        List<UUID> include = null;
        Boolean favourite = null;
        PagePhoneNumberProjection response = api.getPhoneNumbers()
                .phoneCountry(phoneCountry)
                .page(page)
                .size(size)
                .sort(sort)
                .since(since)
                .before(before)
                .search(search)
                .include(include)
                .favourite(favourite)
                .execute();
        // TODO: test validations
    }

    /**
     * Get phone plans
     *
     * Get phone number plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhonePlansTest() throws ApiException {
        List<PhonePlanDto> response = api.getPhonePlans()
                .execute();
        // TODO: test validations
    }

    /**
     * Get phone plans availability
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPhonePlansAvailabilityTest() throws ApiException {
        PhonePlanAvailability response = api.getPhonePlansAvailability()
                .execute();
        // TODO: test validations
    }

    /**
     * List sent TXT messages for a phone number
     *
     * Get sent SMS messages for a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSentSmsByPhoneNumberTest() throws ApiException {
        UUID phoneNumberId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        String search = null;
        PageSentSmsProjection response = api.getSentSmsByPhoneNumber(phoneNumberId)
                .page(page)
                .size(size)
                .sort(sort)
                .since(since)
                .before(before)
                .search(search)
                .execute();
        // TODO: test validations
    }

    /**
     * List SMS messages for a phone number
     *
     * Get SMS messages for a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSmsByPhoneNumberTest() throws ApiException {
        UUID phoneNumberId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        Boolean unreadOnly = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        String search = null;
        Boolean favourite = null;
        PageSmsProjection response = api.getSmsByPhoneNumber(phoneNumberId)
                .page(page)
                .size(size)
                .sort(sort)
                .unreadOnly(unreadOnly)
                .since(since)
                .before(before)
                .search(search)
                .favourite(favourite)
                .execute();
        // TODO: test validations
    }

    /**
     * Send TXT message from a phone number
     *
     * Send SMS from a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendSmsFromPhoneNumberTest() throws ApiException {
        UUID phoneNumberId = null;
        SmsSendOptions smsSendOptions = null;
        SentSmsDto response = api.sendSmsFromPhoneNumber(phoneNumberId, smsSendOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Set consent status
     *
     * Give or revoke consent for phone usage
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setConsentStatusTest() throws ApiException {
        Boolean agree = null;
        ConsentStatusDto response = api.setConsentStatus(agree)
                .execute();
        // TODO: test validations
    }

    /**
     * Set phone favourited state
     *
     * Set and return new favorite state for a phone
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setPhoneFavouritedTest() throws ApiException {
        UUID phoneNumberId = null;
        SetPhoneFavouritedOptions setPhoneFavouritedOptions = null;
        PhoneNumberDto response = api.setPhoneFavourited(phoneNumberId, setPhoneFavouritedOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Test sending an SMS to a number
     *
     * Test a phone number by sending an SMS to it
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testPhoneNumberSendSmsTest() throws ApiException {
        UUID phoneNumberId = null;
        TestPhoneNumberOptions testPhoneNumberOptions = null;
        String xTestId = null;
        api.testPhoneNumberSendSms(phoneNumberId, testPhoneNumberOptions)
                .xTestId(xTestId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a phone number
     *
     * Set field for phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePhoneNumberTest() throws ApiException {
        UUID phoneNumberId = null;
        UpdatePhoneNumberOptions updatePhoneNumberOptions = null;
        PhoneNumberDto response = api.updatePhoneNumber(phoneNumberId, updatePhoneNumberOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Verify validity of a phone number
     *
     * Validate a phone number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatePhoneNumberTest() throws ApiException {
        ValidatePhoneNumberOptions validatePhoneNumberOptions = null;
        PhoneNumberValidationDto response = api.validatePhoneNumber(validatePhoneNumberOptions)
                .execute();
        // TODO: test validations
    }

}
