package service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebResult;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceContext;

import com.bearstearns.bsc_kopsrequest.v1.AccountRangeEntitlementType;
import com.bearstearns.bsc_kopsrequest.v1.AddKopsIdToGroupRequestType;
import com.bearstearns.bsc_kopsrequest.v1.AddKopsIdToGroupResponseType;
import com.bearstearns.bsc_kopsrequest.v1.CapabilityMetaDataRequestType;
import com.bearstearns.bsc_kopsrequest.v1.CapabilityMetaDataResponseType;
import com.bearstearns.bsc_kopsrequest.v1.CreateKopsIdRequestType;
import com.bearstearns.bsc_kopsrequest.v1.CreateKopsIdResponseType;
import com.bearstearns.bsc_kopsrequest.v1.DataEntitlementType;
import com.bearstearns.bsc_kopsrequest.v1.ExpireKopsIdRequestType;
import com.bearstearns.bsc_kopsrequest.v1.ExpireKopsIdResponseType;
import com.bearstearns.bsc_kopsrequest.v1.FunctionEntitlementType;
import com.bearstearns.bsc_kopsrequest.v1.GetFirmInfoRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GetFirmInfoResponseType;
import com.bearstearns.bsc_kopsrequest.v1.GetKopsIdInfoRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GetKopsIdInfoResponseType;
import com.bearstearns.bsc_kopsrequest.v1.GroupCreateDeleteRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GroupCreateDeleteResponseType;
import com.bearstearns.bsc_kopsrequest.v1.GroupEntitlementRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GroupEntitlementResponseType;
import com.bearstearns.bsc_kopsrequest.v1.GroupMembershipRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GroupMembershipResponseType;
import com.bearstearns.bsc_kopsrequest.v1.KopsIdInfoType;
import com.bearstearns.bsc_kopsrequest.v1.ModifyKopsIdRequestType;
import com.bearstearns.bsc_kopsrequest.v1.ModifyKopsIdResponseType;
import com.bearstearns.bsc_kopsrequest.v1.ObjectFactory;
import com.bearstearns.bsc_kopsrequest.v1.RemoveKopsIdFromGroupRequestType;
import com.bearstearns.bsc_kopsrequest.v1.RemoveKopsIdFromGroupResponseType;
import com.bearstearns.bsc_kopsrequest.v1.SetEntitlementRequestType;
import com.bearstearns.bsc_kopsrequest.v1.SetEntitlementResponseType;
import com.bearstearns.bsc_kopsrequest.v1.SetGroupMembershipRequestType;
import com.bearstearns.bsc_kopsrequest.v1.SetGroupMembershipResponseType;
import com.bearstearns.bsc_kopsrequest.v1.UnexpireKopsIdRequestType;
import com.bearstearns.bsc_kopsrequest.v1.UnexpireKopsIdResponseType;
import com.bearstearns.bsc_kopsrequest.v1.YNOnlyIndicatorTypeEnum;
import com.bearstearns.bsc_kopsrequest.v1_0.Kops;
import com.bearstearns.bsc_soap_bscheader.v2.AuthenticationType;
import com.bearstearns.bsc_soap_bscheader.v2.BscHeaderType;
import com.bearstearns.bsc_status.v1.StatusType;
import com.bearstearns.bsc_status.v1.StatusTypeType;

public class KopsImpl implements Kops {
	
