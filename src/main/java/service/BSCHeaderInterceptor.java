package service;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.phase.Phase;

import com.bearstearns.bsc_soap_bscheader.v2.AuthenticationType;
import com.bearstearns.bsc_soap_bscheader.v2.BscHeaderType;
import com.bearstearns.bsc_soap_bscheader.v2.ObjectFactory;

public class BSCHeaderInterceptor extends AbstractSoapInterceptor {
	
	private ObjectFactory factory = new ObjectFactory();

	public BSCHeaderInterceptor() {
		super(Phase.POST_LOGICAL);
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		//TODO add validation
		
		List<Header> headers = message.getHeaders();
		try {
			AuthenticationType authenticationType = factory.createAuthenticationType();
			//TODO configure username and password
			authenticationType.getContent().add(factory.createUserID("V644866"));
			authenticationType.getContent().add(factory.createPassword("cswuser123"));

			BscHeaderType createBscHeaderType = factory.createBscHeaderType();

			createBscHeaderType.setAuthentication(authenticationType);

			JAXBElement<BscHeaderType> createBSCHeader = factory.createBSCHeader(createBscHeaderType);

			Header header = new Header(createBSCHeader.getName(), createBSCHeader,
					new JAXBDataBinding(BscHeaderType.class));

			headers.add(header);
		} catch (Exception e) {
			throw new RuntimeException("Error creating authentication header.", e);
		}
		message.put(Header.HEADER_LIST, headers);
	}

}
