

# ImportEmailOptions

Options for importing a raw RFC822/MIME email into a specific inbox. V1 supports MIME-family formats such as `.eml`, `message/rfc822`, and raw MIME bytes. Outlook `.msg`, `mbox`, and `maildir` are not supported in V1.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rawEmailBase64** | **String** | Base64 encoded RFC822/MIME email contents. This should be the full raw email including headers and body, such as the bytes from an &#x60;.eml&#x60; file. |  |
|**externalId** | **String** | Optional external identifier for the imported email source. Useful for correlating imports back to another system. |  [optional] |
|**runPipeline** | **Boolean** | When true the normal inbound receive pipeline runs after persistence, including automations, webhooks, transformers, forwarders, repliers, and related fanout. When false the email is stored only. |  [optional] |
|**overrideMessageId** | **Boolean** | When true MailSlurp rewrites the MIME &#x60;Message-ID&#x60; header before storing and parsing the email so imported messages do not collide with existing message identities. |  [optional] |



