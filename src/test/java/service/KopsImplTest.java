package service;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import static org.hamcrest.CoreMatchers.*;

import com.bearstearns.bsc_kopsrequest.v1.GetKopsIdInfoRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GetKopsIdInfoResponseType;
import com.bearstearns.bsc_kopsrequest.v1.GroupEntitlementRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GroupEntitlementResponseType;

public class KopsImplTest {

//	@Test
//	public void testGetKopsIdInfoRequestNotNull() {
//		KopsImpl kopsImpl = new KopsImpl();
//		
//		GetKopsIdInfoRequestType getKopsIdInfoRequest = new GetKopsIdInfoRequestType();
//		GetKopsIdInfoResponseType kopsIdInfo = kopsImpl.getKopsIdInfo(getKopsIdInfoRequest);
//		
//		assertThat("KopsIdInfo is not null", kopsIdInfo, not(null));
//		
//		assertThat("KopsIdInfo list is not null", kopsIdInfo.getKopsIdInfo(), not(isEmptyOrNullString()));
//		
//		assertThat("Status is not null", kopsIdInfo.getStatus(), not(nullValue()));
//	}
	
/*	@Test
	public void testGetKopsIdInfoRequestKopsIdEmpty() {
		KopsImpl kopsImpl = new KopsImpl();
		
		GetKopsIdInfoRequestType getKopsIdInfoRequest = new GetKopsIdInfoRequestType();
		GetKopsIdInfoResponseType kopsIdInfo = kopsImpl.getKopsIdInfo(getKopsIdInfoRequest);
		
//		assertThat("KopsIdInfo list is not null", kopsIdInfo.getKopsIdInfo(), not());
		
		assertThat("KopsIdInfo list is not null", kopsIdInfo.getStatus(), not(nullValue()));
	}
	
	@Test
	public void testGroupEntitlement() {
		KopsImpl kopsImpl = new KopsImpl();
		
		GroupEntitlementRequestType groupEntitlementRequest = new GroupEntitlementRequestType();
		GroupEntitlementResponseType groupEntitlement = kopsImpl.groupEntitlement(groupEntitlementRequest);
		
		assertThat("GroupName null", groupEntitlement.getGroupName(), not(nullValue()));
		
		assertThat("FunctionEntitlement null", groupEntitlement.getFunctionEntitlement(), not(nullValue()));
		
		assertThat("DataEntitlement null", groupEntitlement.getDataEntitlement(), not(nullValue()));
		
		assertThat("AccountEntitlement null", groupEntitlement.getAccountEntitlement(), not(nullValue()));
		
		
	}
*/
}
