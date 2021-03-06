package cn.newcapec.jwxt.jcxxgl.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * JwxtJcxxSkjcsj entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="JWXT_JCXX_SKJCSJ"
    ,schema="JWXT"
)

public class JwxtJcxxSkjcsj extends cn.newcapec.function.digitalcampus.common.model.AbstractModel implements java.io.Serializable {


    // Fields    

     private String id;
     private String wb;
     private String jc;
     private String sksj;
     private String xksj;
     private String bz;
     private String cjr;
     private String jlssdw;
     private Date whsj;
     private Date cjsj;


    // Constructors

    /** default constructor */
    public JwxtJcxxSkjcsj() {
    }

	/** minimal constructor */
    public JwxtJcxxSkjcsj(String id, String wb, String jc, String sksj, String xksj, String cjr, String jlssdw, Date cjsj) {
        this.id = id;
        this.wb = wb;
        this.jc = jc;
        this.sksj = sksj;
        this.xksj = xksj;
        this.cjr = cjr;
        this.jlssdw = jlssdw;
        this.cjsj = cjsj;
    }
    
    /** full constructor */
    public JwxtJcxxSkjcsj(String id, String wb, String jc, String sksj, String xksj, String bz, String cjr, String jlssdw, Date whsj, Date cjsj) {
        this.id = id;
        this.wb = wb;
        this.jc = jc;
        this.sksj = sksj;
        this.xksj = xksj;
        this.bz = bz;
        this.cjr = cjr;
        this.jlssdw = jlssdw;
        this.whsj = whsj;
        this.cjsj = cjsj;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="WB", nullable=false, length=32)

    public String getWb() {
        return this.wb;
    }
    
    public void setWb(String wb) {
        this.wb = wb;
    }
    
    @Column(name="JC", nullable=false, length=32)

    public String getJc() {
        return this.jc;
    }
    
    public void setJc(String jc) {
        this.jc = jc;
    }
    
    @Column(name="SKSJ", nullable=false, length=10)

    public String getSksj() {
        return this.sksj;
    }
    
    public void setSksj(String sksj) {
        this.sksj = sksj;
    }
    
    @Column(name="XKSJ", nullable=false, length=10)

    public String getXksj() {
        return this.xksj;
    }
    
    public void setXksj(String xksj) {
        this.xksj = xksj;
    }
    
    @Column(name="BZ", length=2000)

    public String getBz() {
        return this.bz;
    }
    
    public void setBz(String bz) {
        this.bz = bz;
    }
    
    @Column(name="CJR", nullable=false, length=32)

    public String getCjr() {
        return this.cjr;
    }
    
    public void setCjr(String cjr) {
        this.cjr = cjr;
    }
    
    @Column(name="JLSSDW", nullable=false, length=32)

    public String getJlssdw() {
        return this.jlssdw;
    }
    
    public void setJlssdw(String jlssdw) {
        this.jlssdw = jlssdw;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="WHSJ", length=7)

    public Date getWhsj() {
        return this.whsj;
    }
    
    public void setWhsj(Date whsj) {
        this.whsj = whsj;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CJSJ", nullable=false, length=7)

    public Date getCjsj() {
        return this.cjsj;
    }
    
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
   








}