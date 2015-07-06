package service;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.bearstearns.bsc_kopsrequest.v1.GetKopsIdInfoRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GroupEntitlementRequestType;
import com.bearstearns.bsc_kopsrequest.v1.GroupEntitlementResponseType;

public class KopsImplTest {

	@Test
	@Ignore
	public void testGetKopsIdInfoRequest() {
		KopsImpl kopsImpl = new KopsImpl();
		
		GetKopsIdInfoRequestType getKopsIdInfoRequest = new GetKopsIdInfoRequestType();
		kopsImpl.getKopsIdInfo(getKopsIdInfoRequest);
		
		
	}
	
	@Test
	@Ignore
	public void testGroupEntitlement() {
		KopsImpl kopsImpl = new KopsImpl();
		
		GroupEntitlementRequestType groupEntitlementRequest = new GroupEntitlementRequestType();
		GroupEntitlementResponseType groupEntitlement = kopsImpl.groupEntitlement(groupEntitlementRequest);
		
		assertThat("GroupName not equal", groupEntitlement.getGroupName(), is("AXICLRW1"));
		
		assertThat("FunctionEntitlement not equal", groupEntitlement.getFunctionEntitlement().toString(), is("<urn:FunctionEntitlement><urn:FunctionName>MCCOMINQ</urn:FunctionName><urn:ReadUpdateAccess>U</urn:ReadUpdateAccess><urn:AccessLevel/></urn:FunctionEntitlement>"));
		
		
	}

}
