package com.ebix.ifbieapp.common;

/**
 * @author ArivumaniA
 *
 */
public interface IEappWsConstants {
	/* JSON attributes */
	public static final String OPEN_CURLY_BRACE = "{";
	public static final String CLOSING_CURLY_BRACE = "}";
	public static final String COMMA = ",";
	public static final String COLON = ":";
	public static final String OPEN_SQR_BRACKET = "[";
	public static final String CLOSING_SQR_BRACKET = "]";

	/* Path attributes */
	public static final String PTH_EAPP_WS = "/eappws";
	public static final String PTH_META_DATA = "/metadata";
	public static final String PTH_STATE = "/state";
	public static final String PTH_PRODUCT_TYPE = "/prodtype";
	public static final String PTH_BASE_PLANS = "/baseplans";
	public static final String PTH_PLAN_RATE_CLASS = "/planrateclass";
	public static final String PTH_NICOTINE_TYPE = "/nicotinetype";
	public static final String PTH_LEVEL_YEAR = "/levelyear";
	public static final String PTH_DIVD_OPT_TYPE = "/divdopttype";
	public static final String PTH_NME_PREFIX = "/nmeprefix";
	public static final String PTH_NME_SUFFIX = "/nmesuffix";
	public static final String PTH_COUNTRY = "/country";
	public static final String PTH_US_STATES = "/usstates";
	public static final String PTH_GENDER = "/gender";
	public static final String PTH_OCCUPATION = "/occupation";
	public static final String PTH_OCPTN_DUTY = "/ocptnduty";
	public static final String PTH_VISA_TYPE = "/visatype";
	public static final String PTH_BEST_TIME_TO_CALL = "/besttimetocall";
	public static final String PTH_RELATIONSHIP_TYPE = "/relationshiptype";
	public static final String PTH_RELATIONSHIP_B = "/relationshipb";
	public static final String PTH_RELATIONSHIP_C = "/relationshipc";
	public static final String PTH_RELATIONSHIP_F = "/relationshipf";
	public static final String PTH_RELATIONSHIP_I = "/relationshipi";
	public static final String PTH_RELATIONSHIP_O = "/relationshipo";
	public static final String PTH_RELATIONSHIP_P = "/relationshipp";
	public static final String PTH_OWNER_DESN_TYPE = "/ownerdesntype";
	public static final String PTH_OWNER_CATGRY = "/ownercatgry"; // OWNER_CATGRY
	public static final String PTH_BENE_CATEGORY = "/benecatgry";
	public static final String PTH_BENE_TYPE = "/benetype";
	public static final String PTH_BENE_RELTNSHP_TYPE = "/benereltnshptype";
	public static final String PTH_BILLING_MODE_TYPE = "/billingmodetype";
	public static final String PTH_BILLING_FORM_TYPE = "/billingformtype";
	public static final String PTH_BILL_DAY_TYPE = "/billdaytype";

	public static final String PTH_REFRESH = "/refresh";

	public static final String USER_DTLS = "USER_DTLS";

	/* JSON Data attributes */
	public static final String EAPP_META_DATA = "EAPP_META_DATA";
	public static final String META_DATA_MAP = "META_DATA_MAP"; // map name
	public static final String M_STATE = "M_STATE";
	public static final String M_PRODUCT_TYPE = "M_PRODUCT_TYPE";
	public static final String M_BASE_PLANS = "M_BASE_PLANS";
	public static final String M_PLAN_RATE_CLASS = "M_PLAN_RATE_CLASS";
	public static final String M_NICOTINE_TYPE = "M_NICOTINE_TYPE";
	public static final String M_LEVEL_YEAR = "M_LEVEL_YEAR";
	public static final String M_DIVD_OPT_TYPE = "M_DIVD_OPT_TYPE";
	public static final String M_PREFIX = "M_PREFIX";
	public static final String M_SUFFIX = "M_SUFFIX";
	public static final String M_COUNTRY = "M_COUNTRY";
	public static final String M_STATE_UFFL = "M_STATE_UFFL";
	public static final String M_STATE_US = "M_STATE_US";
	public static final String M_GENDER = "M_GENDER";
	public static final String M_OCCUPATION = "M_OCCUPATION";
	public static final String OCPTN_DUTY = "OCPTN_DUTY";
	public static final String M_VISA_TYPE = "M_VISA_TYPE";

