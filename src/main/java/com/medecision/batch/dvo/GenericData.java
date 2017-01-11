package com.medecision.batch.dvo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericData {
	private static final Logger log = LoggerFactory.getLogger(GenericData.class);	
	private Map<String, Object> json_map = new HashMap<String, Object>();

	private String jsonDocument;
	private String claimNumber;
	private String baseKey;
	private String claimLineNumber;
	private String sourceIdentifier;
	private String id;
	private String status;
	private String isLatest;
	private String membershipId;
	private String memberId;
	private String providerId;
	private String subscriberId;
	private String specialities;
	private String overallRequestStatusDescription;
	private String attributedProviderId;
	private String startOfServiceDate;
	private String one;
	private String admittingDxTypeCode;
	private String allowedAmountClaimLevel;
	private String allowedAmountLineLevel;
	private String claimAdjustmentTypeCode;
	private String claimLineProcedureCode;
	private String claimReceivedDate;
	private String claimServicingProviderId;
	private String claimStatus;
	private String clientId;
	private String dischargeCode;
	private String divisionId;
	private String healthPlanCode;
	private String organizationId;
	private String placeOfService;
	private String placeOfServiceDesc;
	private String principalDx;
	private String principalDxTypeCode;
	private String principalProcedureCode;
	private String principalProcedureCodeType;
	private String processDate;
	private String revenueCode;
	private String serviceUnits;
	private String servicingProviderId;
	private String subClientId;
	private String endOfServiceDate;
	private String subscriberDateOfBirth;
	private String subscriberFirstName;
	private String subscriberGender;
	private String subscriberLastName;
	private String subscriberMiddleName;
	private String typeOfService;
	private String procedureCode0;
	private String dxCode0;
	private String dxCode1;
	private String dxCode2;
	private String dxCode3;
	private String dxCode4;
	private String dxCode5;
	private String dxCode6;
	private String dxCode7;
	private String dxCode8;
	private String dxCode9;
	private String dxCode10;
	private String dxCode11;
	private String dxCodeType0;
	private String dxCodeType1;
	private String dxCodeType2;
	private String dxCodeType3;
	private String dxCodeType4;
	private String dxCodeType5;
	private String dxCodeType6;
	private String dxCodeType7;
	private String dxCodeType8;
	private String dxCodeType9;
	private String dxCodeType10;
	private String dxCodeType11;
	private String procedureCode1;
	private String procedureCode2;
	private String procedureCode3;
	private String procedureCode4;
	private String procedureCode5;
	private String procedureCode6;
	private String procedureCode7;
	private String procedureCode8;
	private String procedureCode9;
	private String procedureCode10;
	private String procedureCode11;
	private String procedureCodeType0;
	private String procedureCodeType1;
	private String procedureCodeType2;
	private String procedureCodeType3;
	private String procedureCodeType4;
	private String procedureCodeType5;
	private String procedureCodeType6;
	private String procedureCodeType7;
	private String procedureCodeType8;
	private String procedureCodeType9;
	private String procedureCodeType10;
	private String procedureCodeType11;
	private String procedureOneCodeModifier1;
	private String procedureOneCodeModifier2;
	private String procedureOneCodeModifier3;
	private String procedureOneCodeModifier4;
	private String dxRelatedGroup;
	
	public String getProcedureOneCodeModifier1() {
		return procedureOneCodeModifier1;
	}

	public void setProcedureOneCodeModifier1(String procedureOneCodeModifier1) {
		this.procedureOneCodeModifier1 = procedureOneCodeModifier1;
	}

	public String getProcedureOneCodeModifier2() {
		return procedureOneCodeModifier2;
	}

	public void setProcedureOneCodeModifier2(String procedureOneCodeModifier2) {
		this.procedureOneCodeModifier2 = procedureOneCodeModifier2;
	}

	public String getProcedureOneCodeModifier3() {
		return procedureOneCodeModifier3;
	}

	public void setProcedureOneCodeModifier3(String procedureOneCodeModifier3) {
		this.procedureOneCodeModifier3 = procedureOneCodeModifier3;
	}

	public String getProcedureOneCodeModifier4() {
		return procedureOneCodeModifier4;
	}

	public void setProcedureOneCodeModifier4(String procedureOneCodeModifier4) {
		this.procedureOneCodeModifier4 = procedureOneCodeModifier4;
	}

	public String getProcedureCodeType0() {
		return procedureCodeType0;
	}

	public void setProcedureCodeType0(String procedureCodeType0) {
		this.procedureCodeType0 = procedureCodeType0;
	}

	public String getProcedureCode1() {
		return procedureCode1;
	}

	public void setProcedureCode1(String procedureCode1) {
		this.procedureCode1 = procedureCode1;
	}

	public String getProcedureCode2() {
		return procedureCode2;
	}

	public void setProcedureCode2(String procedureCode2) {
		this.procedureCode2 = procedureCode2;
	}

	public String getProcedureCode3() {
		return procedureCode3;
	}

	public void setProcedureCode3(String procedureCode3) {
		this.procedureCode3 = procedureCode3;
	}

	public String getProcedureCode4() {
		return procedureCode4;
	}

	public void setProcedureCode4(String procedureCode4) {
		this.procedureCode4 = procedureCode4;
	}

	public String getProcedureCode5() {
		return procedureCode5;
	}

	public void setProcedureCode5(String procedureCode5) {
		this.procedureCode5 = procedureCode5;
	}

	public String getProcedureCode6() {
		return procedureCode6;
	}

	public void setProcedureCode6(String procedureCode6) {
		this.procedureCode6 = procedureCode6;
	}

	public String getProcedureCode7() {
		return procedureCode7;
	}

	public void setProcedureCode7(String procedureCode7) {
		this.procedureCode7 = procedureCode7;
	}

	public String getProcedureCode8() {
		return procedureCode8;
	}

	public void setProcedureCode8(String procedureCode8) {
		this.procedureCode8 = procedureCode8;
	}

	public String getProcedureCode9() {
		return procedureCode9;
	}

	public void setProcedureCode9(String procedureCode9) {
		this.procedureCode9 = procedureCode9;
	}

	public String getProcedureCode10() {
		return procedureCode10;
	}

	public void setProcedureCode10(String procedureCode10) {
		this.procedureCode10 = procedureCode10;
	}

	public String getProcedureCode11() {
		return procedureCode11;
	}

	public void setProcedureCode11(String procedureCode11) {
		this.procedureCode11 = procedureCode11;
	}

	public String getProcedureCodeType1() {
		return procedureCodeType1;
	}

	public void setProcedureCodeType1(String procedureCodeType1) {
		this.procedureCodeType1 = procedureCodeType1;
	}

	public String getProcedureCodeType2() {
		return procedureCodeType2;
	}

	public void setProcedureCodeType2(String procedureCodeType2) {
		this.procedureCodeType2 = procedureCodeType2;
	}

	public String getProcedureCodeType3() {
		return procedureCodeType3;
	}

	public void setProcedureCodeType3(String procedureCodeType3) {
		this.procedureCodeType3 = procedureCodeType3;
	}

	public String getProcedureCodeType4() {
		return procedureCodeType4;
	}

	public void setProcedureCodeType4(String procedureCodeType4) {
		this.procedureCodeType4 = procedureCodeType4;
	}

	public String getProcedureCodeType5() {
		return procedureCodeType5;
	}

	public void setProcedureCodeType5(String procedureCodeType5) {
		this.procedureCodeType5 = procedureCodeType5;
	}

	public String getProcedureCodeType6() {
		return procedureCodeType6;
	}

	public void setProcedureCodeType6(String procedureCodeType6) {
		this.procedureCodeType6 = procedureCodeType6;
	}

	public String getProcedureCodeType7() {
		return procedureCodeType7;
	}

	public void setProcedureCodeType7(String procedureCodeType7) {
		this.procedureCodeType7 = procedureCodeType7;
	}

	public String getProcedureCodeType8() {
		return procedureCodeType8;
	}

	public void setProcedureCodeType8(String procedureCodeType8) {
		this.procedureCodeType8 = procedureCodeType8;
	}

	public String getProcedureCodeType9() {
		return procedureCodeType9;
	}

	public void setProcedureCodeType9(String procedureCodeType9) {
		this.procedureCodeType9 = procedureCodeType9;
	}

	public String getProcedureCodeType10() {
		return procedureCodeType10;
	}

	public void setProcedureCodeType10(String procedureCodeType10) {
		this.procedureCodeType10 = procedureCodeType10;
	}

	public String getProcedureCodeType11() {
		return procedureCodeType11;
	}

	public void setProcedureCodeType11(String procedureCodeType11) {
		this.procedureCodeType11 = procedureCodeType11;
	}

	public String getDxRelatedGroup() {
		return dxRelatedGroup;
	}

	public void setDxRelatedGroup(String dxRelatedGroup) {
		this.dxRelatedGroup = dxRelatedGroup;
	}

	public String getDxCodeType11() {
		return dxCodeType11;
	}

	public void setDxCodeType11(String dxCodeType11) {
		this.dxCodeType11 = dxCodeType11;
	}

	public String getDxCodeType0() {
		return dxCodeType0;
	}

	public void setDxCodeType0(String dxCodeType0) {
		this.dxCodeType0 = dxCodeType0;
	}

	public String getDxCodeType1() {
		return dxCodeType1;
	}

	public void setDxCodeType1(String dxCodeType1) {
		this.dxCodeType1 = dxCodeType1;
	}

	public String getDxCodeType2() {
		return dxCodeType2;
	}

	public void setDxCodeType2(String dxCodeType2) {
		this.dxCodeType2 = dxCodeType2;
	}

	public String getDxCodeType3() {
		return dxCodeType3;
	}

	public void setDxCodeType3(String dxCodeType3) {
		this.dxCodeType3 = dxCodeType3;
	}

	public String getDxCodeType4() {
		return dxCodeType4;
	}

	public void setDxCodeType4(String dxCodeType4) {
		this.dxCodeType4 = dxCodeType4;
	}

	public String getDxCodeType5() {
		return dxCodeType5;
	}

	public void setDxCodeType5(String dxCodeType5) {
		this.dxCodeType5 = dxCodeType5;
	}

	public String getDxCodeType6() {
		return dxCodeType6;
	}

	public void setDxCodeType6(String dxCodeType6) {
		this.dxCodeType6 = dxCodeType6;
	}

	public String getDxCodeType7() {
		return dxCodeType7;
	}

	public void setDxCodeType7(String dxCodeType7) {
		this.dxCodeType7 = dxCodeType7;
	}

	public String getDxCodeType8() {
		return dxCodeType8;
	}

	public void setDxCodeType8(String dxCodeType8) {
		this.dxCodeType8 = dxCodeType8;
	}

	public String getDxCodeType9() {
		return dxCodeType9;
	}

	public void setDxCodeType9(String dxCodeType9) {
		this.dxCodeType9 = dxCodeType9;
	}

	public String getDxCodeType10() {
		return dxCodeType10;
	}

	public void setDxCodeType10(String dxCodeType10) {
		this.dxCodeType10 = dxCodeType10;
	}
	
	public String getDxCode4() {
		return dxCode4;
	}

	public void setDxCode4(String dxCode4) {
		this.dxCode4 = dxCode4;
	}

	public String getDxCode5() {
		return dxCode5;
	}

	public void setDxCode5(String dxCode5) {
		this.dxCode5 = dxCode5;
	}

	public String getDxCode6() {
		return dxCode6;
	}

	public void setDxCode6(String dxCode6) {
		this.dxCode6 = dxCode6;
	}

	public String getDxCode7() {
		return dxCode7;
	}

	public void setDxCode7(String dxCode7) {
		this.dxCode7 = dxCode7;
	}

	public String getDxCode8() {
		return dxCode8;
	}

	public void setDxCode8(String dxCode8) {
		this.dxCode8 = dxCode8;
	}

	public String getDxCode9() {
		return dxCode9;
	}

	public void setDxCode9(String dxCode9) {
		this.dxCode9 = dxCode9;
	}

	public String getDxCode3() {
		return dxCode3;
	}

	public void setDxCode3(String dxCode3) {
		this.dxCode3 = dxCode3;
	}

	public String getDxCode2() {
		return dxCode2;
	}

	public void setDxCode2(String dxCode2) {
		this.dxCode2 = dxCode2;
	}
	
	public String getDxCode11() {
		return dxCode11;
	}

	public void setDxCode11(String dxCode11) {
		this.dxCode11 = dxCode11;
	}

	public String getDxCode10() {
		return dxCode10;
	}

	public void setDxCode10(String dxCode10) {
		this.dxCode10 = dxCode10;
	}

	public String getDxCode1() {
		return dxCode1;
	}

	public void setDxCode1(String dxCode1) {
		this.dxCode1 = dxCode1;
	}

	public String getAdmittingDxTypeCode() {
		return admittingDxTypeCode;
	}

	public void setAdmittingDxTypeCode(String admittingDxTypeCode) {
		this.admittingDxTypeCode = admittingDxTypeCode;
	}

	public String getAllowedAmountClaimLevel() {
		return allowedAmountClaimLevel;
	}

	public void setAllowedAmountClaimLevel(String allowedAmountClaimLevel) {
		this.allowedAmountClaimLevel = allowedAmountClaimLevel;
	}

	public String getAllowedAmountLineLevel() {
		return allowedAmountLineLevel;
	}

	public void setAllowedAmountLineLevel(String allowedAmountLineLevel) {
		this.allowedAmountLineLevel = allowedAmountLineLevel;
	}

	public String getClaimAdjustmentTypeCode() {
		return claimAdjustmentTypeCode;
	}

	public void setClaimAdjustmentTypeCode(String claimAdjustmentTypeCode) {
		this.claimAdjustmentTypeCode = claimAdjustmentTypeCode;
	}

	public String getClaimLineProcedureCode() {
		return claimLineProcedureCode;
	}

	public void setClaimLineProcedureCode(String claimLineProcedureCode) {
		this.claimLineProcedureCode = claimLineProcedureCode;
	}

	public String getClaimReceivedDate() {
		return claimReceivedDate;
	}

	public void setClaimReceivedDate(String claimReceivedDate) {
		this.claimReceivedDate = claimReceivedDate;
	}

	public String getClaimServicingProviderId() {
		return claimServicingProviderId;
	}

	public void setClaimServicingProviderId(String claimServicingProviderId) {
		this.claimServicingProviderId = claimServicingProviderId;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getDischargeCode() {
		return dischargeCode;
	}

	public void setDischargeCode(String dischargeCode) {
		this.dischargeCode = dischargeCode;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public String getHealthPlanCode() {
		return healthPlanCode;
	}

	public void setHealthPlanCode(String healthPlanCode) {
		this.healthPlanCode = healthPlanCode;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getPlaceOfService() {
		return placeOfService;
	}

	public void setPlaceOfService(String placeOfService) {
		this.placeOfService = placeOfService;
	}

	public String getPlaceOfServiceDesc() {
		return placeOfServiceDesc;
	}

	public void setPlaceOfServiceDesc(String placeOfServiceDesc) {
		this.placeOfServiceDesc = placeOfServiceDesc;
	}

	public String getPrincipalDx() {
		return principalDx;
	}

	public void setPrincipalDx(String principalDx) {
		this.principalDx = principalDx;
	}

	public String getPrincipalDxTypeCode() {
		return principalDxTypeCode;
	}

	public void setPrincipalDxTypeCode(String principalDxTypeCode) {
		this.principalDxTypeCode = principalDxTypeCode;
	}

	public String getPrincipalProcedureCode() {
		return principalProcedureCode;
	}

	public void setPrincipalProcedureCode(String principalProcedureCode) {
		this.principalProcedureCode = principalProcedureCode;
	}

	public String getPrincipalProcedureCodeType() {
		return principalProcedureCodeType;
	}

	public void setPrincipalProcedureCodeType(String principalProcedureCodeType) {
		this.principalProcedureCodeType = principalProcedureCodeType;
	}

	public String getProcessDate() {
		return processDate;
	}

	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}

	public String getRevenueCode() {
		return revenueCode;
	}

	public void setRevenueCode(String revenueCode) {
		this.revenueCode = revenueCode;
	}

	public String getServiceUnits() {
		return serviceUnits;
	}

	public void setServiceUnits(String serviceUnits) {
		this.serviceUnits = serviceUnits;
	}

	public String getServicingProviderId() {
		return servicingProviderId;
	}

	public void setServicingProviderId(String servicingProviderId) {
		this.servicingProviderId = servicingProviderId;
	}

	public String getSubClientId() {
		return subClientId;
	}

	public void setSubClientId(String subClientId) {
		this.subClientId = subClientId;
	}

	public String getEndOfServiceDate() {
		return endOfServiceDate;
	}

	public void setEndOfServiceDate(String endOfServiceDate) {
		this.endOfServiceDate = endOfServiceDate;
	}

	public String getSubscriberDateOfBirth() {
		return subscriberDateOfBirth;
	}

	public void setSubscriberDateOfBirth(String subscriberDateOfBirth) {
		this.subscriberDateOfBirth = subscriberDateOfBirth;
	}

	public String getSubscriberFirstName() {
		return subscriberFirstName;
	}

	public void setSubscriberFirstName(String subscriberFirstName) {
		this.subscriberFirstName = subscriberFirstName;
	}

	public String getSubscriberGender() {
		return subscriberGender;
	}

	public void setSubscriberGender(String subscriberGender) {
		this.subscriberGender = subscriberGender;
	}

	public String getSubscriberLastName() {
		return subscriberLastName;
	}

	public void setSubscriberLastName(String subscriberLastName) {
		this.subscriberLastName = subscriberLastName;
	}

	public String getSubscriberMiddleName() {
		return subscriberMiddleName;
	}

	public void setSubscriberMiddleName(String subscriberMiddleName) {
		this.subscriberMiddleName = subscriberMiddleName;
	}

	public String getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}

	public String getDxCode0() {
		return dxCode0;
	}

	public void setDxCode0(String dxCode0) {
		this.dxCode0 = dxCode0;
	}

	public String getProcedureCode0() {
		return procedureCode0;
	}

	public void setProcedureCode0(String procedureCode0) {
		this.procedureCode0 = procedureCode0;
	}

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getStartOfServiceDate() {
		return startOfServiceDate;
	}

	public void setStartOfServiceDate(String startOfServiceDate) {
		this.startOfServiceDate = startOfServiceDate;
	}

	public String getAttributedProviderId() {
		return attributedProviderId;
	}

	public void setAttributedProviderId(String attributedProviderId) {
		this.attributedProviderId = attributedProviderId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	
	public String getOverallRequestStatusDescription() {
		return overallRequestStatusDescription;
	}

	public void setOverallRequestStatusDescription(String overallRequestStatusDescription) {
		this.overallRequestStatusDescription = overallRequestStatusDescription;
	}

	public String getSpecialities() {
		return specialities;
	}

	public void setSpecialities(String specialities) {
		this.specialities = specialities;
	}

	public GenericData(String json_doc){
		setJsonDocumnet(json_doc);
		//log.info("json_doc is:"+json_doc);
		if(json_map.get("claimNumber")!=null){
			this.claimNumber=(String)json_map.get("claimNumber");
		}
		if(json_map.get("baseKey")!=null){
			this.baseKey=(String)json_map.get("baseKey");
		}
		if(json_map.get("claimLineNumber")!=null){
			this.claimLineNumber=(String)json_map.get("claimLineNumber").toString();
		}
		if(json_map.get("sourceIdentifier")!=null){
			this.sourceIdentifier=(String)json_map.get("sourceIdentifier");
		}
		if(json_map.get("MemberID")!=null){
			this.memberId=(String)json_map.get("MemberID");
		}
		if(json_map.get("memberId")!=null){
			this.memberId=(String)json_map.get("memberId");
		}
		if(json_map.get("membershipId")!=null){
			this.membershipId=(String)json_map.get("membershipId");
		}
		if(json_map.get("subscriberId")!=null){
			this.subscriberId=(String)json_map.get("subscriberId");
		}
		if(json_map.get("_id")!=null){
			this.id=(String)json_map.get("_id");
		}
		if(json_map.get("status")!=null){
			this.status=(String)json_map.get("status");
		}
		if(json_map.get("isLatest")!=null){
			this.isLatest=(String)json_map.get("isLatest");
		}
		if(json_map.get("providerId")!=null){
			this.providerId=(String)json_map.get("providerId");
		}
		if(json_map.get("overallRequestStatusDescription")!=null){
			this.overallRequestStatusDescription=(String)json_map.get("overallRequestStatusDescription");
		}
		if(json_map.get("attributedProviderId")!=null){
			this.attributedProviderId=(String)json_map.get("attributedProviderId");
		}	
		if(json_map.get("startOfServiceDate")!=null){
			this.startOfServiceDate=json_map.get("startOfServiceDate").toString();
		} 
		////////////////////////////////////////////////////////////////////////
		if(json_map.get("admittingDxTypeCode")!=null){
			this.admittingDxTypeCode=json_map.get("admittingDxTypeCode").toString();
		}
		if(json_map.get("allowedAmountClaimLevel”")!=null){
			this.allowedAmountClaimLevel=json_map.get("allowedAmountClaimLevel").toString();
		}
		if(json_map.get("allowedAmountLineLevel")!=null){
			this.allowedAmountLineLevel=json_map.get("allowedAmountLineLevel").toString();
		}
		if(json_map.get("claimAdjustmentTypeCode")!=null){
			this.claimAdjustmentTypeCode=json_map.get("claimAdjustmentTypeCode").toString();
		}
		if(json_map.get("claimLineProcedureCode")!=null){
			this.claimLineProcedureCode=json_map.get("claimLineProcedureCode").toString();
		}
		if(json_map.get("claimReceivedDate")!=null){
			this.claimReceivedDate=json_map.get("claimReceivedDate").toString();
		}
		if(json_map.get("claimServicingProviderId")!=null){
			this.claimServicingProviderId=json_map.get("claimServicingProviderId").toString();
		} 
		if(json_map.get("claimStatus")!=null){
			this.claimStatus=json_map.get("claimStatus").toString();
		} 
		if(json_map.get("clientId")!=null){
			this.clientId=json_map.get("clientId").toString();
		} 
		if(json_map.get("dischargeCode")!=null){
			this.dischargeCode=json_map.get("dischargeCode").toString();
		} 
		if(json_map.get("divisionId")!=null){
			this.divisionId=json_map.get("divisionId").toString();
		} 
		if(json_map.get("healthPlanCode")!=null){
			this.healthPlanCode=json_map.get("healthPlanCode").toString();
		} 
		if(json_map.get("organizationId")!=null){
			this.organizationId=json_map.get("organizationId").toString();
		} 
		if(json_map.get("placeOfService")!=null){
			this.placeOfService=json_map.get("placeOfService").toString();
		} 
		if(json_map.get("placeOfServiceDesc")!=null){
			this.placeOfServiceDesc=json_map.get("placeOfServiceDesc").toString();
		} 
		if(json_map.get("principalDx")!=null){
			this.principalDx=json_map.get("principalDx").toString();
		} 
		if(json_map.get("principalDxTypeCode")!=null){
			this.principalDxTypeCode=json_map.get("principalDxTypeCode").toString();
		} 
		if(json_map.get("principalProcedureCode")!=null){
			this.principalProcedureCode=json_map.get("principalProcedureCode").toString();
		} 
		if(json_map.get("principalProcedureCodeType")!=null){
			this.principalProcedureCodeType=(String)json_map.get("principalProcedureCodeType");
		}
		if(json_map.get("processDate")!=null){
			this.processDate=(String)json_map.get("processDate").toString();
		}
		if(json_map.get("revenueCode")!=null){
			this.revenueCode=(String)json_map.get("revenueCode");
		}
		if(json_map.get("serviceUnits")!=null){
			this.serviceUnits=(String)json_map.get("serviceUnits");
		}
		if(json_map.get("servicingProviderId")!=null){
			this.servicingProviderId=(String)json_map.get("servicingProviderId");
		}
		if(json_map.get("subClientId")!=null){
			this.subClientId=(String)json_map.get("subClientId");
		}
		if(json_map.get("endOfServiceDate")!=null){
			this.endOfServiceDate=(String)json_map.get("endOfServiceDate");
		}
		if(json_map.get("subscriberDateOfBirth")!=null){
			this.subscriberDateOfBirth=(String)json_map.get("subscriberDateOfBirth").toString();
		}
		if(json_map.get("subscriberFirstName")!=null){
			this.subscriberFirstName=(String)json_map.get("subscriberFirstName");
		}
		if(json_map.get("subscriberGender")!=null){
			this.subscriberGender=(String)json_map.get("subscriberGender");
		}
		if(json_map.get("subscriberLastName")!=null){
			this.subscriberLastName=(String)json_map.get("subscriberLastName");
		}
		if(json_map.get("subscriberMiddleName")!=null){
			this.subscriberMiddleName=(String)json_map.get("subscriberMiddleName");
		}
		if(json_map.get("typeOfService")!=null){
			this.typeOfService=(String)json_map.get("typeOfService");
		}
		if(json_map.get("dxCode0")!=null){
			this.dxCode0=(String)json_map.get("dxCode0").toString();
		}
		if(json_map.get("procedureCode0")!=null){
			this.procedureCode0=(String)json_map.get("procedureCode0");
		} 
		if(json_map.get("dxCode1")!=null){
			this.dxCode1=(String)json_map.get("dxCode1").toString();
		}
		if(json_map.get("dxCode2")!=null){
			this.dxCode2=(String)json_map.get("dxCode2").toString();
		}
		if(json_map.get("dxCode10")!=null){
			this.dxCode10=(String)json_map.get("dxCode10").toString();
		}
		if(json_map.get("dxCode11")!=null){
			this.dxCode11=(String)json_map.get("dxCode11").toString();
		}
		///////////////////////////////////////////////////////////////////////
		if(json_map.get("specialities")!=null){
			List<String> list = (ArrayList<String>)json_map.get("specialities");
			String concat = "";
			int i=0;
			for(String anElement: list){
				if(i==0){
					concat=anElement;
				}
				else{
					concat= concat + " : " +anElement;
				}	
				i++;
			}
			this.specialities=concat;
		}
	}

	public GenericData() {
	}
	
	public String getJsonDocument() {
		return jsonDocument;
	}

	public void setJsonDocument(String jsonDocument) {
		this.jsonDocument = jsonDocument;
	}

	
	public String getClaimLineNumber() {
		return claimLineNumber;
	}

	public void setClaimLineNumber(String claimLineNumber) {
		this.claimLineNumber = claimLineNumber;
	}
	
	public Map<String, Object> getJson_map() {
		return json_map;
	}

	public void setJson_map(Map<String, Object> json_map) {
		this.json_map = json_map;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getBaseKey() {
		return baseKey;
	}

	public void setBaseKey(String baseKey) {
		this.baseKey = baseKey;
	}

	public String getJsonDocumnet() {
		return jsonDocument;
	}

	public void setJsonDocumnet(String jsonDocument) {
		this.jsonDocument = jsonDocument;
		this.json_map = extractAsJson(jsonDocument);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSourceIdentifier() {
		return sourceIdentifier;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}
	
	public String getIsLatest() {
		return isLatest;
	}

	public void setIsLatest(String is_latest) {
		this.isLatest = isLatest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	
	public Map<String, Object> extractAsJson(String input){
		Map<String, Object> json_map_temp = null;
		try {
			json_map_temp = new ObjectMapper().readValue(input, new TypeReference<Map<String, Object>>(){});
		} catch (IOException e) {
			log.error("Exception",e);
		}
		return json_map_temp;
	}

	@Override
	public String toString() {
		return "GenericData [ claimNumber=" + claimNumber
				+ ", baseKey=" + baseKey + ", claimLineNumber=" + claimLineNumber + ", sourceIdentifier="
				+ sourceIdentifier + ", id=" + id + ", status=" + status + ", isLatest=" + isLatest + ", membershipId="
				+ membershipId + ", memberId=" + memberId + ", providerId=" + providerId + ", subscriberId="
				+ subscriberId + ", specialities=" + specialities + ", overallRequestStatusDescription="
				+ overallRequestStatusDescription + ", jsonDocument=" + jsonDocument + "]";
	}



	
	
}
