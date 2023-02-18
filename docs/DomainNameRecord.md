

# DomainNameRecord

DNS Record required for verification of a domain. Record vary depending on domain type.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Domain Name Server Record Types | 
**name** | **String** |  | 
**recordEntries** | **List&lt;String&gt;** |  | 
**ttl** | **Long** |  | 



## Enum: RecordTypeEnum

Name | Value
---- | -----
A | &quot;A&quot;
NS | &quot;NS&quot;
MD | &quot;MD&quot;
MF | &quot;MF&quot;
CNAME | &quot;CNAME&quot;
SOA | &quot;SOA&quot;
MB | &quot;MB&quot;
MG | &quot;MG&quot;
MR | &quot;MR&quot;
NULL | &quot;NULL&quot;
WKS | &quot;WKS&quot;
PTR | &quot;PTR&quot;
HINFO | &quot;HINFO&quot;
MINFO | &quot;MINFO&quot;
MX | &quot;MX&quot;
TXT | &quot;TXT&quot;
RP | &quot;RP&quot;
AFSDB | &quot;AFSDB&quot;
X25 | &quot;X25&quot;
ISDN | &quot;ISDN&quot;
RT | &quot;RT&quot;
NSAP | &quot;NSAP&quot;
NSAP_PTR | &quot;NSAP_PTR&quot;
SIG | &quot;SIG&quot;
KEY | &quot;KEY&quot;
PX | &quot;PX&quot;
GPOS | &quot;GPOS&quot;
AAAA | &quot;AAAA&quot;
LOC | &quot;LOC&quot;
NXT | &quot;NXT&quot;
EID | &quot;EID&quot;
NIMLOC | &quot;NIMLOC&quot;
SRV | &quot;SRV&quot;
ATMA | &quot;ATMA&quot;
NAPTR | &quot;NAPTR&quot;
KX | &quot;KX&quot;
CERT | &quot;CERT&quot;
A6 | &quot;A6&quot;
DNAME | &quot;DNAME&quot;
SINK | &quot;SINK&quot;
OPT | &quot;OPT&quot;
APL | &quot;APL&quot;
DS | &quot;DS&quot;
SSHFP | &quot;SSHFP&quot;
IPSECKEY | &quot;IPSECKEY&quot;
RRSIG | &quot;RRSIG&quot;
NSEC | &quot;NSEC&quot;
DNSKEY | &quot;DNSKEY&quot;
DHCID | &quot;DHCID&quot;
NSEC3 | &quot;NSEC3&quot;
NSEC3PARAM | &quot;NSEC3PARAM&quot;
TLSA | &quot;TLSA&quot;
SMIMEA | &quot;SMIMEA&quot;
HIP | &quot;HIP&quot;
NINFO | &quot;NINFO&quot;
RKEY | &quot;RKEY&quot;
TALINK | &quot;TALINK&quot;
CDS | &quot;CDS&quot;
CDNSKEY | &quot;CDNSKEY&quot;
OPENPGPKEY | &quot;OPENPGPKEY&quot;
CSYNC | &quot;CSYNC&quot;
ZONEMD | &quot;ZONEMD&quot;
SVCB | &quot;SVCB&quot;
HTTPS | &quot;HTTPS&quot;
SPF | &quot;SPF&quot;
UINFO | &quot;UINFO&quot;
UID | &quot;UID&quot;
GID | &quot;GID&quot;
UNSPEC | &quot;UNSPEC&quot;
NID | &quot;NID&quot;
L32 | &quot;L32&quot;
L64 | &quot;L64&quot;
LP | &quot;LP&quot;
EUI48 | &quot;EUI48&quot;
EUI64 | &quot;EUI64&quot;
TKEY | &quot;TKEY&quot;
TSIG | &quot;TSIG&quot;
IXFR | &quot;IXFR&quot;
AXFR | &quot;AXFR&quot;
MAILB | &quot;MAILB&quot;
MAILA | &quot;MAILA&quot;
ANY | &quot;ANY&quot;
URI | &quot;URI&quot;
CAA | &quot;CAA&quot;
AVC | &quot;AVC&quot;
DOA | &quot;DOA&quot;
AMTRELAY | &quot;AMTRELAY&quot;
TA | &quot;TA&quot;
DLV | &quot;DLV&quot;