	public static final String M_BEST_TIME_TO_CALL = "M_BEST_TIME_TO_CALL";
	public static final String M_RELATIONSHIP = "M_RELATIONSHIP";
	public static final String M_RELATIONSHIP_B = "M_RELATIONSHIP_B";
	public static final String M_RELATIONSHIP_C = "M_RELATIONSHIP_C";
	public static final String M_RELATIONSHIP_F = "M_RELATIONSHIP_F";
	public static final String M_RELATIONSHIP_I = "M_RELATIONSHIP_I";
	public static final String M_RELATIONSHIP_O = "M_RELATIONSHIP_O";
	public static final String M_RELATIONSHIP_P = "M_RELATIONSHIP_P";
	public static final String M_OWNER_TYPE = "M_OWNER_TYPE";
	public static final String OWNER_CATGRY = "OWNER_CATGRY"; // OWNER_CATGRY
	public static final String M_BENE_CATEGORY = "M_BENE_CATEGORY";
	public static final String BENE_TYPE = "BENE_TYPE";
	public static final String BENE_RELATIONSHP_TYPE = "BENE_RELATIONSHP_TYPE";
	public static final String BILLING_MODE_TYPE = "BILLING_MODE_TYPE";
	public static final String BILLING_FORM_TYPE = "BILLING_FORM_TYPE";
	public static final String BILL_DAY_TYPE = "BILL_DAY_TYPE";

	public static final String M_COMPANY = "M_COMPANY";
	public static final String M_MARITAL = "M_MARITAL";
	public static final String M_BEST_PLACE_TO_CALL = "M_BEST_PLACE_TO_CALL";
	public static final String M_UN_EMPLOYMENT_STATUS = "M_UN_EMPLOYMENT_STATUS";
	public static final String M_INSURED_TYPE = "M_INSURED_TYPE";
	public static final String M_RESIDENT_COUNTRY = "M_RESIDENT_COUNTRY";
	public static final String M_OWNER = "M_OWNER";
	public static final String M_OWNER_RELATIONSHIP = "M_OWNER_RELATIONSHIP";
	public static final String M_PAYOR = "M_PAYOR";
	public static final String M_PAYOR_TYPE = "M_PAYOR_TYPE";
	public static final String M_PAYOR_RELATIONSHIP = "M_PAYOR_RELATIONSHIP";
	public static final String M_ESTATE_TYPE = "M_ESTATE_TYPE";
	public static final String M_CHARITABLE_BENEFICIARY = "M_CHARITABLE_BENEFICIARY";
	public static final String M_CASE_TYPE = "M_CASE_TYPE";
	public static final String M_RIDER_TYPES = "M_RIDER_TYPES";

	public static final String BENEFIT_TYPE = "BENEFIT_TYPE";
	public static final String BEST_PLACES_TOCALL = "BEST_PLACES_TOCALL";
	public static final String BEST_TIMES_TOCALL = "BEST_TIMES_TOCALL";
	public static final String BILL_DAY = "BILL_DAY";
	public static final String BILLING_FORM = "BILLING_FORM";
	public static final String BILLING_MODE = "BILLING_MODE";
	public static final String CASE_INSURED_TYPE = "CASE_INSURED_TYPE";
	public static final String CASE_TYPE = "CASE_TYPE";
	public static final String COMPANY = "COMPANY";
	public static final String COUNTRY_SIZE = "COUNTRY_SIZE";
	public static final String EXCHANGE = "EXCHANGE";
	public static final String LINES_OF_BUSINESS = "LINES_OF_BUSINESS";
	public static final String MARITAL_STATUS = "MARITAL_STATUS";
	public static final String NAME_PREFIX = "NAME_PREFIX";
	public static final String NAME_SUFFIX = "NAME_SUFFIX";
	public static final String NO_OF_BENEFICARY = "NO_OF_BENEFICARY";
	public static final String OWNER_TYPE = "OWNER_TYPE";
	public static final String PAYOR_TYPE = "PAYOR_TYPE";
	public static final String PERSONAL_BUSINESS = "PERSONAL_BUSINESS";
	public static final String PLANE_NAME = "PLANE_NAME";

