package nezam;
// Generated Mar 17, 2018 1:36:23 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Bime generated by hbm2java
 */
public class Bime  implements java.io.Serializable {


     private Integer id;
     private String sherkat;
     private Integer idMain;
     private String khales;
     private String naKhales;
     private String metrazh;
     private Date sdate;
     private Date edate;

    public Bime() {
    }

	
    public Bime(Integer id) {
        this.id = id;
    }
    public Bime(Integer id, String sherkat, Integer idMain, String khales, String naKhales, String metrazh, Date sdate, Date edate) {
       this.id = id;
       this.sherkat = sherkat;
       this.idMain = idMain;
       this.khales = khales;
       this.naKhales = naKhales;
       this.metrazh = metrazh;
       this.sdate = sdate;
       this.edate = edate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSherkat() {
        return this.sherkat;
    }
    
    public void setSherkat(String sherkat) {
        this.sherkat = sherkat;
    }
    public Integer getIdMain() {
        return this.idMain;
    }
    
    public void setIdMain(Integer idMain) {
        this.idMain = idMain;
    }
    public String getKhales() {
        return this.khales;
    }
    
    public void setKhales(String khales) {
        this.khales = khales;
    }
    public String getNaKhales() {
        return this.naKhales;
    }
    
    public void setNaKhales(String naKhales) {
        this.naKhales = naKhales;
    }
    public String getMetrazh() {
        return this.metrazh;
    }
    
    public void setMetrazh(String metrazh) {
        this.metrazh = metrazh;
    }
    public Date getSdate() {
        return this.sdate;
    }
    
    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
    public Date getEdate() {
        return this.edate;
    }
    
    public void setEdate(Date edate) {
        this.edate = edate;
    }




}


