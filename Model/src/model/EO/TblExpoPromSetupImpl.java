package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 12:33:50 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblExpoPromSetupImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ExpoSchId,
        ExpoPromSetupId,
        FDate,
        TDate,
        NoOfDays,
        ExpoSetupVenue,
        STime,
        ETime,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblExpoPromDetail;
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
    public static final int EXPOSCHID = AttributesEnum.ExpoSchId.index();
    public static final int EXPOPROMSETUPID = AttributesEnum.ExpoPromSetupId.index();
    public static final int FDATE = AttributesEnum.FDate.index();
    public static final int TDATE = AttributesEnum.TDate.index();
    public static final int NOOFDAYS = AttributesEnum.NoOfDays.index();
    public static final int EXPOSETUPVENUE = AttributesEnum.ExpoSetupVenue.index();
    public static final int STIME = AttributesEnum.STime.index();
    public static final int ETIME = AttributesEnum.ETime.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLEXPOPROMDETAIL = AttributesEnum.TblExpoPromDetail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblExpoPromSetupImpl() {
    }

    /**
     * Gets the attribute value for ExpoSchId, using the alias name ExpoSchId.
     * @return the value of ExpoSchId
     */
    public BigDecimal getExpoSchId() {
        return (BigDecimal) getAttributeInternal(EXPOSCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoSchId.
     * @param value value to set the ExpoSchId
     */
    public void setExpoSchId(BigDecimal value) {
        setAttributeInternal(EXPOSCHID, value);
    }

    /**
     * Gets the attribute value for ExpoPromSetupId, using the alias name ExpoPromSetupId.
     * @return the value of ExpoPromSetupId
     */
    public BigDecimal getExpoPromSetupId() {
        return (BigDecimal) getAttributeInternal(EXPOPROMSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoPromSetupId.
     * @param value value to set the ExpoPromSetupId
     */
    public void setExpoPromSetupId(BigDecimal value) {
        setAttributeInternal(EXPOPROMSETUPID, value);
    }

    /**
     * Gets the attribute value for FDate, using the alias name FDate.
     * @return the value of FDate
     */
    public Timestamp getFDate() {
        return (Timestamp) getAttributeInternal(FDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FDate.
     * @param value value to set the FDate
     */
    public void setFDate(Timestamp value) {
        setAttributeInternal(FDATE, value);
    }

    /**
     * Gets the attribute value for TDate, using the alias name TDate.
     * @return the value of TDate
     */
    public Timestamp getTDate() {
        return (Timestamp) getAttributeInternal(TDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TDate.
     * @param value value to set the TDate
     */
    public void setTDate(Timestamp value) {
        setAttributeInternal(TDATE, value);
    }

    /**
     * Gets the attribute value for NoOfDays, using the alias name NoOfDays.
     * @return the value of NoOfDays
     */
    public BigDecimal getNoOfDays() {
        return (BigDecimal) getAttributeInternal(NOOFDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoOfDays.
     * @param value value to set the NoOfDays
     */
    public void setNoOfDays(BigDecimal value) {
        setAttributeInternal(NOOFDAYS, value);
    }

    /**
     * Gets the attribute value for ExpoSetupVenue, using the alias name ExpoSetupVenue.
     * @return the value of ExpoSetupVenue
     */
    public String getExpoSetupVenue() {
        return (String) getAttributeInternal(EXPOSETUPVENUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpoSetupVenue.
     * @param value value to set the ExpoSetupVenue
     */
    public void setExpoSetupVenue(String value) {
        setAttributeInternal(EXPOSETUPVENUE, value);
    }

    /**
     * Gets the attribute value for STime, using the alias name STime.
     * @return the value of STime
     */
    public Timestamp getSTime() {
        return (Timestamp) getAttributeInternal(STIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for STime.
     * @param value value to set the STime
     */
    public void setSTime(Timestamp value) {
        setAttributeInternal(STIME, value);
    }

    /**
     * Gets the attribute value for ETime, using the alias name ETime.
     * @return the value of ETime
     */
    public Timestamp getETime() {
        return (Timestamp) getAttributeInternal(ETIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ETime.
     * @param value value to set the ETime
     */
    public void setETime(Timestamp value) {
        setAttributeInternal(ETIME, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
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
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblExpoPromDetail() {
        return (RowIterator) getAttributeInternal(TBLEXPOPROMDETAIL);
    }

    /**
     * @param expoPromSetupId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal expoPromSetupId) {
        return new Key(new Object[] { expoPromSetupId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblExpoPromSetup");
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