	public static final String POLICY_BEING_REPLACED = "POLICY_BEING_REPLACED";
	public static final String PRIORITY_COLOR = "PRIORITY_COLOR";
	public static final String PRODUCT_TYPE = "PRODUCT_TYPE";
	public static final String RELATIONSHIP = "RELATIONSHIP";
	public static final String RELATIONSHIP_TYP = "RELATIONSHIP_TYP";
	public static final String REVOCABLE = "REVOCABLE";
	public static final String RIDER_TYPE = "RIDER_TYPE";
	public static final String STATE_BY_COUNTRY = "STATE_BY_COUNTRY";
	public static final String STATUSID = "STATUSID";
	public static final String TAXID_CERTIFIED = "TAXID_CERTIFIED";
	public static final String TOBACCO_USAGE_STATUS = "TOBACCO_USAGE_STATUS";
	public static final String CACHE_ENABLE = "CACHE_ENABLE";
	public static final String METADATA_LOAD_TECHNIQUE = "METADATA_LOAD_TECHNIQUE";
	public static final String TRUE = "TRUE";
	public static final String FULLMETADATA = "FULLMETADATA";
	public static final String BENEFICARY = "BENEFICARY";
	public static final String SSN = "SSN";
	public static final String STATE_PRODUCT = "STATE_PRODUCT";
	public static final String BILL_DAY_USE_CODE = "BILL_DAY_USE_CODE";
	public static final String BENRIDER = "BENRIDER";
	public static final String PLAN_FACE_AMOUNT = "PLAN_FACE_AMOUNT";
	public static final String FIELD_RISK_CLASS = "FIELD_RISK_CLASS";
	public static final String UNEMPLOYMENT_STATUS = "UNEMPLOYMENT_STATUS";
	public static final String COMPANY_TYPE = "COMPANY_TYPE";
	public static final String INFORCE_STATUS = "INFORCE_STATUS";
	public static final String BENE_CATEGORY = "BENE_CATEGORY";
	public static final String PREFERENCE_CLASS = "PREFERENCE_CLASS";
	public static final String DYNAUISCREEN_CLASS = "DYNAUISCREEN_CLASS";
	public static final String DYNAUIMAPPING_CLASS = "DYNAUIMAPPING_CLASS";
	public static final String DYNAUIELEMENT_CLASS = "DYNAUIELEMENT_CLASS";
	public static final String QUESTIONARRIE = "QUESTIONARRIE";
	public static final String ESTATE_TYPE = "ESTATE_TYPE";
	public static final String OWNER_CATEGORY = "OWNER_CATEGORY";
	public static final String PRODUCTS = "PRODUCTS";
	public static final String BENEFIT_RIDER_LIST = "BENEFIT_RIDER_LIST";
	public static final String STATE_PLAN_LIST = "STATE_PLAN_LIST";
	public static final String INTEREST_RATE = "INTEREST_REATE";
	public static final String DEATH_BENEFIT_OPTION = "DEATH_BENEFIT_OPTION";
	public static final String DIVIDEND_OPTION = "DIVIDEND_OPTION";
	public static final String PAYOR_CATEGORY = "PAYOR_CATEGORY";
	public static final String RELATIONSHIP_TYPE_MAP = "RELATIONSHIP_TYPE_MAP";
	public static final String ACORD_META_VO = "ACORD_META_VO";
	public static final String APPLICATION_CASE_TYPE = "APPLICATION_CASE_TYPE";
	public static final String Question_getNBProdId = "Question_getNBProdId";
	public static final String Question_getFilterQuery = "Question_getFilterQuery";
	public static final String Question_getAllQuestionDetails = "Question_getAllQuestionDetails";
	public static final String Question_getResponeOptionsList = "Question_getResponeOptionsList";
	public static final String Question_getQuestionnaireQuestionListMap = "Question_getQuestionnaireQuestionListMap";
	public static final String DBVALUE = "DBVALUE";
	public String RIDER_TYPES = "RIDER_TYPES";
}