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
// ---    Sat Jul 27 16:44:16 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblGrantRateImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        GrantRateId,
        PhaseId,
        CropId,
        Acre,
        Dated,
        Status,
        Amount,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblCrop,
        TblPhase,
        TblGrantApprovalDetail;
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


    public static final int GRANTRATEID = AttributesEnum.GrantRateId.index();
    public static final int PHASEID = AttributesEnum.PhaseId.index();
    public static final int CROPID = AttributesEnum.CropId.index();
    public static final int ACRE = AttributesEnum.Acre.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLCROP = AttributesEnum.TblCrop.index();
    public static final int TBLPHASE = AttributesEnum.TblPhase.index();
    public static final int TBLGRANTAPPROVALDETAIL = AttributesEnum.TblGrantApprovalDetail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblGrantRateImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblGrantRate");
    }


    /**
     * Gets the attribute value for GrantRateId, using the alias name GrantRateId.
     * @return the value of GrantRateId
     */
    public BigDecimal getGrantRateId() {
        return (BigDecimal) getAttributeInternal(GRANTRATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrantRateId.
     * @param value value to set the GrantRateId
     */
    public void setGrantRateId(BigDecimal value) {
        setAttributeInternal(GRANTRATEID, value);
    }

    /**
     * Gets the attribute value for PhaseId, using the alias name PhaseId.
     * @return the value of PhaseId
     */
    public BigDecimal getPhaseId() {
        return (BigDecimal) getAttributeInternal(PHASEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhaseId.
     * @param value value to set the PhaseId
     */
    public void setPhaseId(BigDecimal value) {
        setAttributeInternal(PHASEID, value);
    }

    /**
     * Gets the attribute value for CropId, using the alias name CropId.
     * @return the value of CropId
     */
    public BigDecimal getCropId() {
        return (BigDecimal) getAttributeInternal(CROPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CropId.
     * @param value value to set the CropId
     */
    public void setCropId(BigDecimal value) {
        setAttributeInternal(CROPID, value);
    }

    /**
     * Gets the attribute value for Acre, using the alias name Acre.
     * @return the value of Acre
     */
    public BigDecimal getAcre() {
        return (BigDecimal) getAttributeInternal(ACRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Acre.
     * @param value value to set the Acre
     */
    public void setAcre(BigDecimal value) {
        setAttributeInternal(ACRE, value);
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
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
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
     * @return the associated entity TblCropImpl.
     */
    public TblCropImpl getTblCrop() {
        return (TblCropImpl) getAttributeInternal(TBLCROP);
    }

    /**
     * Sets <code>value</code> as the associated entity TblCropImpl.
     */
    public void setTblCrop(TblCropImpl value) {
        setAttributeInternal(TBLCROP, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblPhaseImpl getTblPhase() {
        return (TblPhaseImpl) getAttributeInternal(TBLPHASE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPhase(TblPhaseImpl value) {
        setAttributeInternal(TBLPHASE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantApprovalDetail() {
        return (RowIterator) getAttributeInternal(TBLGRANTAPPROVALDETAIL);
    }


    /**
     * @param grantRateId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal grantRateId) {
        return new Key(new Object[] { grantRateId });
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
            } else if(operation == DML_UPDATE) {
            setUpdatedBy(loginId);
        }
        super.doDML(operation, e);
    }
}

