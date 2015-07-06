package service;

import com.bearstearns.bsc_kopsrequest.v1.FunctionAccessTypeEnum;

public enum FuntionEntitlementEnum {
	FIRST("MCCOMINQ", FunctionAccessTypeEnum.U),
	SECOND("MCCOMUD", FunctionAccessTypeEnum.U),
	THIRD("MCGLBICD", FunctionAccessTypeEnum.U),
	FOURTH("MCGLBU", FunctionAccessTypeEnum.V),
	FIFTH("MFADJCHG", FunctionAccessTypeEnum.U),
	SIXTH("MFCSPCHG", FunctionAccessTypeEnum.U),
	SEVENTH("MFECTADD", FunctionAccessTypeEnum.U),
	EIGTH("MFECTICD", FunctionAccessTypeEnum.U),
	NINETH("MFEXCADD", FunctionAccessTypeEnum.U),
	
	TENTH("MFEXCCHG", FunctionAccessTypeEnum.U),
	ELEVENTH("MFEXCDEL", FunctionAccessTypeEnum.U),
	TWELFTH("MFEXCINQ", FunctionAccessTypeEnum.U),
	THIRTEENTH("MFFALPHI", FunctionAccessTypeEnum.V),
	FOURTEENTH("MFFALPHU", FunctionAccessTypeEnum.U),
	FIFTEENTH("MFFCAADD", FunctionAccessTypeEnum.U),
	SIXTEENTH("MFFCAICD", FunctionAccessTypeEnum.U),
	SEVENTEENTH("MFFNUMBR", FunctionAccessTypeEnum.U),
	EIGHTEENTH("MFHOREV", FunctionAccessTypeEnum.U),
	NINETEENTH("MFLEGINQ", FunctionAccessTypeEnum.U),
	
	TWENTIETH("MFMCGU", FunctionAccessTypeEnum.U),
	TWENTYFIRST("MFMSDADD", FunctionAccessTypeEnum.U),
	TWENTYSECOND("MFMSDINQ", FunctionAccessTypeEnum.U),
	TWENTYTHIRD("MFNFSPRC", FunctionAccessTypeEnum.U),
	TWENTYFOURTH("MFNTWK", FunctionAccessTypeEnum.U),
	TWENTYFIFTH("MFORDADD", FunctionAccessTypeEnum.U),
	TWENTYSIXTH("MFORDCHG", FunctionAccessTypeEnum.U),
	TWENTYSEVENTH("MFORDDEL", FunctionAccessTypeEnum.U),
	TWENTYEIGHTH("MFORDINQ", FunctionAccessTypeEnum.U),
	TWENTYNINETH("MFREGADD", FunctionAccessTypeEnum.U),
	
	THIRTIETH("MFREGCHG", FunctionAccessTypeEnum.U),
	THIRTYFIRST("MFREGINQ", FunctionAccessTypeEnum.U),
	THIRTYSECOND("MFSYSPUR", FunctionAccessTypeEnum.U),
	THIRTYTHIRD("MFTBLMNT", FunctionAccessTypeEnum.U),
	THIRTYFOURTH("NWACTADD", FunctionAccessTypeEnum.U),
	THIRTYFIFTH("NWACTCHG", FunctionAccessTypeEnum.U),
	THIRTYSIXTH("NWACTDEL", FunctionAccessTypeEnum.U),
	THIRTYSEVENTH("NWACTINQ", FunctionAccessTypeEnum.U),
	THIRTYEIGHTH("NWTRNADD", FunctionAccessTypeEnum.U),
	THIRTYNINETH("NWTRNICD", FunctionAccessTypeEnum.U),

	FOURTIETH("STAGEINQ", FunctionAccessTypeEnum.U),
	FOURTYFIRST("NWACTINQ", FunctionAccessTypeEnum.U);
	
	private String functionName;
	private FunctionAccessTypeEnum readUpdateAccess;

	private FuntionEntitlementEnum(String FunctionName, FunctionAccessTypeEnum ReadUpdateAccess) {
		functionName = FunctionName;
		readUpdateAccess = ReadUpdateAccess;
		
	}

	public String getFunctionName() {
		return functionName;
	}

	public FunctionAccessTypeEnum getReadUpdateAccess() {
		return readUpdateAccess;
	}
	
	
	

}
