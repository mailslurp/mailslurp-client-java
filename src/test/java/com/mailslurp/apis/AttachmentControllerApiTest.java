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


package com.mailslurp.apis;

import com.mailslurp.clients.ApiException;
import com.mailslurp.models.AttachmentMetaData;
import com.mailslurp.models.DownloadAttachmentDto;
import java.io.File;
import com.mailslurp.models.PageAttachmentEntity;
import com.mailslurp.models.UploadAttachmentOptions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentControllerApi
 */
@Ignore
public class AttachmentControllerApiTest {

    private final AttachmentControllerApi api = new AttachmentControllerApi();

    
    /**
     * Delete an attachment
     *
     * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAttachmentTest() throws ApiException {
        String attachmentId = null;
        api.deleteAttachment(attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get email attachment as base64 encoded string as alternative to binary responses. To read the content decode the Base64 encoded contents.
     *
     * Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadAttachmentAsBase64EncodedTest() throws ApiException {
        String attachmentId = null;
        DownloadAttachmentDto response = api.downloadAttachmentAsBase64Encoded(attachmentId);

        // TODO: test validations
    }
    
    /**
     * Download attachments. Get email attachment bytes. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints.
     *
     * Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadAttachmentAsBytesTest() throws ApiException {
        String attachmentId = null;
        byte[] response = api.downloadAttachmentAsBytes(attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get email attachment metadata information
     *
     * Returns the metadata for an attachment. It is saved separately to the content of the attachment. Contains properties &#x60;name&#x60; and &#x60;content-type&#x60; and &#x60;content-length&#x60; in bytes for a given attachment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentInfoTest() throws ApiException {
        String attachmentId = null;
        AttachmentMetaData response = api.getAttachmentInfo(attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get email attachments
     *
     * Get all attachments in paginated response. Each entity contains meta data for the attachment such as &#x60;name&#x60; and &#x60;content-type&#x60;. Use the &#x60;attachmentId&#x60; and the download endpoints to get the file contents.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentsTest() throws ApiException {
        String fileNameFilter = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        PageAttachmentEntity response = api.getAttachments(fileNameFilter, page, size, sort);

        // TODO: test validations
    }
    
    /**
     * Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.
     *
     * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadAttachmentTest() throws ApiException {
        UploadAttachmentOptions uploadOptions = null;
        List<String> response = api.uploadAttachment(uploadOptions);

        // TODO: test validations
    }
    
    /**
     * Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.
     *
     * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadAttachmentBytesTest() throws ApiException {
        String string = null;
        String filename = null;
        byte[] byteArray = null;
        List<String> response = api.uploadAttachmentBytes(string, filename, byteArray);

        // TODO: test validations
    }
    
    /**
     * Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.
     *
     * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadMultipartFormTest() throws ApiException {
        File file = null;
        String contentType = null;
        String filename = null;
        String xFilename = null;
        List<String> response = api.uploadMultipartForm(file, contentType, filename, xFilename);

        // TODO: test validations
    }
    
}
