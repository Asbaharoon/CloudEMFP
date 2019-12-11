package model.EO;

import oracle.jbo.domain.Number;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 16 15:35:25 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblPhaseImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PhaseId,
        Name,
        StartDate,
        EndDate,
        Ast,
        IntlCert,
        GlobalGapCert,
        DomExpo,
        DomMarIntv,
        IntlExpo,
        IntlPromCamp,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblPhasePlan,
        TblGrantRate,
        TblCourse,
        TblTeam,
        TblCluster;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PHASEID = AttributesEnum.PhaseId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int INTLCERT = AttributesEnum.IntlCert.index();
    public static final int GLOBALGAPCERT = AttributesEnum.GlobalGapCert.index();
    public static final int DOMEXPO = AttributesEnum.DomExpo.index();
    public static final int DOMMARINTV = AttributesEnum.DomMarIntv.index();
    public static final int INTLEXPO = AttributesEnum.IntlExpo.index();
    public static final int INTLPROMCAMP = AttributesEnum.IntlPromCamp.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLPHASEPLAN = AttributesEnum.TblPhasePlan.index();
    public static final int TBLGRANTRATE = AttributesEnum.TblGrantRate.index();
    public static final int TBLCOURSE = AttributesEnum.TblCourse.index();
    public static final int TBLTEAM = AttributesEnum.TblTeam.index();
    public static final int TBLCLUSTER = AttributesEnum.TblCluster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblPhaseImpl() {
    }

    /**
     * Gets the attribute value for PhaseId, using the alias name PhaseId.
     * @return the value of PhaseId
     */
    public Number getPhaseId() {
        return (Number) getAttributeInternal(PHASEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhaseId.
     * @param value value to set the PhaseId
     */
    public void setPhaseId(Number value) {
        setAttributeInternal(PHASEID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the value of StartDate
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the value of EndDate
     */
    public Timestamp getEndDate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for IntlCert, using the alias name IntlCert.
     * @return the value of IntlCert
     */
    public Number getIntlCert() {
        return (Number) getAttributeInternal(INTLCERT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntlCert.
     * @param value value to set the IntlCert
     */
    public void setIntlCert(Number value) {
        setAttributeInternal(INTLCERT, value);
    }

    /**
     * Gets the attribute value for GlobalGapCert, using the alias name GlobalGapCert.
     * @return the value of GlobalGapCert
     */
    public Number getGlobalGapCert() {
        return (Number) getAttributeInternal(GLOBALGAPCERT);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlobalGapCert.
     * @param value value to set the GlobalGapCert
     */
    public void setGlobalGapCert(Number value) {
        setAttributeInternal(GLOBALGAPCERT, value);
    }

    /**
     * Gets the attribute value for DomExpo, using the alias name DomExpo.
     * @return the value of DomExpo
     */
    public Number getDomExpo() {
        return (Number) getAttributeInternal(DOMEXPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DomExpo.
     * @param value value to set the DomExpo
     */
    public void setDomExpo(Number value) {
        setAttributeInternal(DOMEXPO, value);
    }

    /**
     * Gets the attribute value for DomMarIntv, using the alias name DomMarIntv.
     * @return the value of DomMarIntv
     */
    public Number getDomMarIntv() {
        return (Number) getAttributeInternal(DOMMARINTV);
    }

    /**
     * Sets <code>value</code> as the attribute value for DomMarIntv.
     * @param value value to set the DomMarIntv
     */
    public void setDomMarIntv(Number value) {
        setAttributeInternal(DOMMARINTV, value);
    }

    /**
     * Gets the attribute value for IntlExpo, using the alias name IntlExpo.
     * @return the value of IntlExpo
     */
    public Number getIntlExpo() {
        return (Number) getAttributeInternal(INTLEXPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntlExpo.
     * @param value value to set the IntlExpo
     */
    public void setIntlExpo(Number value) {
        setAttributeInternal(INTLEXPO, value);
    }

    /**
     * Gets the attribute value for IntlPromCamp, using the alias name IntlPromCamp.
     * @return the value of IntlPromCamp
     */
    public Number getIntlPromCamp() {
        return (Number) getAttributeInternal(INTLPROMCAMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for IntlPromCamp.
     * @param value value to set the IntlPromCamp
     */
    public void setIntlPromCamp(Number value) {
        setAttributeInternal(INTLPROMCAMP, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblPhasePlan() {
        return (RowIterator) getAttributeInternal(TBLPHASEPLAN);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantRate() {
        return (RowIterator) getAttributeInternal(TBLGRANTRATE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCourse() {
        return (RowIterator) getAttributeInternal(TBLCOURSE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblTeam() {
        return (RowIterator) getAttributeInternal(TBLTEAM);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCluster() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER);
    }

    /**
     * @param phaseId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number phaseId) {
        return new Key(new Object[] { phaseId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblPhase");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
         try {
             loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
             } else if(operation == DML_UPDATE) {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

