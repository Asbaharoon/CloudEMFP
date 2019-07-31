package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:25:48 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblTrainingSchMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TrainingSchMasterId,
        ProjCompId,
        CourseId,
        ModuleId,
        Dated,
        Status,
        Mon,
        StDate,
        EnDate,
        Remarks,
        TeamFormationId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblTrainingSchDetail,
        TblCourse,
        TblModule,
        TblProjComp;
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
    public static final int TRAININGSCHMASTERID = AttributesEnum.TrainingSchMasterId.index();
    public static final int PROJCOMPID = AttributesEnum.ProjCompId.index();
    public static final int COURSEID = AttributesEnum.CourseId.index();
    public static final int MODULEID = AttributesEnum.ModuleId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int MON = AttributesEnum.Mon.index();
    public static final int STDATE = AttributesEnum.StDate.index();
    public static final int ENDATE = AttributesEnum.EnDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int TEAMFORMATIONID = AttributesEnum.TeamFormationId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLTRAININGSCHDETAIL = AttributesEnum.TblTrainingSchDetail.index();
    public static final int TBLCOURSE = AttributesEnum.TblCourse.index();
    public static final int TBLMODULE = AttributesEnum.TblModule.index();
    public static final int TBLPROJCOMP = AttributesEnum.TblProjComp.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblTrainingSchMasterImpl() {
    }

    /**
     * Gets the attribute value for TrainingSchMasterId, using the alias name TrainingSchMasterId.
     * @return the value of TrainingSchMasterId
     */
    public BigDecimal getTrainingSchMasterId() {
        return (BigDecimal) getAttributeInternal(TRAININGSCHMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainingSchMasterId.
     * @param value value to set the TrainingSchMasterId
     */
    public void setTrainingSchMasterId(BigDecimal value) {
        setAttributeInternal(TRAININGSCHMASTERID, value);
    }

    /**
     * Gets the attribute value for ProjCompId, using the alias name ProjCompId.
     * @return the value of ProjCompId
     */
    public BigDecimal getProjCompId() {
        return (BigDecimal) getAttributeInternal(PROJCOMPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjCompId.
     * @param value value to set the ProjCompId
     */
    public void setProjCompId(BigDecimal value) {
        setAttributeInternal(PROJCOMPID, value);
    }

    /**
     * Gets the attribute value for CourseId, using the alias name CourseId.
     * @return the value of CourseId
     */
    public BigDecimal getCourseId() {
        return (BigDecimal) getAttributeInternal(COURSEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CourseId.
     * @param value value to set the CourseId
     */
    public void setCourseId(BigDecimal value) {
        setAttributeInternal(COURSEID, value);
    }

    /**
     * Gets the attribute value for ModuleId, using the alias name ModuleId.
     * @return the value of ModuleId
     */
    public BigDecimal getModuleId() {
        return (BigDecimal) getAttributeInternal(MODULEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModuleId.
     * @param value value to set the ModuleId
     */
    public void setModuleId(BigDecimal value) {
        setAttributeInternal(MODULEID, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public BigDecimal getStatus() {
        return (BigDecimal) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(BigDecimal value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for Mon, using the alias name Mon.
     * @return the value of Mon
     */
    public String getMon() {
        return (String) getAttributeInternal(MON);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mon.
     * @param value value to set the Mon
     */
    public void setMon(String value) {
        setAttributeInternal(MON, value);
    }

    /**
     * Gets the attribute value for StDate, using the alias name StDate.
     * @return the value of StDate
     */
    public Timestamp getStDate() {
        return (Timestamp) getAttributeInternal(STDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StDate.
     * @param value value to set the StDate
     */
    public void setStDate(Timestamp value) {
        setAttributeInternal(STDATE, value);
    }

    /**
     * Gets the attribute value for EnDate, using the alias name EnDate.
     * @return the value of EnDate
     */
    public Timestamp getEnDate() {
        return (Timestamp) getAttributeInternal(ENDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnDate.
     * @param value value to set the EnDate
     */
    public void setEnDate(Timestamp value) {
        setAttributeInternal(ENDATE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for TeamFormationId, using the alias name TeamFormationId.
     * @return the value of TeamFormationId
     */
    public BigDecimal getTeamFormationId() {
        return (BigDecimal) getAttributeInternal(TEAMFORMATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TeamFormationId.
     * @param value value to set the TeamFormationId
     */
    public void setTeamFormationId(BigDecimal value) {
        setAttributeInternal(TEAMFORMATIONID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
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
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(BigDecimal value) {
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
    public RowIterator getTblTrainingSchDetail() {
        return (RowIterator) getAttributeInternal(TBLTRAININGSCHDETAIL);
    }

    /**
     * @return the associated entity TblCourseImpl.
     */
    public TblCourseImpl getTblCourse() {
        return (TblCourseImpl) getAttributeInternal(TBLCOURSE);
    }

    /**
     * Sets <code>value</code> as the associated entity TblCourseImpl.
     */
    public void setTblCourse(TblCourseImpl value) {
        setAttributeInternal(TBLCOURSE, value);
    }

    /**
     * @return the associated entity TblModuleImpl.
     */
    public TblModuleImpl getTblModule() {
        return (TblModuleImpl) getAttributeInternal(TBLMODULE);
    }

    /**
     * Sets <code>value</code> as the associated entity TblModuleImpl.
     */
    public void setTblModule(TblModuleImpl value) {
        setAttributeInternal(TBLMODULE, value);
    }

    /**
     * @return the associated entity TblProjCompImpl.
     */
    public TblProjCompImpl getTblProjComp() {
        return (TblProjCompImpl) getAttributeInternal(TBLPROJCOMP);
    }

    /**
     * Sets <code>value</code> as the associated entity TblProjCompImpl.
     */
    public void setTblProjComp(TblProjCompImpl value) {
        setAttributeInternal(TBLPROJCOMP, value);
    }

    /**
     * @param trainingSchMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal trainingSchMasterId) {
        return new Key(new Object[] { trainingSchMasterId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblTrainingSchMaster");
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
        BigDecimal loginId = null;
         try {
             loginId = new BigDecimal((String) ADFContext.getCurrent().getSessionScope().get("sessUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
         } else {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

