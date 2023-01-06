package canias;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Hesap {
  public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException { 
	

	  
System.out.println(genisHesap("1", "3"));
	  
//	 System.out.println( dogrusalRegresyon("100#150#200#250#300", "8#12#14#15#16"));
//	 System.out.println( dogrusalRegresyon("2#12#5#10#0", "30#65#50#80#10"));
//	 System.out.println( dogrusalRegresyon("85#77#80#18#3#3#76#88#80#104#101#62#21#74#11#25#66#50#39#94#100#32#4#9", "42#32#35#5#1#1#35#27#32#40#50#25#3#28#4#5#27#20#18#36#45#9#1#5"));
//	 System.out.println( dogrusalRegresyon("0#0.001#0.00501#0.00999#0.04999#0.09999#0.50001#1#10.00001#19.99999#50.00001#81", "0.0000106#0.0000157#0.0000157#0.0000180#0.0000233#0.0000292#0.0000435#0.0000519#0.000113#0.000162#0.000266#0.000576"));
	
  }
  
	public static String UREF(String obhcode,double bolen,double obh,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		
		return obh/bolen+"#"+duyarlilikkatsayisi+"#"+(obh/bolen)*duyarlilikkatsayisi;
	}

	public static String DUZLEMSELLIK(String obhcode,double bolen,double obh,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		obh = 0.07;
	

		return obh/bolen+"#"+duyarlilikkatsayisi+"#"+(obh/bolen)*duyarlilikkatsayisi;
	}

	public static String PARALELLIK(String obhcode,double bolen,double obh,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		obh = 0.059;
		System.out.println("-------"+obh);

		return obh/bolen+"#"+duyarlilikkatsayisi+"#"+(obh/bolen)*duyarlilikkatsayisi;
	}

	
	public static String OLCKAL(String obhcode,double bolen,double obh,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}

		return obh/bolen+"#"+duyarlilikkatsayisi+"#"+(obh/bolen)*duyarlilikkatsayisi;
	}

	
	public static String REFYUZEY(String obhcode,double bolen,double obh,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}

		return obh/bolen+"#"+duyarlilikkatsayisi+"#"+(obh/bolen)*duyarlilikkatsayisi;
	}

	public static String TESTCOZ(String obhcode,double bolen,double cozunurluk,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		
		
		
		if (obhcode.equals("24")) {
			cozunurluk = cozunurluk*1 ;
		}
		if (obhcode.equals("2")) {
			cozunurluk = 0.3 ;
			bolen = 3.46410161513775 ;
		}
		if (obhcode.equals("3")) {
			cozunurluk = 0.3 ;
			bolen = 3.46410161513775 ;
		}

		else {
			cozunurluk = cozunurluk *1000;
		}
		
		
		return cozunurluk/bolen+"#"+duyarlilikkatsayisi+"#"+(cozunurluk/bolen)*duyarlilikkatsayisi;
	}

	public static String REFCOZ(String obhcode,double bolen,double referanscoz,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		return (referanscoz)/bolen+"#"+duyarlilikkatsayisi+"#"+((referanscoz)/bolen)*duyarlilikkatsayisi;
	}
	
	
	
	
	public static String OLCHATA(String obhcode,double bolen,double olchatakatsayisi,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		
		return olchatakatsayisi/bolen+"#"+duyarlilikkatsayisi+"#"+(olchatakatsayisi/bolen)*duyarlilikkatsayisi;
}

	public static String BIRLESHATA(double refolcrange,double calismaaraligi,String obhcode, double bolen, double ref_deger,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		if (obhcode.equals("24")) {
			
			double eklemehata = 0;

			if (calismaaraligi <= refolcrange) {
				eklemehata = 0;
			}
			else {
				eklemehata=((calismaaraligi-refolcrange)/refolcrange);	
			}
			
			ref_deger=eklemehata*0.1;
			
				
			}
		
		return ref_deger/bolen+"#"+duyarlilikkatsayisi+"#"+(ref_deger/bolen)*duyarlilikkatsayisi;
}

	public static String REFKAYMA(String obhcode,double bolen,double kkayma,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		
		
		if (obhcode.equals("98")) {
			
			kkayma=0.03250044250000/1000;
					
		}
		
		if (obhcode.equals("17")) {
			
			kkayma=kkayma*3*2;
					
		}
		
		
		
		return kkayma/bolen+"#"+duyarlilikkatsayisi+"#"+(kkayma/bolen)*duyarlilikkatsayisi;
}
	

	public static String TEKRAR(String obhcode,double bolen,double std_sapma,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;

		
		if (dk== false) {
		
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		
		return std_sapma/bolen+"#"+duyarlilikkatsayisi+"#"+(std_sapma/bolen)*duyarlilikkatsayisi;
}

	public static String SICFARKI(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,double reftestsicfarki,boolean dk) throws ClassNotFoundException, SQLException {
		
		double duyarlilikkatsayisi=0;
		
		if (obhcode.equals("87")) {
			isilkatsayi=0.00000975;	
		}
		
		
		if (dk== false) {
		
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=isilkatsayi*calismaaraligi*1000;
		}
		
		if (obhcode.equals("98")) {
			duyarlilikkatsayisi=0.00025201;	
		
		}
		
		if (obhcode.equals("24")) {		
			reftestsicfarki  = reftestsicfarki*2;
		}

		if (obhcode.equals("1")) {		
			reftestsicfarki  = 0.2;
		}

		
		return (reftestsicfarki / bolen)+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*reftestsicfarki/bolen);
}

	public static String ORTBLKUZAMA(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,double reftestsicfarki,boolean dk) throws ClassNotFoundException, SQLException {
		
		double duyarlilikkatsayisi=0;
		
	
		if (dk== false) {
		
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=isilkatsayi*calismaaraligi*1000;
		}
		
	return (reftestsicfarki / bolen)+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*reftestsicfarki/bolen);
}

	
	
	public static String REFSIC(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,double reftestsicfarki,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		
		if (obhcode.equals("87")) {
			isilkatsayi=0.00000975;	
		}
		
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=isilkatsayi*calismaaraligi*1000;
		}
		
		if (obhcode.equals("98")) {
			duyarlilikkatsayisi=-isilkatsayi*50.0018;		
			reftestsicfarki  = 0.119;
		}

		if (obhcode.equals("17")) {		
			reftestsicfarki  = reftestsicfarki*(isilkatsayi*0.1)*calismaaraligi*1000;
		}
		
		if (obhcode.equals("87")) {		
			reftestsicfarki  = reftestsicfarki/2;
		}

	
		return reftestsicfarki/bolen+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*reftestsicfarki/bolen);
}

	public static String TESTSIC(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,double reftestsicfarki,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		
		if (obhcode.equals("87")) {
			isilkatsayi=0.00000975;	
		}
		
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=isilkatsayi*calismaaraligi*1000;
			
		}
	
	if (obhcode.equals("98")) {
		duyarlilikkatsayisi=-isilkatsayi*8;
		reftestsicfarki = 0.119;
	}

	if (obhcode.equals("17")) {		
		reftestsicfarki  = reftestsicfarki*(isilkatsayi*0.1)*calismaaraligi*1000;
	}

	if (obhcode.equals("87")) {		
		reftestsicfarki  = reftestsicfarki/2;
	}
		
		return reftestsicfarki/bolen+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*reftestsicfarki/bolen);
}
	
	
	public static String TESTISILGEN(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=-1*8;
		}
		
		if (obhcode.equals("1")) {		
			duyarlilikkatsayisi  = calismaaraligi*1000*0.2;
		}
		
		

		if (obhcode.equals("1")) {		
			System.out.println(isilkatsayi);
			isilkatsayi = isilkatsayi*0.2;
		}
		else {
			isilkatsayi = 0.000001;
		}

		
		return isilkatsayi/bolen+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*isilkatsayi/bolen);
}


	public static String REFISILGEN(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=-1*50.00177;
		}
	
		return 0.000001/bolen+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*0.000001/bolen);
}
	
	public static String TESTOLCISILFARK(String obhcode,double bolen,double calismaaraligi,double isilkatsayi,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=42.00177000000;

		}
		calismaaraligi=0.0000055/bolen;

		return 0.0000055/bolen+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*0.0000055/bolen);
}
	
	

	public static String MEKANIKETKI(String obhcode,double bolen,double cozunurluk,boolean dk) throws ClassNotFoundException, SQLException {
		double duyarlilikkatsayisi=0;
		if (dk== false) {
			
		duyarlilikkatsayisi=1;
		}
		else {
			duyarlilikkatsayisi=1;
		}
		return 0.0004*1000/bolen+"#" +(duyarlilikkatsayisi)+"#"+(duyarlilikkatsayisi*(0.0004*1000/bolen));
}
	  
	public static double TVARYANS(String degerler) throws ClassNotFoundException, SQLException {
		
		double toplam=0;
		String[] arr_varyans=degerler.split("#");
		for(int i=0; i<arr_varyans.length; i++) {
			toplam +=Math.pow(Double.parseDouble(arr_varyans[i]),2);
		}
			return toplam;
		
		}
		
	public static GenisHesap genisHesap(String okftype,String okfnum) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		GenisHesap nesne = new GenisHesap();
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";
		
		
		double toplam = 0;
		String obhtype = "";
		String obhcode = "";
		String ckodu = "";
		String kaldate = "";
		double calismaaraligi = 0;
		double refolcrange = 0;
		double cozunurluk = 0;
		double isilkatsayi = 0;
		double meauncer = 0;
		double referanscoz = 0;
		double reftestsicfarki = 0;
		double differ = 0;
		double drift = 0;
		double std_sapma = 0;
		
		
		
		query = "select * from EGMSERT001 where OKFTYPE='"+okftype+"' and OKFNUM = '"+okfnum+"' ";
		System.out.println(query);
		rs = st.executeQuery(query);
		while(rs.next()) {
			obhcode = rs.getString("OBHCODE");
			obhtype = rs.getString("OBHTYPE");
			
			kaldate = sdf.format(rs.getTimestamp("CALDATE"));
			calismaaraligi = rs.getDouble("OLMAX1");
			cozunurluk = rs.getDouble("COZUNURLUK1");
			System.out.println(cozunurluk);
			isilkatsayi = (rs.getDouble("DECHAM1")+rs.getDouble("DECHAM2"))/2;
			reftestsicfarki =  rs.getDouble("DECHAM3")-rs.getDouble("DECHAM4");
		}
		
		String olcumler = "";
		query = "select * from EGMSERT002 where OKFTYPE='"+okftype+"' and OKFNUM = '"+okfnum+"' ";
		System.out.println(query);
		rs = st.executeQuery(query);
		while(rs.next()) {
			olcumler += rs.getDouble("OLC1")+"#";
		}
		
		std_sapma = standartSapma(olcumler);
		
		System.out.println("CKODU :"+ckodu+" CALDATE:"+kaldate);
				
		query = "select E4.*,E2.DAGILIMNAME,E2.BOLEN from EGMOBHT004 E4 JOIN EGMOBHT002 E2 ON E4.DAGILIM = E2.DAGILIMNO  where E4.OBHTYPE='"+obhtype+"' and E4.OBHNO = '"+obhcode+"' and E4.RCODE not in ('TVARYANS','STDUNCER','EXPUNCER','EXPUNCER2') and E4.AKTIF = 1";
		System.out.println(query);
		rs = st.executeQuery(query);
		while(rs.next()) {
			String ekc_return="";
			ckodu = rs.getString("REFCIHAZ");
			if (rs.wasNull()) {
				ckodu ="";
			}
			if (!ckodu.equals("")) {
			ekc_return = ekcDenGetir(ckodu, kaldate,obhtype,obhcode,calismaaraligi);
			System.out.println(ekc_return);
			meauncer = Double.parseDouble(ekc_return.split("#")[0]);
			differ = Double.parseDouble(ekc_return.split("#")[1]);
			drift = Double.parseDouble(ekc_return.split("#")[2]);
			referanscoz = Double.parseDouble(ekc_return.split("#")[3]);
			refolcrange = Double.parseDouble(ekc_return.split("#")[4]);
			}
			
		
			boolean duykat=rs.getBoolean("ISCOFF");
			if(rs.wasNull()) {
				duykat = false;
			}
			
			
		if(rs.getString("RCODE").equals("UREF")) {
			
			String tmpuref=UREF(obhcode,rs.getDouble("BOLEN"), meauncer,duykat);
			nesne.setUREF(nesne.getUREF()+"]"+tmpuref);
			toplam += Math.pow(Double.parseDouble(tmpuref.split("#")[2]), 2);
		}

		if(rs.getString("RCODE").equals("DUZLEMSELLIK")) {
			
			String tmpuref=DUZLEMSELLIK(obhcode,rs.getDouble("BOLEN"), meauncer,duykat);
			nesne.setDUZLEMSELLIK(nesne.getDUZLEMSELLIK()+"]"+tmpuref);
			toplam += Math.pow(Double.parseDouble(tmpuref.split("#")[2]), 2);
		}

		if(rs.getString("RCODE").equals("PARALELLIK")) {
			
			String tmpuref=PARALELLIK(obhcode,rs.getDouble("BOLEN"), meauncer,duykat);
			nesne.setPARALELLIK(nesne.getPARALELLIK()+"]"+tmpuref);
			toplam += Math.pow(Double.parseDouble(tmpuref.split("#")[2]), 2);
		}
		
		
		if(rs.getString("RCODE").equals("OLCKAL")) {
			
			String tmpuref=OLCKAL(obhcode,rs.getDouble("BOLEN"), meauncer,duykat);
			nesne.setOLCKAL(nesne.getOLCKAL()+"]"+tmpuref);
			toplam += Math.pow(Double.parseDouble(tmpuref.split("#")[2]), 2);
		}

		
		
		if(rs.getString("RCODE").equals("REFYUZEY")) {
			nesne.setREFYUZEY(REFYUZEY(obhcode,rs.getDouble("BOLEN"), meauncer,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.REFYUZEY.split("#")[2]), 2);
		}
		
		if(rs.getString("RCODE").equals("TESTCOZ")) {
			nesne.setTESTCOZ(TESTCOZ(obhcode,rs.getDouble("BOLEN"), cozunurluk,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.TESTCOZ.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("REFCOZ")) {
			nesne.setREFCOZ(REFCOZ(obhcode,rs.getDouble("BOLEN"), referanscoz,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.REFCOZ.split("#")[2]), 2);
		}

		if(rs.getString("RCODE").equals("OLCHATA")) {
			nesne.setOLCHATA(OLCHATA(obhcode,rs.getDouble("BOLEN"), differ,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.OLCHATA.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("BIRLESHATA")) {
			nesne.setBIRLESHATA(BIRLESHATA(refolcrange,calismaaraligi,obhcode,rs.getDouble("BOLEN"), 0,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.BIRLESHATA.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("REFKAYMA")) {
			nesne.setREFKAYMA(REFKAYMA(obhcode,rs.getDouble("BOLEN"), drift,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.REFKAYMA.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("TEKRAR")) {
			nesne.setTEKRAR(TEKRAR(obhcode,rs.getDouble("BOLEN"), std_sapma,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.TEKRAR.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("TESTISILGEN")) {
			nesne.setTESTISILGEN(TESTISILGEN(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.TESTISILGEN.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("SICFARKI")) {
			nesne.setSICFARKI(SICFARKI(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,reftestsicfarki,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.SICFARKI.split("#")[2]), 2);
		}

		if(rs.getString("RCODE").equals("ORTBLKUZAMA")) {
			nesne.setORTBLKUZAMA(ORTBLKUZAMA(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,reftestsicfarki,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.ORTBLKUZAMA.split("#")[2]), 2);
		}
		
		
		if(rs.getString("RCODE").equals("REFSIC")) {
			nesne.setREFSIC(REFSIC(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,reftestsicfarki,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.REFSIC.split("#")[2]), 2);
	}

		if(rs.getString("RCODE").equals("TESTSIC")) {
			nesne.setTESTSIC(TESTSIC(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,reftestsicfarki,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.TESTSIC.split("#")[2]), 2);
		}
		
		if(rs.getString("RCODE").equals("TESTOLCISILFARK")) {
			nesne.setTESTOLCISILFARK(TESTOLCISILFARK(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.TESTOLCISILFARK.split("#")[2]), 2);
		}

		
		
		if(rs.getString("RCODE").equals("REFISILGEN")) {
			nesne.setREFISILGEN(REFISILGEN(obhcode,rs.getDouble("BOLEN"), calismaaraligi,isilkatsayi,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.REFISILGEN.split("#")[2]), 2);
		}
		if(rs.getString("RCODE").equals("MEKANIKETKI")) {
			nesne.setMEKANIKETKI(MEKANIKETKI(obhcode,rs.getDouble("BOLEN"), cozunurluk,duykat));
			toplam += Math.pow(Double.parseDouble(nesne.MEKANIKETKI.split("#")[2]), 2);
		}
		
		
	
		
//			for(int m=0;m<arr_method.length;m++) {
//				boolean hata =false;
//				System.out.println("Method : "+arr_method[m].getName());
//				if(arr_method[m].getName().equals(rs.getString("RCODE"))) {
//					double func = 0;
//					
//					if(arr_method[m].getName().startsWith("REFBEL")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),meauncer);	
//						hata = true;
//					}
//					if(arr_method[m].getName().startsWith("OLCHATA")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),differ);	
//						hata = true;
//					}
//					if(arr_method[m].getName().startsWith("BIRLESHATA")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),0);	
//						hata = true;
//					}
//					if(arr_method[m].getName().startsWith("REFKAYMA")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),drift);	
//						hata = true;
//					}
//					if(arr_method[m].getName().startsWith("TEKRAR")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),std_sapma);	
//						hata = true;
//					}
//					if(arr_method[m].getName().startsWith("SICFARKI")) {
//					func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),calismaaraligi,isilkatsayi);
//					hata = true;
//					}
//					if(arr_method[m].getName().startsWith("TESTSIFIR")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),cozunurluk);	
//						hata = true;
//					}
//					if(arr_method[m].getName().startsWith("TESTOKUHATA")) {
//						func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),cozunurluk);	
//						hata = true;
//					}
//					else {
//					func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"));
//					System.out.println("Func:"+func);
//					nesne.HATAMESAJI = "HATA#Fonksiyon Bulunamadý:"+arr_method[m].getName().;
//					
//					}
//					nesne.getClass().getField(rs.getString("RCODE")).setDouble(nesne, func);
//					System.out.println(rs.getString("RCODE")+" nesne degeri:"+nesne.getClass().getField(rs.getString("RCODE")).getDouble(nesne));
//					toplam += Math.pow(nesne.getClass().getField(rs.getString("RCODE")).getDouble(nesne),2);
//				}
//			}
			
		}
		
		nesne.TVARYANS = toplam;
		nesne.STDUNCER = Math.sqrt(toplam);
		nesne.EXPUNCER = nesne.STDUNCER * 2;
		nesne.EXPUNCER2 = anlamliBasamak(nesne.EXPUNCER);
		
		System.out.println(	nesne.TVARYANS+"\n"+nesne.STDUNCER+"\n"+nesne.EXPUNCER);
		
		con.close();
		}catch(Exception e) {
			
			System.out.println(e);
		
		}
		return nesne;
	}
			
	public static double dagilim(String dagilimname) throws ClassNotFoundException, SQLException {

			Connection con = null;
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
			con = DriverManager.getConnection(sqlConnStr);
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			ResultSet rs = null;
			String query = "";
			double bolen = 0;
			
			query = " SELECT * FROM  EGMOBHT002 WHERE DAGILIMNAME = '"+dagilimname+"'  " ;
			
			rs = st.executeQuery(query);
			while(rs.next()) {
					bolen =  rs.getDouble("BOLEN");
			}
			con.close();
			
		
return bolen;
}
	public static String anlamliBasamak(double d) {
		
//		int sign_fig = 3;
		int sign_fig = basamakSayisi((int) Math.floor(d));
		if(sign_fig<2) {
			sign_fig = 2;
		}else {
			sign_fig+=2;
		}
		
		BigDecimal bd = new BigDecimal(d);
		bd = bd.round(new MathContext(sign_fig));
		double rounded = bd.doubleValue();
		
		int int_sonuc = 0;
		int_sonuc = (int) rounded;
		String sonuc = "";
		if(int_sonuc==rounded) {
			sonuc = int_sonuc+"";
		}else {
			sonuc = rounded+"";
		}
		
		sonuc = sonuc.replace('.', '#');
		if(sonuc.split("#").length>1) {
			if(sonuc.split("#")[1].length()==1 && sonuc.split("#")[0].equals("0")) {
				sonuc =sonuc + "0";
			}
		}
		sonuc = sonuc.replaceAll("#", ".");

//		 System.out.println(toPrecision(a, 2));
		
		return sonuc;
	}
	private static BigDecimal toPrecision(BigDecimal dec, int precision) {
	    String plain = dec.movePointRight(precision).toPlainString();
	    return new BigDecimal(plain.substring(0, plain.indexOf("."))).movePointLeft(precision);
	}
	public static int basamakSayisi(int sayi){
		int sayac = 0;   
		while(sayi > 0 || sayi < 0 ) {
	            sayi /= 10; 
	            sayac++;
	        }
		return sayac;
	}
	
	static String Round_off(double N, double n)
    {
        int h;
        double l, a, b, c, d, e, i, j, m, f, g;
        b = N;
        c = Math.floor(N);
        
        System.out.println(c);
 
        // Counting the no. of digits to the left of decimal point
        // in the given no.
        for (i = 0; b >= 1; ++i)
            b = b / 10;
 
        d = n - i;
        b = N;
        b = b * Math.pow(10, d);
        e = b + 0.5;
        if ((float)e == (float)Math.ceil(b)) {
            f = (Math.ceil(b));
            h = (int)(f - 2);
            if (h % 2 != 0) {
                e = e - 1;
            }
        }
        j = Math.floor(e);
        m = Math.pow(10, d);
        j = j / m;
        System.out.println("The number after rounding-off is "
                           + j);
        return j+"";
    }
	public static double pearsonKorelasyon(String obhtype,String obhno) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(true);
		Statement st = con.createStatement();
		Statement st2 = con.createStatement();
		ResultSet rs = null;
		String query = "";
		
		ArrayList<Double> arr_x = new ArrayList<Double>();
		ArrayList<Double> arr_y = new ArrayList<Double>();
		query = "select * from EGMOBHT009 ";
		rs = st.executeQuery(query);
		while(rs.next()) {
			
			GenisHesap nesne = new GenisHesap();
			nesne = genisHesap(obhtype+"", obhno+"");
			arr_x.add(rs.getDouble("XVALUE"));
			arr_y.add(nesne.getEXPUNCER());	
			st2.executeUpdate("update EGMOBHT009 set YVALUE = "+nesne.getEXPUNCER()+" where XVALUE = "+rs.getDouble("XVALUE"));
			
		}
		
		
		double r = 0;
		double n = arr_x.size();		
		double topX = 0;
		double topY = 0;
		double topX2 = 0;
		double topY2 = 0;
		double topXY = 0;
		
		
		
		for(int i=0;i<arr_x.size();i++) {
			topX += arr_x.get(i);
			topY += arr_y.get(i);
			topXY += arr_x.get(i)*arr_y.get(i);
			topX2 += Math.pow(arr_x.get(i), 2);
			topY2 += Math.pow(arr_y.get(i), 2);
		}
		
		
		
		System.out.println("-------------------\n"+topX+"\n"+topY+"\n"+topXY+"\n"+topX2+"\n"+topY2);
		
		
		r = (n*topXY - (topX * topY)) / Math.sqrt((n*topX2-(topX*topX))*(n*topY2-(topY*topY)));
		
		con.close();
		return r;
	}
	
	public static double standartSapma(String x) {
	
		
		// Bir örnek dizisinde yer alan deðerlerin standart sapmasý yine bu deðerlerin varyansýnýn kareköküne eþittir.
		// Önce varyans hesaplandý , sonra bulunan deðerin karekökü alýndý. 
		double s = Math.sqrt(varyans(x));		
		return s;
	}
	public static double varyans (String x) {
		
		// IAS tan gelen deðerler aralarýna # iþareti koyarak ayýrýlmýþ bir string halinde fonksiyona iletildi.
		
		double v = 0; 				// Fonsiyonun döndüreceði deðer
		double topX = 0;			// Fonksiyona gönderilen deðerler toplamý
		double ortX = 0;			// Fonksiyona gönderilen deðerlerin ortalamasý
		double topX_Xort_kare = 0; 	// Her bir deðerin ortalamadan farkýnýn karelerinin toplamý
		double n = 0;
		ArrayList<Double> arr_x = new ArrayList<Double>();
		
		
		
		if(x.contains("#")) {
			
		// Gelen string te yer alan deðerler bir listeye alýndý bu aþamada deðerlerin toplamý da topX deðiþkenine yazýldý.
			for(int i=0;i<x.split("#").length;i++) {
				arr_x.add( Double.parseDouble(x.split("#")[i]));
				topX += Double.parseDouble(x.split("#")[i]);
			}
			
			// Deðerlerin toplamý eleman sayýsýna bölünerek ortalama hesaplandý.
			ortX = topX / arr_x.size();
			
			
			for(int j=0;j<arr_x.size();j++) {
				
			//	Her bir deðerin ortalamadan farkýnýn karesi bulunarak deðiþkene eklendi.
				topX_Xort_kare += Math.pow(arr_x.get(j)-ortX,2);
			}
			
			// Örnek sayýsýna bakarak n' e mi yoksa n-1 e mi bölüneceðine karar veriliyor. 
			if(arr_x.size()<30 && arr_x.size()>1) {
				n = arr_x.size()-1;
			}
			if(arr_x.size()>=30) {
				n = arr_x.size();
			}
			// n , n-1 hangisinin uygulanacaðýna karar verildi.
			
				v = topX_Xort_kare/n; // Varyans hesaplandý.
		}
		return v;
	}
	public static String ekcDenGetir(String ekc,String caldate,String obhtype,String obhcode,double calismaaraligi) throws ClassNotFoundException, SQLException {
		
		String sertifikano = "";
		String kaldate = "";
		double obh = 0;
		double refcoz = 0;
		double olcumhata = 0;
		double refolcrange = 0;
		double drift = 0;
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(true);
		Statement st = con.createStatement();
		Statement st2 = con.createStatement();
		ResultSet rs = null;
		String query = "select top 1 * from EGT.dbo.EGECIHAZ c join EGT.dbo.EGECIHAZITEM i on c.CKODU = i.CKODU and i.COMPANY = c.COMPANY "
				+" where CALDATE<='"+caldate+"' and CALDATEEND>='"+caldate+"' and NOTUSE = 0 and c.CKODU = '"+ekc+"' order by CALDATE,CREATEDAT desc ";
		rs = st.executeQuery(query);
		while(rs.next()) {
			sertifikano = rs.getString("CERTIFICATE");
			kaldate = rs.getString("CALDATE");
			System.out.println(sertifikano);
		}
		
		if (obhcode.equals("98") && ekc.equals("EKC-05")) {
			query = "select * from EGMREFT001 where COMPANY = '02' and CKODU = '"+ekc+"' and PARAMETRE = 'Çap'  and CERTIFICATE = '"+sertifikano+"' and CALDATE = '"+kaldate+"' ";					
		}
		else
		{
			if (obhcode.equals("87") && ekc.equals("EKC-369")) {
				query = "select * from EGMREFT001 where COMPANY = '02' and CKODU = '"+ekc+"' and PARAMETRE LIKE '%Uzunluk%'  and NOMINAL <= "+calismaaraligi+"  and CERTIFICATE = '"+sertifikano+"' and CALDATE = '"+kaldate+"' ORDER BY NOMINAL ";					
		}
			else
			{
				if (obhcode.equals("3") && ekc.equals("EKC-17")) {
					query = "select * from EGMREFT001 where COMPANY = '02' and CKODU = '"+ekc+"' and PARAMETRE LIKE '%Paralellik%'  and CERTIFICATE = '"+sertifikano+"' and CALDATE = '"+kaldate+"' ORDER BY NOMINAL ";					
			}		else
		if (obhcode.equals("2") && ekc.equals("EKC-17")) {
				query = "select * from EGMREFT001 where COMPANY = '02' and CKODU = '"+ekc+"' and PARAMETRE LIKE '%Paralellik%'  and CERTIFICATE = '"+sertifikano+"' and CALDATE = '"+kaldate+"' ORDER BY NOMINAL ";					
		}		else
		{
		query = "select * from EGMREFT001 where COMPANY = '02' and CKODU = '"+ekc+"' and CERTIFICATE = '"+sertifikano+"' and CALDATE = '"+kaldate+"' ";
		}
		}
		}
		System.out.println("SORGU:"+query);

		rs=st.executeQuery(query);
		while(rs.next())
		{
			obh = rs.getDouble("MEAUNCER");
			olcumhata = rs.getDouble("DIFFER");
			drift = rs.getDouble("DRIFT");
			refcoz = rs.getDouble("REFCOZ");
			refolcrange = rs.getDouble("OLCRANGE");
			System.out.println("CKODU :"+ekc+" MEAUNCER:"+obh);
		}
		con.close();
		return obh+"#"+olcumhata+"#"+drift+"#"+refcoz+"#"+refolcrange;
	}
	public static String dogrusalRegresyon(String X,String Y) {
		
		String formul = "";
		double topX = 0;
		double topY = 0;
		double topX2 = 0;
		double topY2 = 0;
		double topXY = 0;
		double a = 0;
		int n = X.split("#").length;
		
		for(int i=0;i<X.split("#").length;i++) {
			topX += Double.parseDouble(X.split("#")[i]);
			topY += Double.parseDouble(Y.split("#")[i]);
			topXY += Double.parseDouble(X.split("#")[i]) * Double.parseDouble(Y.split("#")[i]);
			topX2 += Math.pow(Double.parseDouble(X.split("#")[i]), 2);
		}
		
		
		
		System.out.println("Top X ="+topX+"\nTop Y="+topY+"\nTopXY ="+topXY+"\nTop X2 "+topX2);
		
//		topY = 0.0013246;
//		topXY = 0.0644053;
		
		double b = (n*topXY - topX*topY) / (n*topX2 - Math.pow(topX, 2));
		
		a = topY/n - b*topX/n;
		formul = "y = "+a+" + "+b+"x";
		return formul;
	}
}
