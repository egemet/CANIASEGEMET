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
import java.util.ArrayList;

public class Hesap {
  public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException { 
	
//	System.out.println(genisHesap("1","1"));

//	  System.out.println(anlamliBasamak(100.245));
//	  System.out.println(anlamliBasamak(0.245));
//	  System.out.println(anlamliBasamak(0.00245));
//	  System.out.println(anlamliBasamak(0.04051));
//	  System.out.println(anlamliBasamak(2345.09));
//	  System.out.println(anlamliBasamak(24.8514));
//	  System.out.println(anlamliBasamak(100.0023));
//	  
//	  System.out.println(anlamliBasamak(0.299));
	 
//	  System.out.println(pearsonKorelasyon("1", "1"));
	  
	  System.out.println("Standart Sapma : "+standartSapma("10#8#10#8#8#4#"));
	  System.out.println("Varyans : "+varyans("10#8#10#8#8#4#"));
	  
//	  System.out.println(anlamliBasamak(11.02302));
//	  System.out.println(anlamliBasamak(11.52));
//	  System.out.println(anlamliBasamak(0.02302));
//	  System.out.println(anlamliBasamak(0.002));
//	  System.out.println(anlamliBasamak(11125.02302));
//	  System.out.println(anlamliBasamak(11.02302));
//	  System.out.println(anlamliBasamak(-0.407302));
//	  System.out.println(anlamliBasamak(-0.402302));
	
  }
  
	public static double REFBEL(double bolen) throws ClassNotFoundException, SQLException {
				
				return Math.sqrt(Math.pow(56,2)+Math.pow(0.4*1000,2))/1000/bolen;
	
	}
	
	public static double OLCHATA(double bolen) throws ClassNotFoundException, SQLException {
		
		return 2.977/bolen;
}

	public static double BIRLESHATA( double bolen) throws ClassNotFoundException, SQLException {
		
		return 0/bolen;
}

	public static double REFKAYMA(double bolen) throws ClassNotFoundException, SQLException {
	
		return ((0.02+0.25*1000/1000)*3*2)/bolen;
}

	public static double TEKRAR(double bolen) throws ClassNotFoundException, SQLException {
		
		return 0/bolen;
}

	public static double SICFARKI(double bolen,double calismaaraligi) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
//		double calismaraligi = 0;
		double isilkatsayi = 0;
		
//		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='�al��ma Aral���' ";
//		rs = st.executeQuery(query);
//		while(rs.next()) {
//				
//			calismaraligi = rs.getDouble("DEGER");
//		
//		}
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Is�l Genle�me' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			isilkatsayi = rs.getDouble("DEGER");
		
		}
		
		return 1*isilkatsayi*calismaaraligi*1000/bolen;
}
	
	public static double SICFARKITESTREF(double bolen,double calismaaraligi) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
//		double calismaraligi = 0;
		double isilkatsayi = 0;
		
		
