

# ImapMailboxStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The mailbox name. |  |
|**readOnly** | **Boolean** | True if the mailbox is open in read-only mode. |  |
|**items** | **Object** | Results map |  |
|**flags** | **List&lt;String&gt;** | The mailbox flags. |  |
|**permanentFlags** | **List&lt;String&gt;** | The mailbox permanent flags. |  |
|**unseenSeqNum** | **Long** | The sequence number of the first unseen message in the mailbox. |  |
|**messages** | **Integer** | The number of messages in this mailbox. |  |
|**recent** | **Integer** | The number of messages not seen since the last time the mailbox was opened. |  |
|**unseen** | **Integer** | The number of unread messages. |  |
|**uidNext** | **Long** | The next UID. |  |
|**uidValidity** | **Integer** | Together with a UID, it is a unique identifier for a message. Must be greater than or equal to 1. |  |
|**appendLimit** | **Integer** | Per-mailbox limit of message size. Set only if server supports the APPENDLIMIT extension |  [optional] |



