**_Git Repo_**<br>
git clone https://mail4muthukumarm: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@github.com/mail4muthukumarm/imsadapter.git


**_Claimant_**<br>

_API_ - **_UpsertClaimantLegal_**<br>
_Request Payload_ - <br>
{
ClaimantGuid (Type: String)
UserGuid (Type: String)
DefenseFirm (Type: String)
DefenseAttorney (Type: String)
DefenseAttorneyFEINSSN (Type: String)
ClaimantAttorneyFirm (Type: String)
ClaimantAttorney (Type: String)
ClaimantAttorneyFEINSSN (Type: String)
Judge (Type: String)
PublishedDecision (Type: Int)
SuitServed (Type: Int)
DateSuitServed (Type: String)
DateSuitAnswered (Type: String)
Defense_ISOCountryCode (Type: String)
Defense_Address1 (Type: String)
Defense_Address2 (Type: String)
Defense_City (Type: String)
Defense_State (Type: String)
Defense_ZipCode (Type: String)
Defense_ZipCodeExtension (Type: String)
Defense_IsInternational (Type: Int)
Defense_InternationalZipCode (Type: String)
ClaimantAttorney_ISOCountryCode (Type: String)
ClaimantAttorney_Address1 (Type: String)
ClaimantAttorney_Address2 (Type: String)
ClaimantAttorney_City (Type: String)
ClaimantAttorney_State (Type: String)
ClaimantAttorney_ZipCode (Type: String)
ClaimantAttorney_ZipCodeExtension (Type: String)
ClaimantAttorney_IsInternational (Type: Int)
ClaimantAttorney_InternationalZipCode (Type: String)
DefenseAttorneyGuid (Type: String)
ClaimantAttorneyGuid (Type: String)
DefenseFirmEntityType (Type: String)
ClaimantAttorneyEntityType (Type: String)
}<br>
_Response Payload_ -<br>
{
DefenseAttorneyGuid (Type: String)
ClaimantAttorneyGuid (Type: String)
ClaimantGuid (Type: String)
status (Type: Boolean)
DebugMessage (Type: String)
} 


**_Vendor_**<br>

_API_ - **_insertAttorney_**<br>
_Request Payload_ - <br>
{
AttorneyGuid (Type: String)
LawFirm (Type: String)
AttorneyName (Type: String)
AttorneyType (Type: String)
FEINSSN (Type: String)
AttorneyEntityType (Type: String)
Address1 (Type: String)
Address2 (Type: String)
City (Type: String)
County (Type: String)
State (Type: String)
ZipCode (Type: String)
ZipPlus (Type: String)
ISOCountryCode (Type: String)
PhoneNumber (Type: String)
FaxNumber (Type: String)
DateCreated (Type: Timestamp)
CreatedBy (Type: String)
}<br>
_Response Payload_ -<br>
{
AddressId (Type: Integer)
status (Type: String)
DebugMessage (Type: String)
} 

API - **_updateAttorney_**<br>
_Request Payload_ -<br> 
{
AttorneyGuid (Type: String)
LawFirm (Type: String)
AttorneyName (Type: String)
AttorneyType (Type: String)
FEINSSN (Type: String)
AttorneyEntityType (Type: String)
Address1 (Type: String)
Address2 (Type: String)
City (Type: String)
County (Type: String)
State (Type: String)
ZipCode (Type: String)
ZipPlus (Type: String)
ISOCountryCode (Type: String)
PhoneNumber (Type: String)
FaxNumber (Type: String)
}<br>
_Response Payload_ -<br>
{ 
status (Type: String)
DebugMessage (Type: String)
} 

API - **_insertOutsideAdjuster_**<br>
_Request Payload_ -<br> 
{
CompanyName (Type: String)
FirstName (Type: String)
MiddleName (Type: String)
LastName (Type: String)
Address1 (Type: String)
Address2 (Type: String)
City (Type: String)
State (Type: String)
ZipCode (Type: String)
ZipCodeExtension (Type: String)
IsInternational (Type: Integer)
InternationalZipCode (Type: String)
ISOCountryCode (Type: String)
EntityType (Type: String)
FEINSSN (Type: String)
UserGuid (Type: String)
EmailAddress (Type: String)
}<br>
_Response Payload_ -<br>
{
AddressId (Type: Integer)
AttorneyGuid (Type: String)
status (Type: String)
DebugMessage (Type: String)
} 

API - **_updateOutsideAdjuster_**<br>
_Request Payload_ -<br> 
{
AdjusterGuid (Type: String)
AddressId  (Type: Integer)
CompanyName (Type: String)
FirstName (Type: String)
MiddleName (Type: String)
LastName (Type: String)
Address1 (Type: String)
Address2 (Type: String)
City (Type: String)
State (Type: String)
ZipCode (Type: String)
ZipCodeExtension (Type: String)
IsInternational (Type: Integer)
InternationalZipCode (Type: String)
ISOCountryCode (Type: String)
EntityType (Type: String)
FEINSSN (Type: String)
UserGuid (Type: String)
EmailAddress (Type: String)
}<br>
_Response Payload_ -<br>
{
AddressId (Type: Integer)
AdjustGuid (Type: String)
status (Type: String)
DebugMessage (Type: String)
} 