//		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='�al��ma Aral���' ";
//		rs = st.executeQuery(query);
//		while(rs.next()) {
//				
//			calismaraligi = rs.getDouble("DEGER");
//		
//		}

		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Is�l Genle�me' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			isilkatsayi = rs.getDouble("DEGER");
		
		}
		isilkatsayi = isilkatsayi * 0.2;
		
		return 1*isilkatsayi*calismaaraligi*1000/bolen;
}

	public static double TESTSIFIR(double bolen) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
		double cozunurluk = 0;
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='��z�n�rl�k' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			cozunurluk = rs.getDouble("DEGER");
		
		}
		
		
		return cozunurluk*1000/2/bolen;
}

	public static double TESTOKUHATA(double bolen) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
		double cozunurluk = 0;
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='��z�n�rl�k' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			cozunurluk = rs.getDouble("DEGER");
		
		}
		
		return cozunurluk*1000/2/bolen;
		
}
	  
		public static double TVARYANS(String degerler) throws ClassNotFoundException, SQLException {
		
		double toplam=0;
		String[] arr_varyans=degerler.split("#");
		for(int i=0; i<arr_varyans.length; i++) {
		toplam +=Math.pow(Double.parseDouble(arr_varyans[i]),2);			
		}
			return toplam;
		
		}
		
	public static GenisHesap genisHesap(String obhtype,String obhno,double calismaaraligi) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";
		GenisHesap nesne = new GenisHesap();
		
		double toplam = 0;
		
		query = "select E4.*,E2.DAGILIMNAME,E2.BOLEN from EGMOBHT004 E4 JOIN EGMOBHT002 E2 ON E4.DAGILIM = E2.DAGILIMNO  where E4.OBHTYPE="+obhtype+" and E4.OBHNO = "+obhno+" and E4.RCODE not in ('TVARYANS','STDUNCER','EXPUNCER','EXPUNCER2') ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
		Hesap hnesne = new Hesap();
		
		Method[] arr_method = hnesne.getClass().getDeclaredMethods();
			
			for(int m=0;m<arr_method.length;m++) {
				System.out.println("Method : "+arr_method[m].getName());
				if(arr_method[m].getName().equals(rs.getString("RCODE"))) {
					double func = 0;
					if(arr_method[m].getName().startsWith("SICFARKI")) {
					func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"),calismaaraligi);	
					}else {
					func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"));
					System.out.println("Func:"+func);
					}
					nesne.getClass().getField(rs.getString("RCODE")).setDouble(nesne, func);
					System.out.println(rs.getString("RCODE")+" nesne degeri:"+nesne.getClass().getField(rs.getString("RCODE")).getDouble(nesne));
					toplam += Math.pow(nesne.getClass().getField(rs.getString("RCODE")).getDouble(nesne),2);
				}
			}
			
		}
		
		System.out.println(	nesne.REFBEL);
		
		nesne.TVARYANS = toplam;
		nesne.STDUNCER = Math.sqrt(toplam);
		nesne.EXPUNCER = nesne.STDUNCER * 2;
		nesne.EXPUNCER2 = anlamliBasamak(nesne.EXPUNCER);
		
		System.out.println(	nesne.TVARYANS+"\n"+nesne.STDUNCER+"\n"+nesne.EXPUNCER);
		
		con.close();
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
			nesne = genisHesap(obhtype, obhno,rs.getDouble("XVALUE"));
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
	
		
		// Bir �rnek dizisinde yer alan de�erlerin standart sapmas� yine bu de�erlerin varyans�n�n karek�k�ne e�ittir.
		// �nce varyans hesapland� , sonra bulunan de�erin karek�k� al�nd�. 
		double s = Math.sqrt(varyans(x));		
		return s;
	}
	public static double varyans (String x) {
		
		// IAS tan gelen de�erler aralar�na # i�areti koyarak ay�r�lm�� bir string halinde fonksiyona iletildi.
		
		double v = 0; 				// Fonsiyonun d�nd�rece�i de�er
		double topX = 0;			// Fonksiyona g�nderilen de�erler toplam�
		double ortX = 0;			// Fonksiyona g�nderilen de�erlerin ortalamas�
		double topX_Xort_kare = 0; 	// Her bir de�erin ortalamadan fark�n�n karelerinin toplam�
		double n = 0;
		ArrayList<Double> arr_x = new ArrayList<Double>();
		
		
		
		if(x.contains("#")) {
			
		// Gelen string te yer alan de�erler bir listeye al�nd� bu a�amada de�erlerin toplam� da topX de�i�kenine yaz�ld�.
			for(int i=0;i<x.split("#").length;i++) {
				arr_x.add( Double.parseDouble(x.split("#")[i]));
				topX += Double.parseDouble(x.split("#")[i]);
			}
			
			// De�erlerin toplam� eleman say�s�na b�l�nerek ortalama hesapland�.
			ortX = topX / arr_x.size();
			
			
			for(int j=0;j<arr_x.size();j++) {
				
			//	Her bir de�erin ortalamadan fark�n�n karesi bulunarak de�i�kene eklendi.
				topX_Xort_kare += Math.pow(arr_x.get(j)-ortX,2);
			}
			
			// �rnek say�s�na bakarak n' e mi yoksa n-1 e mi b�l�nece�ine karar veriliyor. 
			if(arr_x.size()<30 && arr_x.size()>1) {
				n = arr_x.size()-1;
			}
			if(arr_x.size()>=30) {
				n = arr_x.size();
			}
			// n , n-1 hangisinin uygulanaca��na karar verildi.
			
				v = topX_Xort_kare/n; // Varyans hesapland�.
		}
		return v;
	}	
}

