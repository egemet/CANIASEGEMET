package canias;

public class GenisHesap {

	public String UREF;
	public String OLCKAL;
	public String REFYUZEY;
	public String OLCHATA;
	public String TESTCOZ;
	public String REFCOZ;
	public String BIRLESHATA;
	public String REFKAYMA;
	public String TEKRAR;
	public String SICFARKI;
	public String REFSIC;
	public String TESTSIC;
	public String TESTOLCISILFARK;
	public String DUZLEMSELLIK;
	public String TESTISILGEN;
	public String REFISILGEN;
	public String MEKANIKETKI;
	public String ORTBLKUZAMA;
	public double TVARYANS;
	public double STDUNCER;
	public double EXPUNCER;
	public String EXPUNCER2;
	public String HATAMESAJI;

	
	
	
	public GenisHesap(){}
	public GenisHesap(String uref,String olckal,String refyuzey,String testcoz,String refcoz,String olchata,String birleshata,String duzlemsellik,String refkayma,String ortblkuzama,String tekrar,String sicfarki,String refsic,String testsic,String testolcisilfark,String sicfarkitestref,String halfdgt,String testokuhata,
			double tvaryans,double stduncer,double expuncer,String expuncer2,String hatamesaji) {
		this.BIRLESHATA=birleshata;
		this.EXPUNCER=expuncer;
		this.EXPUNCER2 = expuncer2;
		this.OLCHATA=olchata;
		this.UREF = uref;
		this.OLCKAL = olckal;
		this.REFYUZEY = refyuzey;
		this.TESTCOZ = testcoz;
		this.REFCOZ = refcoz;
		this.REFKAYMA = refkayma;
		this.SICFARKI = sicfarki;
		this.REFSIC = refsic;
		this.TESTSIC = testsic;
		this.TESTISILGEN = sicfarkitestref;
		this.TESTOLCISILFARK = testolcisilfark;
		this.DUZLEMSELLIK = duzlemsellik;
		this.STDUNCER = stduncer;
		this.TEKRAR = tekrar;
		this.MEKANIKETKI = testokuhata;
		this.REFISILGEN = halfdgt;
		this.ORTBLKUZAMA=ortblkuzama;
		this.TVARYANS = tvaryans;
		this.HATAMESAJI = hatamesaji;

		
	}
	public String getREFYUZEY() {
		return REFYUZEY;
	}
	public void setREFYUZEY(String rEFYUZEY) {
		REFYUZEY = rEFYUZEY;
	}
	public String getHATAMESAJI() {
		return HATAMESAJI;
	}
	public void setHATAMESAJI(String hATAMESAJI) {
		HATAMESAJI = hATAMESAJI;
	}

	public String getUREF() {
		return UREF;
	}
	public void setUREF(String uREF) {
		UREF = uREF;
	}
	public String getOLCKAL() {
		return OLCKAL;
	}
	public void setOLCKAL(String oLCKAL) {
		OLCKAL = oLCKAL;
	}

	public String getOLCHATA() {
		return OLCHATA;
	}
	public void setOLCHATA(String oLCHATA) {
		OLCHATA = oLCHATA;
	}
	public String getBIRLESHATA() {
		return BIRLESHATA;
	}
	public void setBIRLESHATA(String bIRLESHATA) {
		BIRLESHATA = bIRLESHATA;
	}
	public String getREFKAYMA() {
		return REFKAYMA;
	}
	public void setREFKAYMA(String rEFKAYMA) {
		REFKAYMA = rEFKAYMA;
	}
	public String getTEKRAR() {
		return TEKRAR;
	}
	public void setTEKRAR(String tEKRAR) {
		TEKRAR = tEKRAR;
	}
	public String getSICFARKI() {
		return SICFARKI;
	}
		public void setSICFARKI(String sICFARKI) {
		SICFARKI = sICFARKI;
	}
	public String getREFSIC() {
	return REFSIC;
	}
	public void setREFSIC(String rEFSIC) {
	REFSIC = rEFSIC;
	}
	public String getTESTSIC() {
	return TESTSIC;
	}
	public void setTESTSIC(String tESTSIC) {
		TESTSIC = tESTSIC;
	}
	public String getTESTISILGEN() {
		return TESTISILGEN;
	}
	public void setTESTISILGEN(String tESTISILGEN) {
		TESTISILGEN = tESTISILGEN;
	}
	public String getREFISILGEN() {
		return REFISILGEN;
	}
	public void setREFISILGEN(String rEFISILGEN) {
		REFISILGEN = rEFISILGEN;
	}
	public String getMEKANIKETKI() {
		return MEKANIKETKI;
	}
	public void setMEKANIKETKI(String mEKANIKETKI) {
		MEKANIKETKI = mEKANIKETKI;
	}
	public double getTVARYANS() {
		return TVARYANS;
	}
	public void setTVARYANS(double tVARYANS) {
		TVARYANS = tVARYANS;
	}
	public double getSTDUNCER() {
		return STDUNCER;
	}
	public void setSTDUNCER(double sTDUNCER) {
		STDUNCER = sTDUNCER;
	}
	public double getEXPUNCER() {
		return EXPUNCER;
	}
	public void setEXPUNCER(double eXPUNCER) {
		EXPUNCER = eXPUNCER;
	}
	public String getEXPUNCER2() {
		return EXPUNCER2;
	}
	public void setEXPUNCER2(String eXPUNCER2) {
		EXPUNCER2 = eXPUNCER2;
	}
	public String getTESTCOZ() {
		return TESTCOZ;
	}
	public void setTESTCOZ(String tESTCOZ) {
		TESTCOZ = tESTCOZ;
	}
	public String getREFCOZ() {
		return REFCOZ;
	}
	public void setREFCOZ(String rEFCOZ) {
		REFCOZ = rEFCOZ;
	}
	public String getTESTOLCISILFARK() {
		return TESTOLCISILFARK;
	}
	public void setTESTOLCISILFARK(String tESTOLCISILFARK) {
		TESTOLCISILFARK = tESTOLCISILFARK;
	}

	public String getORTBLKUZAMA() {
		return ORTBLKUZAMA;
	}
	public void setORTBLKUZAMA(String oRTBLKUZAMA) {
		ORTBLKUZAMA = oRTBLKUZAMA;
	}

	public String getDUZLEMSELLIK() {
		return DUZLEMSELLIK;
	}
	public void setDUZLEMSELLIK(String dUZLEMSELLIK) {
		DUZLEMSELLIK = dUZLEMSELLIK;
	}
	
	
}
