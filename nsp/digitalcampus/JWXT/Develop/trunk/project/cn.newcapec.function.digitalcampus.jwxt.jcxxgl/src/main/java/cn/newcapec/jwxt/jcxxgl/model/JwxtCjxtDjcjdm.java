package cn.newcapec.jwxt.jcxxgl.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * JwxtCjxtDjcjdm entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="JWXT_CJXT_DJCJDM"
    ,schema="JWXT"
)

public class JwxtCjxtDjcjdm extends cn.newcapec.function.digitalcampus.common.model.AbstractModel implements java.io.Serializable {


    // Fields    

     private String id;
     private String dm;
     private String mc;
     private String cjr;
     private String jlssdw;
     private Date whsj;
     private Date cjsj;


    // Constructors

    /** default constructor */
    public JwxtCjxtDjcjdm() {
    }

	/** minimal constructor */
    public JwxtCjxtDjcjdm(String id, String dm, String mc, String cjr, String jlssdw, Date cjsj) {
        this.id = id;
        this.dm = dm;
        this.mc = mc;
        this.cjr = cjr;
        this.jlssdw = jlssdw;
        this.cjsj = cjsj;
    }
    
    /** full constructor */
    public JwxtCjxtDjcjdm(String id, String dm, String mc, String cjr, String jlssdw, Date whsj, Date cjsj) {
        this.id = id;
        this.dm = dm;
        this.mc = mc;
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
    
    @Column(name="DM", nullable=false, length=2)

    public String getDm() {
        return this.dm;
    }
    
    public void setDm(String dm) {
        this.dm = dm;
    }
    
    @Column(name="MC", nullable=false, length=200)

    public String getMc() {
        return this.mc;
    }
    
    public void setMc(String mc) {
        this.mc = mc;
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