	@Resource
	WebServiceContext context;
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@Override
	public GroupCreateDeleteResponseType groupCreateDelete(GroupCreateDeleteRequestType groupCreateDeleteRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UnexpireKopsIdResponseType unexpireKopsId(UnexpireKopsIdRequestType unexpireKopsIdRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupEntitlementResponseType groupEntitlement(GroupEntitlementRequestType groupEntitlementRequest) {
		
		
		GroupEntitlementResponseType createGroupEntitlementResponseType = objectFactory.createGroupEntitlementResponseType();
		
		createGroupEntitlementResponseType.setGroupName(giveGroupName());
		
		//FunctionEntitlement
		List<FunctionEntitlementType> giveFunctionEntitlementList = givecFuntionEntitlementList();
		
		createGroupEntitlementResponseType.getFunctionEntitlement().addAll(giveFunctionEntitlementList);
		
		//DataEntitlement
		List<DataEntitlementType> dataEntitlementList = giveDataEntitlementList();
		createGroupEntitlementResponseType.getDataEntitlement().addAll(dataEntitlementList);
		
		//AccountEntitlement
		List<AccountRangeEntitlementType> accountRangeEntitlementList = giveAccountRangeEntitlementList();
		
		createGroupEntitlementResponseType.getAccountEntitlement().addAll(accountRangeEntitlementList);
		
//		AccountEntitlementsType createAccountEntitlementsType = objectFactory.createAccountEntitlementsType();
//		createAccountEntitlementsType.getRemoveAccountEntitlement().add(accountRangeEntitlement);//
		
		
		com.bearstearns.bsc_status.v1.ObjectFactory factoryStatus = new com.bearstearns.bsc_status.v1.ObjectFactory();
		StatusType statusType = factoryStatus.createStatusType();
		statusType.setStatusType(StatusTypeType.SUCCESS);
		createGroupEntitlementResponseType.setStatus(statusType);
		
		
		return createGroupEntitlementResponseType;
	}

	private String giveGroupName() {
		return "AXICLRW1";
	}

	private List<FunctionEntitlementType> givecFuntionEntitlementList() {
		List<FunctionEntitlementType> giveFuntionEntitlementList = new ArrayList<FunctionEntitlementType>();

		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FIRST));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.SECOND));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRD));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FOURTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FIFTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.SIXTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.SEVENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.EIGTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.NINETH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.ELEVENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWELFTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTEENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FOURTEENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FIFTEENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.SIXTEENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.SEVENTEENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.EIGHTEENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTIETH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYFIRST));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYSECOND));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYTHIRD));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYFOURTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYFIFTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYSIXTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYSEVENTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYEIGHTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.TWENTYNINETH));

		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTIETH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYFIRST));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYSECOND));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYTHIRD));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYFOURTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYFIFTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYSIXTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYSEVENTH));
		
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYEIGHTH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.THIRTYNINETH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FOURTIETH));
		giveFuntionEntitlementList.add(giveFuntionEntitlement(FuntionEntitlementEnum.FOURTYFIRST));
		
		return giveFuntionEntitlementList;
	}

	private FunctionEntitlementType giveFuntionEntitlement(FuntionEntitlementEnum functionEntitlementEnum) {
		FunctionEntitlementType createFunctionEntitlementType = objectFactory.createFunctionEntitlementType();
		createFunctionEntitlementType.setFunctionName(functionEntitlementEnum.getFunctionName());
		createFunctionEntitlementType.setReadUpdateAccess(functionEntitlementEnum.getReadUpdateAccess());
		createFunctionEntitlementType.setAccessLevel(null);
		return createFunctionEntitlementType;
	}	

	private List<AccountRangeEntitlementType> giveAccountRangeEntitlementList() {
		List<AccountRangeEntitlementType> accountRangeEntitlementList = new ArrayList<AccountRangeEntitlementType>();

		accountRangeEntitlementList.add(giveAccountRangeEntitlement(AccountRangeEntitlementTypeEnum.FIRST));
		accountRangeEntitlementList.add(giveAccountRangeEntitlement(AccountRangeEntitlementTypeEnum.SECOND));
		accountRangeEntitlementList.add(giveAccountRangeEntitlement(AccountRangeEntitlementTypeEnum.THIRD));
		accountRangeEntitlementList.add(giveAccountRangeEntitlement(AccountRangeEntitlementTypeEnum.FOURTH));
		
		return accountRangeEntitlementList;
	}

	private AccountRangeEntitlementType giveAccountRangeEntitlement(AccountRangeEntitlementTypeEnum accountRangeEntitlementTypeEnum) {
		AccountRangeEntitlementType accountRangeEntitlement = objectFactory.createAccountRangeEntitlementType();
		accountRangeEntitlement.setFromAccount(accountRangeEntitlementTypeEnum.getFromAccount());
		accountRangeEntitlement.setToAccount(accountRangeEntitlementTypeEnum.getToAccount());
		return accountRangeEntitlement;
	}
	
	private List<DataEntitlementType> giveDataEntitlementList() {
		List<DataEntitlementType> dataEntitlementList = new ArrayList<DataEntitlementType>();
		
		dataEntitlementList.add(giveDataEntitlement(DataEntitlementTypeEnum.FIRST));
		dataEntitlementList.add(giveDataEntitlement(DataEntitlementTypeEnum.SECOND));
		dataEntitlementList.add(giveDataEntitlement(DataEntitlementTypeEnum.THIRD));
		dataEntitlementList.add(giveDataEntitlement(DataEntitlementTypeEnum.FOURTH));
		
		return dataEntitlementList;
	}

	private DataEntitlementType giveDataEntitlement(DataEntitlementTypeEnum dataEntitlementType) {
		DataEntitlementType createDataEntitlementType = objectFactory.createDataEntitlementType();
		createDataEntitlementType.setName(dataEntitlementType.getName());
		createDataEntitlementType.getStringValue().addAll(dataEntitlementType.getStringValues());
		return createDataEntitlementType;
	}

	@Override
	public GroupMembershipResponseType groupMembership(GroupMembershipRequestType groupMembershipRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModifyKopsIdResponseType modifyKopsId(ModifyKopsIdRequestType modifyKopsIdRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetGroupMembershipResponseType setGroupMembership(SetGroupMembershipRequestType setGroupMembershipRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetEntitlementResponseType setEntitlement(SetEntitlementRequestType setEntitlementRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoveKopsIdFromGroupResponseType removeKopsIdFromGroup(
			RemoveKopsIdFromGroupRequestType removeKopsIdFromGroupRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateKopsIdResponseType createKopsId(CreateKopsIdRequestType createKopsIdRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CapabilityMetaDataResponseType capabilityMetaData(CapabilityMetaDataRequestType capabilityMetaDataRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetKopsIdInfoResponseType getKopsIdInfo(GetKopsIdInfoRequestType getKopsIdInfoRequest) {
		
		ObjectFactory factory = new ObjectFactory();
		
		GetKopsIdInfoResponseType getKopsIdInfoResponseType = factory.createGetKopsIdInfoResponseType();
		KopsIdInfoType kopsIdInfoType = new KopsIdInfoType();
		kopsIdInfoType.setKopsID("BSZTCC3A");
		kopsIdInfoType.setFullName("CASHIAN CORRIEA");
		kopsIdInfoType.setFirstName("CORRIEA");
		kopsIdInfoType.setLastName("CASHIAN");
		kopsIdInfoType.setSnacsID("2196586");
		kopsIdInfoType.setSID("I083987");
		kopsIdInfoType.setRelmId("PROF");
        kopsIdInfoType.setPrimaryInd(YNOnlyIndicatorTypeEnum.Y);
        XMLGregorianCalendar creationDate;
        XMLGregorianCalendar expirationDate;
		try {
			DatatypeFactory datatypeFatoryInstance = DatatypeFactory.newInstance();
			creationDate = datatypeFatoryInstance.newXMLGregorianCalendar("2009-09-24-04:00");
			expirationDate = datatypeFatoryInstance.newXMLGregorianCalendar("3000-12-31-05:00");
		} catch (DatatypeConfigurationException e) {
			creationDate = null;
			expirationDate = null;
		}
        kopsIdInfoType.setCreationDate(creationDate);
        kopsIdInfoType.setExpirationDate(expirationDate);

		getKopsIdInfoResponseType.getKopsIdInfo().add(kopsIdInfoType);
		
		com.bearstearns.bsc_status.v1.ObjectFactory factoryStatus = new com.bearstearns.bsc_status.v1.ObjectFactory();
		StatusType statusType = factoryStatus.createStatusType();
		statusType.setStatusType(StatusTypeType.SUCCESS);
		
		getKopsIdInfoResponseType.setStatus(statusType);
		
		return getKopsIdInfoResponseType;
	}

	@Override
	public AddKopsIdToGroupResponseType addKopsIdToGroup(AddKopsIdToGroupRequestType addKopsIdToGroupRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpireKopsIdResponseType expireKopsId(ExpireKopsIdRequestType expireKopsIdRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetFirmInfoResponseType getFirmInfo(GetFirmInfoRequestType getFirmInfoRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@WebResult(header = true, name = "BSCHeader", targetNamespace = "urn:bearstearns.com:bsc.soap.BSCHeader:v1.0", partName = "BSCHeader")
	public BscHeaderType bSCHeader() {
		
		com.bearstearns.bsc_soap_bscheader.v2.ObjectFactory bscFactory = new com.bearstearns.bsc_soap_bscheader.v2.ObjectFactory();
		
		BscHeaderType bscHeaderType = bscFactory.createBscHeaderType();
		
		return bscHeaderType;
		
	}
	
	@WebResult(header = true, name = "Authentication", targetNamespace = "urn:bearstearns.com:bsc.soap.BSCHeader:v1.0", partName = "Authentication")
	public AuthenticationType authentication() {
		
		com.bearstearns.bsc_soap_bscheader.v2.ObjectFactory bscFactory = new com.bearstearns.bsc_soap_bscheader.v2.ObjectFactory();
		
		String userID = "V644866";
		JAXBElement<String> createUserID = bscFactory.createUserID(userID);
		String password = "cswuser123";
		JAXBElement<String> createPassword = bscFactory.createPassword(password);
		JAXBElement<String> createCorrelationID = bscFactory.createCorrelationID(null);
		JAXBElement<String> createSourceInfo = bscFactory.createSourceInfo(null);
		AuthenticationType authenticationType = bscFactory.createAuthenticationType();
		authenticationType.getContent().add(createUserID);
		authenticationType.getContent().add(createPassword);
		authenticationType.getContent().add(createCorrelationID);
		authenticationType.getContent().add(createSourceInfo);
		
		return authenticationType;
	}

}
